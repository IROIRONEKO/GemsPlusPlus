package trhod177.gemsplusplus;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.gui.ForgeGuiFactory.ForgeConfigGui.ModIDEntry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trhod177.gemsplusplus.creativetabs.GPPBlocksTab;
import trhod177.gemsplusplus.creativetabs.GPPItemsTab;
import trhod177.gemsplusplus.handlers.GPPRecipeHandler;
import trhod177.gemsplusplus.init.ArmourInit;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.IntergrationInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.items.GPPItemGem;
import trhod177.gemsplusplus.proxy.CommonProxy;
import trhod177.gemsplusplus.util.handlers.RegistryHandler;
import trhod177.gemsplusplus.worldgen.WorldGenCustomOres;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, dependencies = References.DEPENDS, updateJSON = "https://raw.githubusercontent.com/CodersDownUnder/UpdateJsons/master/gemsplusplusupdatejson.json")
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
		IntergrationInit.preInit(event);
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RegistryHandler.initRegistries(event);
		IntergrationInit.init(event);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		RegistryHandler.postInitRegistries(event);
		IntergrationInit.postInit(event);

	}
	

   

}