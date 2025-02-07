
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.superiorstructures.network.HookshotUpMessage;
import net.mcreator.superiorstructures.network.HookshotDownMessage;
import net.mcreator.superiorstructures.network.GhostModeMessage;
import net.mcreator.superiorstructures.network.FireCannonMessage;
import net.mcreator.superiorstructures.network.BoostRightMessage;
import net.mcreator.superiorstructures.network.BoostLeftMessage;
import net.mcreator.superiorstructures.network.BoostJumpMessage;
import net.mcreator.superiorstructures.network.BoostForwardMessage;
import net.mcreator.superiorstructures.network.BoostBackwardMessage;
import net.mcreator.superiorstructures.network.AscendUpwardsMessage;
import net.mcreator.superiorstructures.network.AscendRightMessage;
import net.mcreator.superiorstructures.network.AscendLeftMessage;
import net.mcreator.superiorstructures.network.AscendForwardsMessage;
import net.mcreator.superiorstructures.network.AscendDownwardsMessage;
import net.mcreator.superiorstructures.network.AscendBackwardsMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SuperiorstructuresModKeyMappings {
	public static final KeyMapping BOOST_JUMP = new KeyMapping("key.superiorstructures.boost_jump", GLFW.GLFW_KEY_SPACE, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new BoostJumpMessage(0, 0));
				BoostJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BOOST_FORWARD = new KeyMapping("key.superiorstructures.boost_forward", GLFW.GLFW_KEY_W, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new BoostForwardMessage(0, 0));
				BoostForwardMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BOOST_LEFT = new KeyMapping("key.superiorstructures.boost_left", GLFW.GLFW_KEY_A, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new BoostLeftMessage(0, 0));
				BoostLeftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BOOST_RIGHT = new KeyMapping("key.superiorstructures.boost_right", GLFW.GLFW_KEY_D, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new BoostRightMessage(0, 0));
				BoostRightMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BOOST_BACKWARD = new KeyMapping("key.superiorstructures.boost_backward", GLFW.GLFW_KEY_S, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new BoostBackwardMessage(0, 0));
				BoostBackwardMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FIRE_CANNON = new KeyMapping("key.superiorstructures.fire_cannon", GLFW.GLFW_KEY_SPACE, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new FireCannonMessage(0, 0));
				FireCannonMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GHOST_MODE = new KeyMapping("key.superiorstructures.ghost_mode", GLFW.GLFW_KEY_J, "key.categories.spectator") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new GhostModeMessage(0, 0));
				GhostModeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				GHOST_MODE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - GHOST_MODE_LASTPRESS);
				PacketDistributor.sendToServer(new GhostModeMessage(1, dt));
				GhostModeMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HOOKSHOT_DOWN = new KeyMapping("key.superiorstructures.hookshot_down", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.hookshot_down") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new HookshotDownMessage(0, 0));
				HookshotDownMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				HOOKSHOT_DOWN_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - HOOKSHOT_DOWN_LASTPRESS);
				PacketDistributor.sendToServer(new HookshotDownMessage(1, dt));
				HookshotDownMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HOOKSHOT_UP = new KeyMapping("key.superiorstructures.hookshot_up", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.hookshot_up") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new HookshotUpMessage(0, 0));
				HookshotUpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				HOOKSHOT_UP_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - HOOKSHOT_UP_LASTPRESS);
				PacketDistributor.sendToServer(new HookshotUpMessage(1, dt));
				HookshotUpMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ASCEND_UPWARDS = new KeyMapping("key.superiorstructures.ascend_upwards", GLFW.GLFW_KEY_SPACE, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new AscendUpwardsMessage(0, 0));
				AscendUpwardsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ASCEND_UPWARDS_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ASCEND_UPWARDS_LASTPRESS);
				PacketDistributor.sendToServer(new AscendUpwardsMessage(1, dt));
				AscendUpwardsMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ASCEND_DOWNWARDS = new KeyMapping("key.superiorstructures.ascend_downwards", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new AscendDownwardsMessage(0, 0));
				AscendDownwardsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ASCEND_DOWNWARDS_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ASCEND_DOWNWARDS_LASTPRESS);
				PacketDistributor.sendToServer(new AscendDownwardsMessage(1, dt));
				AscendDownwardsMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ASCEND_FORWARDS = new KeyMapping("key.superiorstructures.ascend_forwards", GLFW.GLFW_KEY_W, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new AscendForwardsMessage(0, 0));
				AscendForwardsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ASCEND_FORWARDS_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ASCEND_FORWARDS_LASTPRESS);
				PacketDistributor.sendToServer(new AscendForwardsMessage(1, dt));
				AscendForwardsMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ASCEND_BACKWARDS = new KeyMapping("key.superiorstructures.ascend_backwards", GLFW.GLFW_KEY_S, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new AscendBackwardsMessage(0, 0));
				AscendBackwardsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ASCEND_BACKWARDS_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ASCEND_BACKWARDS_LASTPRESS);
				PacketDistributor.sendToServer(new AscendBackwardsMessage(1, dt));
				AscendBackwardsMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ASCEND_LEFT = new KeyMapping("key.superiorstructures.ascend_left", GLFW.GLFW_KEY_A, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new AscendLeftMessage(0, 0));
				AscendLeftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ASCEND_LEFT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ASCEND_LEFT_LASTPRESS);
				PacketDistributor.sendToServer(new AscendLeftMessage(1, dt));
				AscendLeftMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ASCEND_RIGHT = new KeyMapping("key.superiorstructures.ascend_right", GLFW.GLFW_KEY_D, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new AscendRightMessage(0, 0));
				AscendRightMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ASCEND_RIGHT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ASCEND_RIGHT_LASTPRESS);
				PacketDistributor.sendToServer(new AscendRightMessage(1, dt));
				AscendRightMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long GHOST_MODE_LASTPRESS = 0;
	private static long HOOKSHOT_DOWN_LASTPRESS = 0;
	private static long HOOKSHOT_UP_LASTPRESS = 0;
	private static long ASCEND_UPWARDS_LASTPRESS = 0;
	private static long ASCEND_DOWNWARDS_LASTPRESS = 0;
	private static long ASCEND_FORWARDS_LASTPRESS = 0;
	private static long ASCEND_BACKWARDS_LASTPRESS = 0;
	private static long ASCEND_LEFT_LASTPRESS = 0;
	private static long ASCEND_RIGHT_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(BOOST_JUMP);
		event.register(BOOST_FORWARD);
		event.register(BOOST_LEFT);
		event.register(BOOST_RIGHT);
		event.register(BOOST_BACKWARD);
		event.register(FIRE_CANNON);
		event.register(GHOST_MODE);
		event.register(HOOKSHOT_DOWN);
		event.register(HOOKSHOT_UP);
		event.register(ASCEND_UPWARDS);
		event.register(ASCEND_DOWNWARDS);
		event.register(ASCEND_FORWARDS);
		event.register(ASCEND_BACKWARDS);
		event.register(ASCEND_LEFT);
		event.register(ASCEND_RIGHT);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				BOOST_JUMP.consumeClick();
				BOOST_FORWARD.consumeClick();
				BOOST_LEFT.consumeClick();
				BOOST_RIGHT.consumeClick();
				BOOST_BACKWARD.consumeClick();
				FIRE_CANNON.consumeClick();
				GHOST_MODE.consumeClick();
				HOOKSHOT_DOWN.consumeClick();
				HOOKSHOT_UP.consumeClick();
				ASCEND_UPWARDS.consumeClick();
				ASCEND_DOWNWARDS.consumeClick();
				ASCEND_FORWARDS.consumeClick();
				ASCEND_BACKWARDS.consumeClick();
				ASCEND_LEFT.consumeClick();
				ASCEND_RIGHT.consumeClick();
			}
		}
	}
}
