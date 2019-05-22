package trhod177.gemsplusplus;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trhod177.gemsplusplus.creativetabs.GPPBlocksTab;
import trhod177.gemsplusplus.creativetabs.GPPItemsTab;
import trhod177.gemsplusplus.handlers.GPPRecipeHandler;
import trhod177.gemsplusplus.init.ArmourInit;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.proxy.CommonProxy;
import trhod177.gemsplusplus.util.handlers.RegistryHandler;
import trhod177.gemsplusplus.worldgen.WorldGenCustomOres;


@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class GemsPlusPlus {
	
	 
		public static final CreativeTabs GPPBlocksTab = new GPPBlocksTab("Items.EMERALD");
		public static final CreativeTabs GPPItemsTab = new GPPItemsTab("Items.EMERALD");

		public static File config;

		public static final Logger mainLogger = LogManager.getLogger(References.MODID);
		
		@SidedProxy(clientSide = References.CLIENTPROXY, serverSide = References.COMMONPROXY)
		public static CommonProxy proxy;
		
		@Mod.Instance(References.MODID)
		public static GemsPlusPlus instance;

		@EventHandler
		public static void preInit(FMLPreInitializationEvent event) {
			RegistryHandler.preInitRegistries(event);
			GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		}
		
		@EventHandler
		public static void init(FMLInitializationEvent event) {
			RegistryHandler.initRegistries(event);
			GPPRecipeHandler.registerCraftingBlocks();
			GPPRecipeHandler.registerCraftingItems();
			GPPRecipeHandler.registerSmelting();
		}
		
		@EventHandler
		public static void postInit(FMLPostInitializationEvent event) {
			RegistryHandler.postInitRegistries(event);
		}
		
		  
}