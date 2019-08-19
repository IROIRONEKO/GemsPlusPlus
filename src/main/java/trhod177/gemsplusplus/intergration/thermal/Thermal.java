package trhod177.gemsplusplus.intergration.thermal;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ibm.icu.impl.ICUService.Key;

import cofh.thermalexpansion.util.managers.dynamo.CompressionManager;
import cofh.thermalexpansion.util.managers.dynamo.MagmaticManager;
import cofh.thermalexpansion.util.managers.dynamo.NumismaticManager;
import cofh.thermalexpansion.util.managers.dynamo.ReactantManager;
import cofh.thermalexpansion.util.managers.dynamo.SteamManager;
import cofh.thermalexpansion.util.managers.machine.BrewerManager;
import cofh.thermalexpansion.util.managers.machine.CompactorManager;
import cofh.thermalexpansion.util.managers.machine.CompactorManager.Mode;
import cofh.thermalexpansion.util.managers.machine.FurnaceManager;
import cofh.thermalexpansion.util.managers.machine.PulverizerManager;
import cofh.thermalfoundation.fluid.FluidPotion;
import net.minecraft.block.Block;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scala.actors.threadpool.Arrays;
import trhod177.gemsplusplus.References;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.intergration.tconstruct.FluidInit;

public class Thermal {
	
