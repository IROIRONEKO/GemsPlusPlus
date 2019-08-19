package trhod177.gemsplusplus.intergration.projecte;

import moze_intel.projecte.api.ProjectEAPI;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.intergration.tconstruct.FluidInit;

public class ProjectEIntergration {
		
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public static void init(FMLInitializationEvent event) {
		
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.agate), ProjectEIntergrationConfig.emcagate);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.ruby), ProjectEIntergrationConfig.emcruby);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.sapphire), ProjectEIntergrationConfig.emcsapphire);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.amethyst), ProjectEIntergrationConfig.emcamethyst);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.topaz), ProjectEIntergrationConfig.emctopaz);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.phoenixite), ProjectEIntergrationConfig.emcphoenixite);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.jade), ProjectEIntergrationConfig.emcjade);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.citrine), ProjectEIntergrationConfig.emccitrine);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.garnet), ProjectEIntergrationConfig.emcgarnet);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.spinel), ProjectEIntergrationConfig.emcspinel);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.onyx), ProjectEIntergrationConfig.emconyx);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.malachite), ProjectEIntergrationConfig.emcmalachite);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.tourmaline), ProjectEIntergrationConfig.emctourmaline);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.chrysocolla), ProjectEIntergrationConfig.emcchrysocolla);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.sugilite), ProjectEIntergrationConfig.emcsugilite);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ItemInit.jasper), ProjectEIntergrationConfig.emcjasper);
		
	}
	
	public static void postInit(FMLPostInitializationEvent event) {

	}
	}
	
