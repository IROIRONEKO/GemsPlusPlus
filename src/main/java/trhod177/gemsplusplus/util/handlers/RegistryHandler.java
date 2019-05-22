package trhod177.gemsplusplus.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trhod177.gemsplusplus.init.ArmourInit;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.MainConfigHandler;
import trhod177.gemsplusplus.util.interfaces.IHasModel;

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
		MainConfigHandler.registerConfig(event);
	}

	public static void initRegistries(FMLInitializationEvent event) {

	}

	public static void postInitRegistries(FMLPostInitializationEvent event) {

	}
}
