package trhod177.gemsplusplus.intergration.thermal;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.References;

public class ThermalConfig {
	
public static Configuration config;
	
    //variables
    
	public static Boolean furnacerecipes;
	public static Boolean pulverizerrecipes;
	public static Boolean compressorrecipes;
	
	public static void init(File file) {
		
		config = new Configuration(file);
		
		String category;
	
		category = "Recipes";
		config.addCustomCategoryComment(category, "Recipes");
		furnacerecipes = config.getBoolean("Gems++ Furnace Recipes", category, true, "Whether Gems++ Redstone Furnace And Induction Furnace Recipes Are Enabled");
		pulverizerrecipes = config.getBoolean("Gems++ Pulverizer Recipes", category, true, "Whether Gems++ Pulverizer Recipes Are Enabled");
		compressorrecipes = config.getBoolean("Gems++ Compactor Recipes", category, true, "Whether Gems++ Compactor Recipes Are Enabled"); 
	    
	   config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event) {
		GemsPlusPlus.config = new File(event.getModConfigurationDirectory() + "/" + References.MODID);
		GemsPlusPlus.config.mkdirs();
		init(new File(GemsPlusPlus.config.getPath(), References.NAME + "-Thermal-Expansion-Intergration" + ".cfg"));
				
	}

}
