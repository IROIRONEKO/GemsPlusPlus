package trhod177.gemsplusplus.util;

import java.io.File;

import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.References;



public class MainConfigHandler {
	
	public static Configuration config;
	
    public static boolean oreruby;
    public static boolean oresapphire;
    public static boolean oreamethyst;
    public static boolean oretopaz;
    public static boolean orephoenixite;
    public static boolean orejade;
    public static boolean orecitrine;
    public static boolean oregarnet;
    public static boolean orespinel;
    public static boolean oreonyx;
    public static boolean oreagate;
    public static boolean oremalachite;
    public static boolean oretourmaline;
    public static boolean orechrysocolla;
    public static boolean orejasper;
    public static boolean oresugilite;
    public static boolean netheroreruby;
    public static boolean netheroresapphire;
    public static boolean netheroreamethyst;
    public static boolean netheroretopaz;
    public static boolean netherorephoenixite;
    public static boolean netherorejade;
    public static boolean netherorecitrine;
    public static boolean netheroregarnet;
    public static boolean netherorespinel;
    public static boolean netheroreonyx;
    public static boolean netheroreagate;
    public static boolean netheroremalachite;
    public static boolean netheroretourmaline;
    public static boolean netherorechrysocolla;
    public static boolean netherorejasper;
    public static boolean netheroresugilite; 
    public static boolean nethergems;

	
	public static void init(File file) {
		
		config = new Configuration(file);
		
		String category;
		
		
		category = "Overworld Gems";
		config.addCustomCategoryComment(category, "OverWorld Gems");
	    oreruby = config.getBoolean("Ruby Ore", category, true, "Whether ruby ore will spawn");
	    oresapphire = config.getBoolean("Sapphire Ore", category, true, "Whether sapphire ore will spawn");
	    oreamethyst = config.getBoolean("Amethyst Ore", category, true, "Whether amethyst ore will spawn");
	    oretopaz = config.getBoolean("Topaz Ore", category, true, "Whether topaz ore will spawn");
	    orephoenixite = config.getBoolean("Phoenixite Ore", category, true, "Whether phoenixite ore will spawn");
	    orejade = config.getBoolean("Jade Ore", category, true, "Whether jade ore will spawn");
	    orecitrine = config.getBoolean("Citrine Ore", category, true, "Whether citrine ore will spawn");
	    oregarnet = config.getBoolean("Garnet Ore", category, true, "Whether garnet ore will spawn");
	    orespinel = config.getBoolean("Spinel Ore", category, true, "Whether spinel ore will spawn");
	    oreonyx = config.getBoolean("Onyx Ore", category, true, "Whether onyx ore will spawn");
	    oreagate = config.getBoolean("Agate Ore", category, true, "Whether agate ore will spawn");
	    oremalachite = config.getBoolean("Malachite Ore", category, true, "Whether malachite ore will spawn");
	    oretourmaline = config.getBoolean("Tourmaline Ore", category, true, "Whether tourmaline ore will spawn");
	    orechrysocolla = config.getBoolean("Chrysocolla Ore", category, true, "Whether chrysocolla ore will spawn");
	    orejasper = config.getBoolean("Jasper Ore", category, true, "Whether jasper ore will spawn");
	    oresugilite = config.getBoolean("Sugilite Ore", category, true, "Whether sugilite ore will spawn");
	    
	    category = "Nether Gems Spawn";
	    config.addCustomCategoryComment(category, "Nether Gems Spawn");
	    nethergems = config.getBoolean("Nether Gems", category, true, "Whether nether gems will spawn in the nether");
	    
		category = "Nether Gems";
		config.addCustomCategoryComment(category, "Nether Gems");
        netheroreruby = config.getBoolean("Ruby netherore", category, true, "Whether ruby nether ore will spawn");
	    netheroresapphire = config.getBoolean("Sapphire netherore", category, true, "Whether sapphire nether ore will spawn");
	    netheroreamethyst = config.getBoolean("Amethyst netherore", category, true, "Whether amethyst nether ore will spawn");
	    netheroretopaz = config.getBoolean("Topaz netherore", category, true, "Whether topaz nether ore will spawn");
	    netherorephoenixite = config.getBoolean("Phoenixite netherore", category, true, "Whether phoenixite nether ore will spawn");
	    netherorejade = config.getBoolean("Jade netherore", category, true, "Whether jade nether ore will spawn");
	    netherorecitrine = config.getBoolean("Citrine netherore", category, true, "Whether citrine nether ore will spawn");
	    netheroregarnet = config.getBoolean("Garnet netherore", category, true, "Whether garnet nether ore will spawn");
	    netherorespinel = config.getBoolean("Spinel netherore", category, true, "Whether spinel nether ore will spawn");
	    netheroreonyx = config.getBoolean("Onyx netherore", category, true, "Whether onyx nether ore will spawn");
	    netheroreagate = config.getBoolean("Agate netherore", category, true, "Whether agate nether ore will spawn");
	    netheroremalachite = config.getBoolean("Malachite netherore", category, true, "Whether malachite nether ore will spawn");
	    netheroretourmaline = config.getBoolean("Tourmaline netherore", category, true, "Whether tourmaline nether ore will spawn");
	    netherorechrysocolla = config.getBoolean("Chrysocolla netherore", category, true, "Whether chrysocolla nether ore will spawn");
	    netherorejasper = config.getBoolean("Jasper netherore", category, true, "Whether jasper nether ore will spawn");
	    netheroresugilite = config.getBoolean("Sugilite netherore", category, true, "Whether sugilite nether ore will spawn");
		
	   config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event) {
		GemsPlusPlus.config = new File(event.getModConfigurationDirectory() + "/" + References.MODID);
		GemsPlusPlus.config.mkdirs();
		init(new File(GemsPlusPlus.config.getPath(), References.NAME + ".cfg"));
				
	}
	

}