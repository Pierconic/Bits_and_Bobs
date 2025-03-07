
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
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.world.inventory.ArtificeMenu;
import net.mcreator.superiorstructures.procedures.Choice3Procedure;
import net.mcreator.superiorstructures.procedures.Choice2Procedure;
import net.mcreator.superiorstructures.procedures.Choice1Procedure;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ArtificeSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) implements CustomPacketPayload {

	public static final Type<ArtificeSlotMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(SuperiorstructuresMod.MODID, "artifice_slots"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ArtificeSlotMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ArtificeSlotMessage message) -> {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}, (RegistryFriendlyByteBuf buffer) -> new ArtificeSlotMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<ArtificeSlotMessage> type() {
		return TYPE;
	}

	public static void handleData(final ArtificeSlotMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ArtificeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 3 && changeType == 1) {

			Choice1Procedure.execute(world, x, y, z, entity);
		}
		if (slot == 3 && changeType == 2) {
			int amount = meta;

			Choice1Procedure.execute(world, x, y, z, entity);
		}
		if (slot == 4 && changeType == 1) {

			Choice2Procedure.execute(world, x, y, z, entity);
		}
		if (slot == 4 && changeType == 2) {
			int amount = meta;

			Choice2Procedure.execute(world, x, y, z, entity);
		}
		if (slot == 5 && changeType == 1) {

			Choice3Procedure.execute(world, x, y, z, entity);
		}
		if (slot == 5 && changeType == 2) {
			int amount = meta;

			Choice3Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SuperiorstructuresMod.addNetworkMessage(ArtificeSlotMessage.TYPE, ArtificeSlotMessage.STREAM_CODEC, ArtificeSlotMessage::handleData);
	}
}
