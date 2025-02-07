
package net.mcreator.superiorstructures.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.superiorstructures.procedures.HookshotUpPressedProcedure;
import net.mcreator.superiorstructures.procedures.HookshotDirectionResetProcedure;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record HookshotUpMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<HookshotUpMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(SuperiorstructuresMod.MODID, "key_hookshot_up"));
	public static final StreamCodec<RegistryFriendlyByteBuf, HookshotUpMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, HookshotUpMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new HookshotUpMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<HookshotUpMessage> type() {
		return TYPE;
	}

	public static void handleData(final HookshotUpMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			HookshotUpPressedProcedure.execute(entity);
		}
		if (type == 1) {

			HookshotDirectionResetProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SuperiorstructuresMod.addNetworkMessage(HookshotUpMessage.TYPE, HookshotUpMessage.STREAM_CODEC, HookshotUpMessage::handleData);
	}
}
