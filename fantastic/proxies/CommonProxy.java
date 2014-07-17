package fantastic.proxies;

import java.util.EnumSet;
import java.util.HashMap;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.server.FMLServerHandler;
import fantastic.FantasticIds;
import fantastic.events.TickHandler;
import fantastic.events.VillagerTradeHandler;
import fantastic.world.ComponentFishermanHut;
import fantastic.world.FishermanHandler;

public class CommonProxy implements IGuiHandler
{

	private static HashMap<String, NBTTagCompound> extendedEntityData = new HashMap<String, NBTTagCompound>();

	public void initRenderers()
	{

	}

	public void registerServerTickHandler()
	{
		TickRegistry.registerTickHandler(new TickHandler(), Side.SERVER);

	}

	public int addArmor(String string)
	{
		return 0;
	}

	@Override
	public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	@Override
	public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	public void storeEntityData(String name, NBTTagCompound compound)
	{
		extendedEntityData.put(name, compound);
	}

	public NBTTagCompound getEntityData(String name)
	{
		NBTTagCompound entityData = extendedEntityData.get(name);
		extendedEntityData.remove(name);
		return entityData;
	}

	public void loadParts()
	{
//		BleachItems.init();
//		BleachItems.addNames();
//
//		BleachBlocks.init();
//		BleachBlocks.addNames();
//
//		Entities.addNames();
//		Entities.init();
//
//		Armor.init();
//		Armor.addNames();
	}

	public void loadGUI()
	{

	}

	public void loadKeys()
	{

	}

	public void initZanpakutoRenderers()
	{

	}

	public void sendToPlayer(EntityPlayerMP player, Packet packet)
	{
		player.playerNetServerHandler.sendPacketToPlayer(packet);
	}

	public void sendToPlayers(Packet packet, World world, int x, int y, int z, int maxDistance)
	{
		if (world == null)
		{
			WorldServer worlds[] = FMLServerHandler.instance().getServer().worldServers;
			for (int i = 0; i < worlds.length; i++)
				for (int j = 0; j < worlds[i].playerEntities.size(); j++)
					this.sendToPlayer((EntityPlayerMP) worlds[i].playerEntities.get(j), packet);
		} else
		{
			for (int i = 0; i < world.playerEntities.size(); i++)
			{
				EntityPlayerMP player = (EntityPlayerMP) world.playerEntities.get(i);
				if (((int) player.posX - x) * ((int) player.posX - x) + ((int) player.posY - y) * ((int) player.posY - y) + ((int) player.posY - y) * ((int) player.posY - y) <= maxDistance
						* maxDistance)
					this.sendToPlayer(player, packet);
			}
		}
	}

	public void sendToServer(Packet packet)
	{

	}
	
	
	public void registerVillagers()
	{
		VillagerRegistry.instance().registerVillagerId(FantasticIds.fishermanID);
		VillagerTradeHandler newTradeHandler = new VillagerTradeHandler();
		VillagerRegistry.instance().registerVillageTradeHandler(FantasticIds.fishermanID, newTradeHandler);
		FishermanHandler FishermanHut = new FishermanHandler();
		VillagerRegistry.instance().registerVillageCreationHandler(FishermanHut);
		VillagerRegistry.instance().getRegisteredVillagers();
		MapGenStructureIO.func_143031_a(ComponentFishermanHut.class, "Fisherman");
	}

}
