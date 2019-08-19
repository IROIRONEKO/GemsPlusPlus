package trhod177.gemsplusplus.intergration.projecte;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.References;

public class ProjectEIntergrationConfig {
	
public static Configuration config;
	
 
    public static int emcagate;
	public static int emcruby;
	public static int emcsapphire;
	public static int emcamethyst;
	public static int emctopaz;
	public static int emcphoenixite = 2000;
	public static int emcjade = 600;
	public static int emccitrine = 600;
	public static int emcgarnet = 600;
	public static int emcspinel = 600;
	public static int emconyx = 600;
	public static int emcmalachite = 600;
	public static int emctourmaline = 600;
	public static int emcchrysocolla = 600;
	public static int emcsugilite = 600;
	public static int emcjasper = 600;
	
	
	public static void init(File file) {
		
		config = new Configuration(file);
		
		String category;
	
		category = "EMC Values";
		config.addCustomCategoryComment(category, "EMC Values");
		emcagate = config.getInt("AgateEMC", category, 300, 0, 2147483647, "EMC Value Of Agate");
		emcruby = config.getInt("RubyEMC", category, 300, 0, 2147483647, "EMC Value Of Ruby");
		emcsapphire = config.getInt("SapphireEMC", category, 300, 0, 2147483647, "EMC Value Of Sapphire");
		emcamethyst = config.getInt("AmethystEMC", category, 300, 0, 2147483647, "EMC Value Of Amethyst");
		emctopaz = config.getInt("TopazEMC", category, 300, 0, 2147483647, "EMC Value Of Topaz");
		emcphoenixite = config.getInt("PhoenixiteEMC", category, 2000, 0, 2147483647, "EMC Value Of Phoenixite");
		emcjade = config.getInt("JadeEMC", category, 300, 0, 2147483647, "EMC Value Of Jade");
		emccitrine = config.getInt("CitrineEMC", category, 300, 0, 2147483647, "EMC Value Of Citrine");
		emcgarnet = config.getInt("GarnetEMC", category, 300, 0, 2147483647, "EMC Value Of Garnet");
		emcspinel = config.getInt("SpinelEMC", category, 300, 0, 2147483647, "EMC Value Of Spinel");
		emconyx = config.getInt("OnyxEMC", category, 300, 0, 2147483647, "EMC Value Of Onyx");
		emcmalachite = config.getInt("MalachiteEMC", category, 300, 0, 2147483647, "EMC Value Of Malachite");
		emctourmaline = config.getInt("TourmalineEMC", category, 300, 0, 2147483647, "EMC Value Of Tourmaline");
		emcchrysocolla = config.getInt("ChrysocollaEMC", category, 300, 0, 2147483647, "EMC Value Of Chrysocolla");
		emcjasper = config.getInt("JasperEMC", category, 300, 0, 2147483647, "EMC Value Of Jasper");
	    
	   config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event) {
		GemsPlusPlus.config = new File(event.getModConfigurationDirectory() + "/" + References.MODID);
		GemsPlusPlus.config.mkdirs();
		init(new File(GemsPlusPlus.config.getPath(), References.NAME + "-ProjectE-Intergration" + ".cfg"));
				
	}

}
