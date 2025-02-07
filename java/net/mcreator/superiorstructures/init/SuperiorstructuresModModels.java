
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.superiorstructures.client.model.Modelwebball;
import net.mcreator.superiorstructures.client.model.Modelspear_base;
import net.mcreator.superiorstructures.client.model.Modelpuzzle_peg;
import net.mcreator.superiorstructures.client.model.Modelpush_block;
import net.mcreator.superiorstructures.client.model.Modelphase_orb;
import net.mcreator.superiorstructures.client.model.Modelphase_ball;
import net.mcreator.superiorstructures.client.model.Modelorb_model;
import net.mcreator.superiorstructures.client.model.Modelhookshot_ball;
import net.mcreator.superiorstructures.client.model.Modelflavor_node;
import net.mcreator.superiorstructures.client.model.Modelfake_iron_golem;
import net.mcreator.superiorstructures.client.model.Modeldetected_block;
import net.mcreator.superiorstructures.client.model.Modelcustom_model;
import net.mcreator.superiorstructures.client.model.Modelcopper_golem_unpowered;
import net.mcreator.superiorstructures.client.model.Modelcopper_golem_powered;
import net.mcreator.superiorstructures.client.model.Modelcopper_golem_old;
import net.mcreator.superiorstructures.client.model.Modelchakram_entity;
import net.mcreator.superiorstructures.client.model.Modelchain_link;
import net.mcreator.superiorstructures.client.model.Modelchain_ball;
import net.mcreator.superiorstructures.client.model.Modelcatalyst_model;
import net.mcreator.superiorstructures.client.model.Modelbig_catalyst;
import net.mcreator.superiorstructures.client.model.Modelbeam_model;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SuperiorstructuresModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcopper_golem_powered.LAYER_LOCATION, Modelcopper_golem_powered::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_golem_old.LAYER_LOCATION, Modelcopper_golem_old::createBodyLayer);
		event.registerLayerDefinition(Modelpush_block.LAYER_LOCATION, Modelpush_block::createBodyLayer);
		event.registerLayerDefinition(Modelchakram_entity.LAYER_LOCATION, Modelchakram_entity::createBodyLayer);
		event.registerLayerDefinition(Modelphase_ball.LAYER_LOCATION, Modelphase_ball::createBodyLayer);
		event.registerLayerDefinition(Modelphase_orb.LAYER_LOCATION, Modelphase_orb::createBodyLayer);
		event.registerLayerDefinition(Modelchain_ball.LAYER_LOCATION, Modelchain_ball::createBodyLayer);
		event.registerLayerDefinition(Modelpuzzle_peg.LAYER_LOCATION, Modelpuzzle_peg::createBodyLayer);
		event.registerLayerDefinition(Modelbig_catalyst.LAYER_LOCATION, Modelbig_catalyst::createBodyLayer);
		event.registerLayerDefinition(Modelwebball.LAYER_LOCATION, Modelwebball::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelcatalyst_model.LAYER_LOCATION, Modelcatalyst_model::createBodyLayer);
		event.registerLayerDefinition(Modelcopper_golem_unpowered.LAYER_LOCATION, Modelcopper_golem_unpowered::createBodyLayer);
		event.registerLayerDefinition(Modelchain_link.LAYER_LOCATION, Modelchain_link::createBodyLayer);
		event.registerLayerDefinition(Modelbeam_model.LAYER_LOCATION, Modelbeam_model::createBodyLayer);
		event.registerLayerDefinition(Modelspear_base.LAYER_LOCATION, Modelspear_base::createBodyLayer);
		event.registerLayerDefinition(Modelhookshot_ball.LAYER_LOCATION, Modelhookshot_ball::createBodyLayer);
		event.registerLayerDefinition(Modelorb_model.LAYER_LOCATION, Modelorb_model::createBodyLayer);
		event.registerLayerDefinition(Modelfake_iron_golem.LAYER_LOCATION, Modelfake_iron_golem::createBodyLayer);
		event.registerLayerDefinition(Modeldetected_block.LAYER_LOCATION, Modeldetected_block::createBodyLayer);
		event.registerLayerDefinition(Modelflavor_node.LAYER_LOCATION, Modelflavor_node::createBodyLayer);
	}
}
