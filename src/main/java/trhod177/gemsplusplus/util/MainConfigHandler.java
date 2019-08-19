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
    
    public static int orerubyspawnchance;
    public static int oresapphirespawnchance;
    public static int oreamethystspawnchance;
    public static int oretopazspawnchance;
    public static int orephoenixitespawnchance;
    public static int orejadespawnchance;
    public static int orecitrinespawnchance;
    public static int oregarnetspawnchance;
    public static int orespinelspawnchance;
    public static int oreonyxspawnchance;
    public static int oreagatespawnchance;
    public static int oremalachitespawnchance;
    public static int oretourmalinespawnchance;
    public static int orechrysocollaspawnchance;
    public static int orejasperspawnchance;
    public static int oresugilitespawnchance;
    public static int netherorerubyspawnchance;
    public static int netheroresapphirespawnchance;
    public static int netheroreamethystspawnchance;
    public static int netheroretopazspawnchance;
    public static int netherorephoenixitespawnchance;
    public static int netherorejadespawnchance;
    public static int netherorecitrinespawnchance;
    public static int netheroregarnetspawnchance;
    public static int netherorespinelspawnchance;
    public static int netheroreonyxspawnchance;
    public static int netheroreagatespawnchance;
    public static int netheroremalachitespawnchance;
    public static int netheroretourmalinespawnchance;
    public static int netherorechrysocollaspawnchance;
    public static int netherorejasperspawnchance;
    public static int netheroresugilitespawnchance; 
    
    public static int orerubyveinsize;
    public static int oresapphireveinsize;
    public static int oreamethystveinsize;
    public static int oretopazveinsize;
    public static int orephoenixiteveinsize;
    public static int orejadeveinsize;
    public static int orecitrineveinsize;
    public static int oregarnetveinsize;
    public static int orespinelveinsize;
    public static int oreonyxveinsize;
    public static int oreagateveinsize;
    public static int oremalachiteveinsize;
    public static int oretourmalineveinsize;
    public static int orechrysocollaveinsize;
    public static int orejasperveinsize;
    public static int oresugiliteveinsize;
    public static int netherorerubyveinsize;
    public static int netheroresapphireveinsize;
    public static int netheroreamethystveinsize;
    public static int netheroretopazveinsize;
    public static int netherorephoenixiteveinsize;
    public static int netherorejadeveinsize;
    public static int netherorecitrineveinsize;
    public static int netheroregarnetveinsize;
    public static int netherorespinelveinsize;
    public static int netheroreonyxveinsize;
    public static int netheroreagateveinsize;
    public static int netheroremalachiteveinsize;
    public static int netheroretourmalineveinsize;
    public static int netherorechrysocollaveinsize;
    public static int netherorejasperveinsize;
    public static int netheroresugiliteveinsize; 
    

	
	public static void init(File file) {
		
		config = new Configuration(file);
		
		String category;
		
		
		category = "Overworld Gems";
		config.addCustomCategoryComment(category, "Overworld Gems");
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
	    
	    category = "World Gen Spawn Chance";
	    config.addCustomCategoryComment(category, "World Gen Spawn Chance");
	    orerubyspawnchance = config.getInt("Ruby Ore Spawn Chance", category, 6, 0, 100, "How often ruby ore spawns");
	    oresapphirespawnchance = config.getInt("Sapphire Ore Spawn Chance", category, 6, 0, 100, "How often sapphire ore spawns");
	    oreamethystspawnchance = config.getInt("Amethyst Ore Spawn Chance", category, 6, 0, 100, "How often amethyst ore spawns");
	    oretopazspawnchance = config.getInt("Topaz Ore Spawn Chance", category, 6, 0, 100, "How often topaz ore spawns");
	    orephoenixitespawnchance = config.getInt("Phoenixite Ore Spawn Chance", category, 1, 0, 100, "How often phoenixite ore spawns");
	    orejadespawnchance = config.getInt("Jade Ore Spawn Chance", category, 6, 0, 100, "How often jade ore spawns");
	    orecitrinespawnchance = config.getInt("Citrine Ore Spawn Chance", category, 6, 0, 100, "How often citrine ore spawns");
	    oregarnetspawnchance = config.getInt("Garnet Ore Spawn Chance", category, 6, 0, 100, "How often garnet ore spawns");
	    orespinelspawnchance = config.getInt("Spinel Ore Spawn Chance", category, 6, 0, 100, "How often spinel ore spawns");
	    oreonyxspawnchance = config.getInt("Onyx Ore Spawn Chance", category, 6, 0, 100, "How often onyx ore spawns");
	    oreagatespawnchance = config.getInt("Agate Ore Spawn Chance", category, 6, 0, 100, "How often agates ore spawns");
	    oremalachitespawnchance = config.getInt("Malachite Ore Spawn Chance", category, 6, 0, 100, "How often malachite ore spawns");
	    oretourmalinespawnchance = config.getInt("Tourmaline Ore Spawn Chance", category, 6, 0, 100, "How often tourmaline ore spawns");
	    orechrysocollaspawnchance = config.getInt("Chrysocolla Ore Spawn Chance", category, 6, 0, 100, "How often chrysocolla ore spawns");
	    orejasperspawnchance = config.getInt("Jasper Ore Spawn Chance", category, 6, 0, 100, "How often jasper ore spawns");
	    oresugilitespawnchance = config.getInt("Sugilite Ore Spawn Chance", category, 6, 0, 100, "How often sugilite ore spawns");
	    netherorerubyspawnchance = config.getInt("Ruby NetherOre Spawn Chance", category, 3, 0, 100, "How often ruby netherore spawns");
	    netheroresapphirespawnchance = config.getInt("Sapphire NetherOre Spawn Chance", category, 3, 0, 100, "How often sapphire netherore spawns");
	    netheroreamethystspawnchance = config.getInt("Amethyst NetherOre Spawn Chance", category, 3, 0, 100, "How often amethyst netherore spawns");
	    netheroretopazspawnchance = config.getInt("Topaz NetherOre Spawn Chance", category, 3, 0, 100, "How often topaz netherore spawns");
	    netherorephoenixitespawnchance = config.getInt("Phoenixite NetherOre Spawn Chance", category, 2, 0, 100, "How often phoenixite netherore spawns");
	    netherorejadespawnchance = config.getInt("Jade NetherOre Spawn Chance", category, 3, 0, 100, "How often jade netherore spawns");
	    netherorecitrinespawnchance = config.getInt("Citrine NetherOre Spawn Chance", category, 3, 0, 100, "How often citrine netherore spawns");
	    netheroregarnetspawnchance = config.getInt("Garnet NetherOre Spawn Chance", category, 3, 0, 100, "How often garnet netherore spawns");
	    netherorespinelspawnchance = config.getInt("Spinel NetherOre Spawn Chance", category, 3, 0, 100, "How often spinel netherore spawns");
	    netheroreonyxspawnchance = config.getInt("Onyx NetherOre Spawn Chance", category, 3, 0, 100, "How often onyx netherore spawns");
	    netheroreagatespawnchance = config.getInt("Agate NetherOre Spawn Chance", category, 3, 0, 100, "How often agate netherore spawns");
	    netheroremalachitespawnchance = config.getInt("Malachite NetherOre Spawn Chance", category, 3, 0, 100, "How often malachite netherore spawns");
	    netheroretourmalinespawnchance = config.getInt("Tourmaline NetherOre Spawn Chance", category, 3, 0, 100, "How often tourmaline netherore spawns");
	    netherorechrysocollaspawnchance = config.getInt("Chrysocolla NetherOre Spawn Chance", category, 3, 0, 100, "How often chrysocolla netherore spawns");
	    netherorejasperspawnchance = config.getInt("Jasper NetherOre Spawn Chance", category, 3, 0, 100, "How often jasper netherore spawns");
	    netheroresugilitespawnchance = config.getInt("Sugilite NetherOre Spawn Chance", category, 3, 0, 100, "How often sugilite netherore spawns");
	    
	    category = "World Gen Vein Size";
	    config.addCustomCategoryComment(category, "World Gen Vein Size");
	    orerubyveinsize = config.getInt("Ruby Ore Vein Size", category, 4, 0, 100, "How big ruby ore veins are");
	    oresapphireveinsize = config.getInt("Sapphire Ore Vein Size", category, 3, 0, 100, "How big sapphire ore veins are");
	    oreamethystveinsize = config.getInt("Amethyst Ore Vein Size", category, 4, 0, 100, "How big amethyst ore veins are");
	    oretopazveinsize = config.getInt("Topaz Ore Vein Size", category, 3, 0, 100, "How big topaz ore veins are");
	    orephoenixiteveinsize = config.getInt("Phoenixite Ore Vein Size", category, 1, 0, 100, "How big phoenixite ore veins are");
	    orejadeveinsize = config.getInt("Jade Ore Vein Size", category, 5, 0, 100, "How big jade ore veins are");
	    orecitrineveinsize = config.getInt("Citrine Ore Vein Size", category, 4, 0, 100, "How big citrine ore veins are");
	    oregarnetveinsize = config.getInt("Garnet Ore Vein Size", category, 4, 0, 100, "How big garnet ore veins are");
	    orespinelveinsize = config.getInt("Spinel Ore Vein Size", category, 4, 0, 100, "How big spinel ore veins are");
	    oreonyxveinsize = config.getInt("Onyx Ore Vein Size", category, 4, 0, 100, "How big onyx ore veins are");
	    oreagateveinsize = config.getInt("Agate Ore Vein Size", category, 4, 0, 100, "How big agates ore veins are");
	    oremalachiteveinsize = config.getInt("Malachite Ore Vein Size", category, 4, 0, 100, "How big malachite ore veins are");
	    oretourmalineveinsize = config.getInt("Tourmaline Ore Vein Size", category, 4, 0, 100, "How big tourmaline ore veins are");
	    orechrysocollaveinsize = config.getInt("Chrysocolla Ore Vein Size", category, 4, 0, 100, "How big chrysocolla ore veins are");
	    orejasperveinsize = config.getInt("Jasper Ore Vein Size", category, 3, 0, 100, "How big jasper ore veins are");
	    oresugiliteveinsize = config.getInt("Sugilite Ore Vein Size", category, 5, 0, 100, "How big sugilite ore veins are");
	    netherorerubyveinsize = config.getInt("Ruby NetherOre Vein Size", category, 2, 0, 100, "How big ruby netherore veins are");
	    netheroresapphireveinsize = config.getInt("Sapphire NetherOre Vein Size", category, 1, 0, 100, "How big sapphire netherore veins are");
	    netheroreamethystveinsize = config.getInt("Amethyst NetherOre Vein Size", category, 2, 0, 100, "How big amethyst netherore veins are");
	    netheroretopazveinsize = config.getInt("Topaz NetherOre Vein Size", category, 2, 0, 100, "How big topaz netherore veins are");
	    netherorephoenixiteveinsize = config.getInt("Phoenixite NetherOre Vein Size", category, 2, 0, 100, "How big phoenixite netherore veins are");
	    netherorejadeveinsize = config.getInt("Jade NetherOre Vein Size", category, 1, 0, 100, "How big jade netherore veins are");
	    netherorecitrineveinsize = config.getInt("Citrine NetherOre Vein Size", category, 1, 0, 100, "How big citrine netherore veins are");
	    netheroregarnetveinsize = config.getInt("Garnet NetherOre Vein Size", category, 4, 0, 100, "How big garnet netherore veins are");
	    netherorespinelveinsize = config.getInt("Spinel NetherOre Vein Size", category, 3, 0, 100, "How big spinel netherore veins are");
	    netheroreonyxveinsize = config.getInt("Onyx NetherOre Vein Size", category, 5, 0, 100, "How big onyx netherore veins are");
	    netheroreagateveinsize = config.getInt("Agate NetherOre Vein Size", category, 3, 0, 100, "How big agate netherore veins are");
	    netheroremalachiteveinsize = config.getInt("Malachite NetherOre Vein Size", category, 2, 0, 100, "How big malachite netherore veins are");
	    netheroretourmalineveinsize = config.getInt("Tourmaline NetherOre Vein Size", category, 2, 0, 100, "How big tourmaline netherore veins are");
	    netherorechrysocollaveinsize = config.getInt("Chrysocolla NetherOre Vein Size", category, 2, 0, 100, "How big chrysocolla netherore veins are");
	    netherorejasperveinsize = config.getInt("Jasper NetherOre Vein Size", category, 2, 0, 100, "How big jasper netherore veins are");
	    netheroresugiliteveinsize = config.getInt("Sugilite NetherOre Vein Size", category, 2, 0, 100, "How big sugilite netherore veins are");
	    
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