	public static final Logger gppthermalintlogger = LogManager.getLogger(References.MODID + "-thermal-expansion-intergration");

	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public static void init(FMLInitializationEvent event) {
		
	if (ThermalConfig.furnacerecipes == true) {
	gppthermalintlogger.info("Redstone Furnace And Induction Furnace Recipes Are: Enabled");
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oreagate), new ItemStack(ItemInit.agate));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oreamethyst), new ItemStack(ItemInit.amethyst));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.orechrysocolla), new ItemStack(ItemInit.chrysocolla));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.orecitrine), new ItemStack(ItemInit.citrine));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oregarnet), new ItemStack(ItemInit.garnet));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.orejade), new ItemStack(ItemInit.jade));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.orejasper), new ItemStack(ItemInit.jasper));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oremalachite), new ItemStack(ItemInit.malachite));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oreonyx), new ItemStack(ItemInit.onyx));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.orephoenixite), new ItemStack(ItemInit.phoenixite));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oreruby), new ItemStack(ItemInit.ruby));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oresapphire), new ItemStack(ItemInit.sapphire));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.orespinel), new ItemStack(ItemInit.spinel));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oresugilite), new ItemStack(ItemInit.sugilite));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oretopaz), new ItemStack(ItemInit.topaz));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.oretourmaline), new ItemStack(ItemInit.tourmaline));
	
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroreagate), new ItemStack(ItemInit.agate));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroreamethyst), new ItemStack(ItemInit.amethyst));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netherorechrysocolla), new ItemStack(ItemInit.chrysocolla));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netherorecitrine), new ItemStack(ItemInit.citrine));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroregarnet), new ItemStack(ItemInit.garnet));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netherorejade), new ItemStack(ItemInit.jade));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netherorejasper), new ItemStack(ItemInit.jasper));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroremalachite), new ItemStack(ItemInit.malachite));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroreonyx), new ItemStack(ItemInit.onyx));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netherorephoenixite), new ItemStack(ItemInit.phoenixite));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroreruby), new ItemStack(ItemInit.ruby));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroresapphire), new ItemStack(ItemInit.sapphire));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netherorespinel), new ItemStack(ItemInit.spinel));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroresugilite), new ItemStack(ItemInit.sugilite));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroretopaz), new ItemStack(ItemInit.topaz));
	FurnaceManager.addRecipe(2000, new ItemStack(BlockInit.netheroretourmaline), new ItemStack(ItemInit.tourmaline));
	
	FurnaceManager.addRecipe(2000, new ItemStack(ItemInit.agate), new ItemStack(ItemInit.dustagate));
	
	} else if (ThermalConfig.furnacerecipes == false) {
		gppthermalintlogger.info("Redstone Furnace And Induction Furnace Recipes Are: Disabled");
		
	} else {
		gppthermalintlogger.info("Something went wrong quick send the logs to the developer");
	}
	
	
	if (ThermalConfig.pulverizerrecipes == true) {
		gppthermalintlogger.info("Pulverizer Recipes Are: Enabled");
		
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oreagate), new ItemStack(ItemInit.dustagate, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oreamethyst), new ItemStack(ItemInit.dustamethyst, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.orechrysocolla), new ItemStack(ItemInit.dustchrysocolla, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.orecitrine), new ItemStack(ItemInit.dustcitrine, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oregarnet), new ItemStack(ItemInit.dustgarnet, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.orejade), new ItemStack(ItemInit.dustjade, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.orejasper), new ItemStack(ItemInit.dustjasper, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oremalachite), new ItemStack(ItemInit.dustmalachite, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oreonyx), new ItemStack(ItemInit.dustonyx, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.orephoenixite), new ItemStack(ItemInit.dustphoenixite, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oreruby), new ItemStack(ItemInit.dustruby, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oresapphire), new ItemStack(ItemInit.dustsapphire, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.orespinel), new ItemStack(ItemInit.dustspinel, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oresugilite), new ItemStack(ItemInit.dustsugilite, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oretopaz), new ItemStack(ItemInit.dusttopaz, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.oretourmaline), new ItemStack(ItemInit.dusttourmaline, 4));
		
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroreagate), new ItemStack(ItemInit.dustagate, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroreamethyst), new ItemStack(ItemInit.dustamethyst, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netherorechrysocolla), new ItemStack(ItemInit.dustchrysocolla, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netherorecitrine), new ItemStack(ItemInit.dustcitrine, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroregarnet), new ItemStack(ItemInit.dustgarnet, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netherorejade), new ItemStack(ItemInit.dustjade, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netherorejasper), new ItemStack(ItemInit.dustjasper, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroremalachite), new ItemStack(ItemInit.dustmalachite, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroreonyx), new ItemStack(ItemInit.dustonyx, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netherorephoenixite), new ItemStack(ItemInit.dustphoenixite, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroreruby), new ItemStack(ItemInit.dustruby, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroresapphire), new ItemStack(ItemInit.dustsapphire, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netherorespinel), new ItemStack(ItemInit.dustspinel, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroresugilite), new ItemStack(ItemInit.dustsugilite, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroretopaz), new ItemStack(ItemInit.dusttopaz, 4));
		PulverizerManager.addRecipe(2500, new ItemStack(BlockInit.netheroretourmaline), new ItemStack(ItemInit.dusttourmaline, 4));
		
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.agate), new ItemStack(ItemInit.dustagate, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.amethyst), new ItemStack(ItemInit.dustamethyst, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.chrysocolla), new ItemStack(ItemInit.dustchrysocolla, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.citrine), new ItemStack(ItemInit.dustcitrine, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.garnet), new ItemStack(ItemInit.dustgarnet, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.jade), new ItemStack(ItemInit.dustjade, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.jasper), new ItemStack(ItemInit.dustjasper, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.malachite), new ItemStack(ItemInit.dustmalachite, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.onyx), new ItemStack(ItemInit.dustonyx, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.phoenixite), new ItemStack(ItemInit.dustphoenixite, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.ruby), new ItemStack(ItemInit.dustruby, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.sapphire), new ItemStack(ItemInit.dustsapphire, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.spinel), new ItemStack(ItemInit.dustspinel, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.sugilite), new ItemStack(ItemInit.dustsugilite, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.topaz), new ItemStack(ItemInit.dusttopaz, 3));
		PulverizerManager.addRecipe(2500, new ItemStack(ItemInit.tourmaline), new ItemStack(ItemInit.dusttourmaline, 3));
	} else if (ThermalConfig.pulverizerrecipes == false) {
		gppthermalintlogger.info("Pulverizer Recipes Are: Disabled");
	} else {
		gppthermalintlogger.info("Something went wrong quick send the logs to the developer");
	}
	
	
	if (ThermalConfig.compressorrecipes == true) {
		gppthermalintlogger.info("Compactor Recipes Are: Enabled");
		
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustagate, 2), new ItemStack(ItemInit.agate), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustamethyst, 2), new ItemStack(ItemInit.amethyst), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustchrysocolla, 2), new ItemStack(ItemInit.chrysocolla), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustcitrine, 2), new ItemStack(ItemInit.citrine), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustgarnet, 2), new ItemStack(ItemInit.garnet), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustjade, 2), new ItemStack(ItemInit.jade), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustjasper, 2), new ItemStack(ItemInit.jasper), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustmalachite, 2), new ItemStack(ItemInit.malachite), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustonyx, 2), new ItemStack(ItemInit.onyx), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustphoenixite, 2), new ItemStack(ItemInit.phoenixite), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustruby, 2), new ItemStack(ItemInit.ruby), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustsapphire, 2), new ItemStack(ItemInit.sapphire), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustspinel, 2), new ItemStack(ItemInit.spinel), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dustsugilite, 2), new ItemStack(ItemInit.sugilite), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dusttopaz, 2), new ItemStack(ItemInit.topaz), Mode.ALL);
		CompactorManager.addRecipe(2500, new ItemStack(ItemInit.dusttourmaline, 2), new ItemStack(ItemInit.tourmaline), Mode.ALL);
	} else if (ThermalConfig.pulverizerrecipes == false) {
		gppthermalintlogger.info("Compactor Recipes Are: Disabled");
	} else {
		gppthermalintlogger.info("Something went wrong quick send the logs to the developer");
	}
	
	BrewerManager.addDefaultPotionRecipes(PotionTypes.AWKWARD, new ItemStack(ItemInit.dustphoenixite, 2), PotionTypes.FIRE_RESISTANCE);
	BrewerManager.addDefaultPotionRecipes(PotionTypes.FIRE_RESISTANCE, new ItemStack(ItemInit.phoenixite, 2), PotionTypes.LONG_FIRE_RESISTANCE);
	
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.phoenixite), 100000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.ruby), 10000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.sapphire), 10000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.amethyst), 15000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.topaz), 9000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.jade), 6000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.citrine), 70000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.garnet), 8000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.spinel), 9000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.onyx), 11000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.malachite), 12000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.tourmaline), 14000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.chrysocolla), 17000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.sugilite), 8000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.jasper), 6000);
	NumismaticManager.addGemFuel(new ItemStack(ItemInit.agate), 6000);
	SteamManager.addFuel(new ItemStack(ItemInit.dustphoenixite, 4), 50800);
	SteamManager.addFuel(new ItemStack(ItemInit.phoenixite), 50800);
	SteamManager.addFuel(new ItemStack(BlockInit.blockphoenixite), 150800);
	
	if(Loader.isModLoaded("tconstruct")) {
	MagmaticManager.addFuel("moltenphoenixite", 200000);
	}
		
	}
	
	public static void postInit(FMLPostInitializationEvent event) {

	}
}
