package trhod177.gemsplusplus.init;

import moze_intel.projecte.api.ProjectEAPI;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.intergration.conarm.ConArmIntergration;
import trhod177.gemsplusplus.intergration.projecte.ProjectEIntergration;
import trhod177.gemsplusplus.intergration.tconstruct.Tinkers;
import trhod177.gemsplusplus.intergration.thermal.Thermal;

public class IntergrationInit {
	
	public static void preInit(FMLPreInitializationEvent event) {
		
		if (Loader.isModLoaded("tconstruct")) {
			Tinkers.preInit(event);			
			GemsPlusPlus.mainLogger.info("Tinkers Construct Intergration is activated");	
		}
		
		if (Loader.isModLoaded("projecte")) {
			ProjectEIntergration.preInit(event);
		}
		
		if (Loader.isModLoaded("thermalexpansion")) {
			Thermal.preInit(event);
		}
		
		if (Loader.isModLoaded("conarm")) {
			ConArmIntergration.preInit(event);
		}
			
		
		
	}
	
	public static void init(FMLInitializationEvent event) {
		
		if (Loader.isModLoaded("tconstruct")) {
			Tinkers.init(event);
			
			}
		
		if (Loader.isModLoaded("projecte")) {
			ProjectEIntergration.init(event);
		}
		
		if (Loader.isModLoaded("thermalexpansion")) {
			Thermal.init(event);
		}
		
		if (Loader.isModLoaded("conarm")) {
			ConArmIntergration.init(event);
		}
		
		
	}
	
	public static void postInit(FMLPostInitializationEvent event) {

		if (Loader.isModLoaded("tconstruct")) {
			Tinkers.postInit(event);
		}
		
		if (Loader.isModLoaded("projecte")) {
			ProjectEIntergration.postInit(event);
		}
		
		if (Loader.isModLoaded("thermalexpansion")) {
			Thermal.postInit(event);
		}
		
		if (Loader.isModLoaded("conarm")) {
			ConArmIntergration.postInit(event);
		}
		
	}

}
