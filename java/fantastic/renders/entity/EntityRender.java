package fantastic.renders.entity;


import cpw.mods.fml.client.registry.RenderingRegistry;
import fantastic.entities.EntityBasicFish;
import fantastic.entities.EntityBlooper;
import fantastic.entities.EntityCatfish;
import fantastic.entities.EntityCaveFish;
import fantastic.entities.EntityClam;
import fantastic.entities.EntityCreepedo;
import fantastic.entities.EntityFeeder;
import fantastic.entities.EntityFungus;
import fantastic.entities.EntityLobster;
import fantastic.entities.EntityMantaRay;
import fantastic.entities.EntityMossy;
import fantastic.entities.EntityNurseShark;
import fantastic.entities.EntityPatrick;
import fantastic.entities.EntitySailfish;
import fantastic.entities.EntitySalmon;
import fantastic.entities.EntitySandStriker;
import fantastic.entities.EntitySmallCrab;
import fantastic.entities.EntityStarfish;
import fantastic.entities.EntityTuna;
import fantastic.entities.EntityWoodenFishHook;
import fantastic.renders.models.ModelBasicFish;
import fantastic.renders.models.ModelBlooper;
import fantastic.renders.models.ModelClam;
import fantastic.renders.models.ModelLobster;
import fantastic.renders.models.ModelLongSnout;
import fantastic.renders.models.ModelMantaRay;
import fantastic.renders.models.ModelNurseShark;
import fantastic.renders.models.ModelPatrick;
import fantastic.renders.models.ModelSmallCrab;
import fantastic.renders.models.ModelStarfish;

public class EntityRender
{

	public static void renderEntities()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBasicFish.class, new RenderBasicFish(new ModelBasicFish(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveFish.class, new RenderCaveFish(new ModelBasicFish(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLobster.class, new RenderLobster(new ModelLobster(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityClam.class, new RenderClam(new ModelClam(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySalmon.class, new RenderSalmon(new ModelBasicFish(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityStarfish.class, new RenderStarfish(new ModelStarfish(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFeeder.class, new RenderFeeder(new ModelBasicFish(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTuna.class, new RenderTuna(new ModelBasicFish(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMossy.class, new RenderMossy(new ModelBasicFish(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFungus.class, new RenderFungus(new ModelBasicFish(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySailfish.class, new RenderSailfish(new ModelLongSnout(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPatrick.class, new RenderPatrick(new ModelPatrick(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySmallCrab.class, new RenderSmallCrab(new ModelSmallCrab(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlooper.class, new RenderBlooper(new ModelBlooper(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCreepedo.class, new RenderCreepedo(new ModelBasicFish(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNurseShark.class, new RenderNurseShark(new ModelNurseShark(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMantaRay.class, new RenderMantaRay(new ModelMantaRay(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCatfish.class, new RenderCatfish(new ModelLongSnout(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySandStriker.class, new RenderSandStriker(new ModelLongSnout(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityWoodenFishHook.class, new RenderWoodenFishHook());
		
		
	}

}