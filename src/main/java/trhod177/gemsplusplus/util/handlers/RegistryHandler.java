package trhod177.gemsplusplus.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.world.BossInfo.Color;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.common.ForgeVersion.CheckResult;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.References;
import trhod177.gemsplusplus.handlers.GPPRecipeHandler;
import trhod177.gemsplusplus.init.ArmourInit;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.intergration.projecte.ProjectEIntergrationConfig;
import trhod177.gemsplusplus.intergration.tconstruct.Tinkers;
import trhod177.gemsplusplus.intergration.thermal.ThermalConfig;
import trhod177.gemsplusplus.util.MainConfigHandler;
import trhod177.gemsplusplus.util.interfaces.IHasModel;
import trhod177.gemsplusplus.worldgen.WorldGenCustomOres;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
		event.getRegistry().registerAll(ArmourInit.ITEMS.toArray(new Item[0]));


	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));

	}

	@SubscribeEvent
	public static void registerEnchantment(RegistryEvent.Register<Enchantment> event) {
		// event.getRegistry().registerAll(EnchantmentInit.ENCHANTMENTS.toArray(new
		// Enchantment[0]));
	}

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {

		for (Item item : ItemInit.ITEMS) {
			if (item instanceof IHasModel) {
				((IHasModel) item).registerModels();

			}
		}

		for (Item item : ArmourInit.ITEMS) {
			if (item instanceof IHasModel) {
				((IHasModel) item).registerModels();

			}
		}

		for (Block block : BlockInit.BLOCKS) {
			if (block instanceof IHasModel) {
				((IHasModel) block).registerModels();
			}
		}
	}

	public static void preInitRegistries(FMLPreInitializationEvent event) {
		if (Loader.isModLoaded("thermalexpansion")) {
		ThermalConfig.registerConfig(event);
		}
		
		if (Loader.isModLoaded("projecte")) {
			ProjectEIntergrationConfig.registerConfig(event);
		}
		MainConfigHandler.registerConfig(event);
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		
	}

	public static void initRegistries(FMLInitializationEvent event) {
		
		
		GPPOreDict.registerOres();
		GemsPlusPlus.mainLogger.info("Tools/Armor Recipes Loaded");
		GPPRecipeHandler.registerCraftingItems();
		GPPRecipeHandler.registerCraftingBlocks();
		GPPRecipeHandler.registerSmelting();
		
	}

	public static void postInitRegistries(FMLPostInitializationEvent event) {

		
	}

	
}
