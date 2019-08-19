package trhod177.gemsplusplus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import trhod177.gemsplusplus.blocks.GPPGlass;
import trhod177.gemsplusplus.blocks.GPPGlassPane;
import trhod177.gemsplusplus.blocks.GPPOre;
import trhod177.gemsplusplus.blocks.GPPOrePhoenixite;
import trhod177.gemsplusplus.items.GPPArmor;
import trhod177.gemsplusplus.items.GPPPhoenixiteAxe;
import trhod177.gemsplusplus.items.GPPPhoenixiteHoe;
import trhod177.gemsplusplus.items.GPPPhoenixitePickaxe;
import trhod177.gemsplusplus.items.GPPPhoenixiteShovel;
import trhod177.gemsplusplus.items.GPPPhoenixiteSword;
import trhod177.gemsplusplus.items.ItemCustomAxe;
import trhod177.gemsplusplus.items.ItemCustomPickAxe;
import trhod177.gemsplusplus.lists.ArmorMaterialList;
import trhod177.gemsplusplus.lists.BlockList;
import trhod177.gemsplusplus.lists.ItemList;
import trhod177.gemsplusplus.lists.ToolMaterialList;
import trhod177.gemsplusplus.world.OreGeneration;

@Mod(References.MODID)
public class GemsPlusPlus {
	
	public static GemsPlusPlus instance;
	private static final Logger logger = LogManager.getLogger(References.MODID);
	
	public static final ItemGroup gemsplusplusitem = new GemsPlusPlusItemItemGroup();
	public static final ItemGroup gemsplusplusblock = new GemsPlusPlusBlockItemGroup();
	
	public GemsPlusPlus() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		OreGeneration.setupOreGeneration();
		logger.info("Setup method registered");
		
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		logger.info("clientRegistries methd registered");
	}
	
	
	
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			
		event.getRegistry().registerAll(
		ItemList.agate = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("agate")),
		ItemList.amethyst = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("amethyst")),
		ItemList.citrine = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("citrine")),
		ItemList.chrysocolla = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("chrysocolla")),
		ItemList.garnet = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("garnet")),
		ItemList.jade = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("jade")),
		ItemList.jasper = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("jasper")),
		ItemList.malachite = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("malachite")),
		ItemList.onyx = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("onyx")),
		ItemList.phoenixite = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("phoenixite")),
		ItemList.ruby = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("ruby")),
		ItemList.sapphire = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("sapphire")),
		ItemList.spinel = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("spinel")),
		ItemList.sugilite = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("sugilite")),
		ItemList.topaz = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("topaz")),
		ItemList.tourmaline = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("tourmaline")),
		
		ItemList.dustagate = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustagate")),
		ItemList.dustamethyst = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustamethyst")),
		ItemList.dustcitrine = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustcitrine")),
		ItemList.dustchrysocolla = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustchrysocolla")),
		ItemList.dustgarnet = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustgarnet")),
		ItemList.dustjade = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustjade")),
		ItemList.dustjasper = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustjasper")),
		ItemList.dustmalachite = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustmalachite")),
		ItemList.dustonyx = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustonyx")),
		ItemList.dustphoenixite = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustphoenixite")),
		ItemList.dustruby = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustruby")),
		ItemList.dustsapphire = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustsapphire")),
		ItemList.dustspinel = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustspinel")),
		ItemList.dustsugilite = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dustsugilite")),
		ItemList.dusttopaz = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dusttopaz")),
		ItemList.dusttourmaline = new Item(new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("dusttourmaline")),
		
		ItemList.axeagate = new ItemCustomAxe(ToolMaterialList.agate, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axeagate")),
	    ItemList.axeamethyst = new ItemCustomAxe(ToolMaterialList.amethyst, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axeamethyst")),
		ItemList.axecitrine = new ItemCustomAxe(ToolMaterialList.citrine, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axecitrine")),
		ItemList.axechrysocolla = new ItemCustomAxe(ToolMaterialList.chrysocolla, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axechrysocolla")),
	    ItemList.axegarnet = new ItemCustomAxe(ToolMaterialList.garnet, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axegarnet")),
		ItemList.axejade = new ItemCustomAxe(ToolMaterialList.jade, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axejade")),
		ItemList.axejasper = new ItemCustomAxe(ToolMaterialList.jasper, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axejasper")),
		ItemList.axemalachite = new ItemCustomAxe(ToolMaterialList.malachite, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axemalachite")),
		ItemList.axeonyx = new ItemCustomAxe(ToolMaterialList.onyx, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axeonyx")),
		ItemList.axephoenixite = new GPPPhoenixiteAxe(ToolMaterialList.phoenixite, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axephoenixite")),
		ItemList.axeruby = new ItemCustomAxe(ToolMaterialList.ruby, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axeruby")),
		ItemList.axesapphire = new ItemCustomAxe(ToolMaterialList.sapphire, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axesapphire")),
		ItemList.axespinel = new ItemCustomAxe(ToolMaterialList.spinel, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axespinel")),
		ItemList.axesugilite = new ItemCustomAxe(ToolMaterialList.sugilite, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axesugilite")),
		ItemList.axetopaz = new ItemCustomAxe(ToolMaterialList.topaz, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axetopaz")),
		ItemList.axetourmaline = new ItemCustomAxe(ToolMaterialList.tourmaline, -1.0f, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("axetourmaline")),
				
		ItemList.pickaxeagate = new ItemCustomPickAxe(ToolMaterialList.agate, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxeagate")),
	    ItemList.pickaxeamethyst = new ItemCustomPickAxe(ToolMaterialList.amethyst, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxeamethyst")),
		ItemList.pickaxecitrine = new ItemCustomPickAxe(ToolMaterialList.citrine, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxecitrine")),
		ItemList.pickaxechrysocolla = new ItemCustomPickAxe(ToolMaterialList.chrysocolla, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxechrysocolla")),
	    ItemList.pickaxegarnet = new ItemCustomPickAxe(ToolMaterialList.garnet, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxegarnet")),
		ItemList.pickaxejade = new ItemCustomPickAxe(ToolMaterialList.jade, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxejade")),
		ItemList.pickaxejasper = new ItemCustomPickAxe(ToolMaterialList.jasper, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxejasper")),
		ItemList.pickaxemalachite = new ItemCustomPickAxe(ToolMaterialList.malachite, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxemalachite")),
		ItemList.pickaxeonyx = new ItemCustomPickAxe(ToolMaterialList.onyx, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxeonyx")),
		ItemList.pickaxephoenixite = new GPPPhoenixitePickaxe(ToolMaterialList.phoenixite, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxephoenixite")),
		ItemList.pickaxeruby = new ItemCustomPickAxe(ToolMaterialList.ruby, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxeruby")),
		ItemList.pickaxesapphire = new ItemCustomPickAxe(ToolMaterialList.sapphire, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxesapphire")),
		ItemList.pickaxespinel = new ItemCustomPickAxe(ToolMaterialList.spinel, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxespinel")),
		ItemList.pickaxesugilite = new ItemCustomPickAxe(ToolMaterialList.sugilite, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxesugilite")),
		ItemList.pickaxetopaz = new ItemCustomPickAxe(ToolMaterialList.topaz, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxetopaz")),
		ItemList.pickaxetourmaline = new ItemCustomPickAxe(ToolMaterialList.tourmaline, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("pickaxetourmaline")),
							
		ItemList.shovelagate = new ItemSpade(ToolMaterialList.agate, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelagate")),
        ItemList.shovelamethyst = new ItemSpade(ToolMaterialList.amethyst, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelamethyst")),
		ItemList.shovelcitrine = new ItemSpade(ToolMaterialList.citrine, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelcitrine")),
	    ItemList.shovelchrysocolla = new ItemSpade(ToolMaterialList.chrysocolla, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelchrysocolla")),
        ItemList.shovelgarnet = new ItemSpade(ToolMaterialList.garnet, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelgarnet")),
		ItemList.shoveljade = new ItemSpade(ToolMaterialList.jade, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shoveljade")),
		ItemList.shoveljasper = new ItemSpade(ToolMaterialList.jasper, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shoveljasper")),
		ItemList.shovelmalachite = new ItemSpade(ToolMaterialList.malachite, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelmalachite")),
		ItemList.shovelonyx = new ItemSpade(ToolMaterialList.onyx, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelonyx")),
		ItemList.shovelphoenixite = new GPPPhoenixiteShovel(ToolMaterialList.phoenixite, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelphoenixite")),
		ItemList.shovelruby = new ItemSpade(ToolMaterialList.ruby, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelruby")),
		ItemList.shovelsapphire = new ItemSpade(ToolMaterialList.sapphire, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelsapphire")),
		ItemList.shovelspinel = new ItemSpade(ToolMaterialList.spinel, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelspinel")),
		ItemList.shovelsugilite = new ItemSpade(ToolMaterialList.sugilite, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shovelsugilite")),
		ItemList.shoveltopaz = new ItemSpade(ToolMaterialList.topaz, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shoveltopaz")),
		ItemList.shoveltourmaline = new ItemSpade(ToolMaterialList.tourmaline, -1, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("shoveltourmaline")),
					
		ItemList.swordagate = new ItemSword(ToolMaterialList.agate, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordagate")),
	    ItemList.swordamethyst = new ItemSword(ToolMaterialList.amethyst, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordamethyst")),
		ItemList.swordcitrine = new ItemSword(ToolMaterialList.citrine, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordcitrine")),
		ItemList.swordchrysocolla = new ItemSword(ToolMaterialList.chrysocolla, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordchrysocolla")),
	    ItemList.swordgarnet = new ItemSword(ToolMaterialList.garnet, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordgarnet")),
		ItemList.swordjade = new ItemSword(ToolMaterialList.jade, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordjade")),
		ItemList.swordjasper = new ItemSword(ToolMaterialList.jasper, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordjasper")),
	    ItemList.swordmalachite = new ItemSword(ToolMaterialList.malachite, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordmalachite")),
	    ItemList.swordonyx = new ItemSword(ToolMaterialList.onyx, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordonyx")),
		ItemList.swordphoenixite = new GPPPhoenixiteSword(ToolMaterialList.phoenixite, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordphoenixite")),
	    ItemList.swordruby = new ItemSword(ToolMaterialList.ruby, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordruby")),
		ItemList.swordsapphire = new ItemSword(ToolMaterialList.sapphire, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordsapphire")),
		ItemList.swordspinel = new ItemSword(ToolMaterialList.spinel, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordspinel")),
		ItemList.swordsugilite = new ItemSword(ToolMaterialList.sugilite, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordsugilite")),
		ItemList.swordtopaz = new ItemSword(ToolMaterialList.topaz, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordtopaz")),
		ItemList.swordtourmaline = new ItemSword(ToolMaterialList.tourmaline, 0, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("swordtourmaline")),					
		
		ItemList.hoeagate = new ItemHoe(ToolMaterialList.agate, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoeagate")),
	    ItemList.hoeamethyst = new ItemHoe(ToolMaterialList.amethyst, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoeamethyst")),
		ItemList.hoecitrine = new ItemHoe(ToolMaterialList.citrine, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoecitrine")),
		ItemList.hoechrysocolla = new ItemHoe(ToolMaterialList.chrysocolla, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoechrysocolla")),
	    ItemList.hoegarnet = new ItemHoe(ToolMaterialList.garnet, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoegarnet")),
		ItemList.hoejade = new ItemHoe(ToolMaterialList.jade, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoejade")),
		ItemList.hoejasper = new ItemHoe(ToolMaterialList.jasper, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoejasper")),
		ItemList.hoemalachite = new ItemHoe(ToolMaterialList.malachite, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoemalachite")),
		ItemList.hoeonyx = new ItemHoe(ToolMaterialList.onyx, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoeonyx")),
		ItemList.hoephoenixite = new GPPPhoenixiteHoe(ToolMaterialList.phoenixite, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoephoenixite")),
		ItemList.hoeruby = new ItemHoe(ToolMaterialList.ruby, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoeruby")),
		ItemList.hoesapphire = new ItemHoe(ToolMaterialList.sapphire, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoesapphire")),
		ItemList.hoespinel = new ItemHoe(ToolMaterialList.spinel, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoespinel")),
		ItemList.hoesugilite = new ItemHoe(ToolMaterialList.sugilite, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoesugilite")),
		ItemList.hoetopaz = new ItemHoe(ToolMaterialList.topaz, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoetopaz")),
		ItemList.hoetourmaline = new ItemHoe(ToolMaterialList.tourmaline, 6.0f, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("hoetourmaline")),
		
		ItemList.oreagate = new ItemBlock(BlockList.oreagate, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oreagate.getRegistryName()),
	    ItemList.oreamethyst = new ItemBlock(BlockList.oreamethyst, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oreamethyst.getRegistryName()),
		ItemList.orecitrine = new ItemBlock(BlockList.orecitrine, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.orecitrine.getRegistryName()),
		ItemList.orechrysocolla = new ItemBlock(BlockList.orechrysocolla, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.orechrysocolla.getRegistryName()),
		ItemList.oregarnet = new ItemBlock(BlockList.oregarnet, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oregarnet.getRegistryName()),
		ItemList.orejade = new ItemBlock(BlockList.orejade, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.orejade.getRegistryName()),
		ItemList.orejasper = new ItemBlock(BlockList.orejasper, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.orejasper.getRegistryName()),
		ItemList.oremalachite = new ItemBlock(BlockList.oremalachite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oremalachite.getRegistryName()),
		ItemList.oreonyx = new ItemBlock(BlockList.oreonyx, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oreonyx.getRegistryName()),
		ItemList.orephoenixite = new ItemBlock(BlockList.orephoenixite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.orephoenixite.getRegistryName()),
		ItemList.oreruby = new ItemBlock(BlockList.oreruby, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oreruby.getRegistryName()),
		ItemList.oresapphire = new ItemBlock(BlockList.oresapphire, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oresapphire.getRegistryName()),
		ItemList.orespinel = new ItemBlock(BlockList.orespinel, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.orespinel.getRegistryName()),
		ItemList.oresugilite = new ItemBlock(BlockList.oresugilite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oresugilite.getRegistryName()),
		ItemList.oretopaz = new ItemBlock(BlockList.oretopaz, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oretopaz.getRegistryName()),
		ItemList.oretourmaline = new ItemBlock(BlockList.oretourmaline, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.oretourmaline.getRegistryName()),
	    
		ItemList.sandagate = new ItemBlock(BlockList.sandagate, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandagate.getRegistryName()),
	    ItemList.sandamethyst = new ItemBlock(BlockList.sandamethyst, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandamethyst.getRegistryName()),
		ItemList.sandcitrine = new ItemBlock(BlockList.sandcitrine, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandcitrine.getRegistryName()),
		ItemList.sandchrysocolla = new ItemBlock(BlockList.sandchrysocolla, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandchrysocolla.getRegistryName()),
		ItemList.sandgarnet = new ItemBlock(BlockList.sandgarnet, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandgarnet.getRegistryName()),
		ItemList.sandjade = new ItemBlock(BlockList.sandjade, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandjade.getRegistryName()),
		ItemList.sandjasper = new ItemBlock(BlockList.sandjasper, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandjasper.getRegistryName()),
		ItemList.sandmalachite = new ItemBlock(BlockList.sandmalachite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandmalachite.getRegistryName()),
		ItemList.sandonyx = new ItemBlock(BlockList.sandonyx, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandonyx.getRegistryName()),
		ItemList.sandphoenixite = new ItemBlock(BlockList.sandphoenixite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandphoenixite.getRegistryName()),
		ItemList.sandruby = new ItemBlock(BlockList.sandruby, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandruby.getRegistryName()),
		ItemList.sandsapphire = new ItemBlock(BlockList.sandsapphire, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandsapphire.getRegistryName()),
		ItemList.sandspinel = new ItemBlock(BlockList.sandspinel, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandspinel.getRegistryName()),
		ItemList.sandsugilite = new ItemBlock(BlockList.sandsugilite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandsugilite.getRegistryName()),
		ItemList.sandtopaz = new ItemBlock(BlockList.sandtopaz, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandtopaz.getRegistryName()),
		ItemList.sandtourmaline = new ItemBlock(BlockList.sandtourmaline, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sandtourmaline.getRegistryName()),
		
		ItemList.netheroreagate = new ItemBlock(BlockList.netheroreagate, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroreagate.getRegistryName()),
	    ItemList.netheroreamethyst = new ItemBlock(BlockList.netheroreamethyst, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroreamethyst.getRegistryName()),
		ItemList.netherorecitrine = new ItemBlock(BlockList.netherorecitrine, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netherorecitrine.getRegistryName()),
		ItemList.netherorechrysocolla = new ItemBlock(BlockList.netherorechrysocolla, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netherorechrysocolla.getRegistryName()),
		ItemList.netheroregarnet = new ItemBlock(BlockList.netheroregarnet, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroregarnet.getRegistryName()),
		ItemList.netherorejade = new ItemBlock(BlockList.netherorejade, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netherorejade.getRegistryName()),
		ItemList.netherorejasper = new ItemBlock(BlockList.netherorejasper, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netherorejasper.getRegistryName()),
		ItemList.netheroremalachite = new ItemBlock(BlockList.netheroremalachite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroremalachite.getRegistryName()),
		ItemList.netheroreonyx = new ItemBlock(BlockList.netheroreonyx, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroreonyx.getRegistryName()),
		ItemList.netherorephoenixite = new ItemBlock(BlockList.netherorephoenixite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netherorephoenixite.getRegistryName()),
		ItemList.netheroreruby = new ItemBlock(BlockList.netheroreruby, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroreruby.getRegistryName()),
		ItemList.netheroresapphire = new ItemBlock(BlockList.netheroresapphire, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroresapphire.getRegistryName()),
		ItemList.netherorespinel = new ItemBlock(BlockList.netherorespinel, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netherorespinel.getRegistryName()),
		ItemList.netheroresugilite = new ItemBlock(BlockList.netheroresugilite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroresugilite.getRegistryName()),
		ItemList.netheroretopaz = new ItemBlock(BlockList.netheroretopaz, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroretopaz.getRegistryName()),
		ItemList.netheroretourmaline = new ItemBlock(BlockList.netheroretourmaline, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.netheroretourmaline.getRegistryName()),
	    
		ItemList.glassagate = new ItemBlock(BlockList.glassagate, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassagate.getRegistryName()),
	    ItemList.glassamethyst = new ItemBlock(BlockList.glassamethyst, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassamethyst.getRegistryName()),
		ItemList.glasscitrine = new ItemBlock(BlockList.glasscitrine, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glasscitrine.getRegistryName()),
		ItemList.glasschrysocolla = new ItemBlock(BlockList.glasschrysocolla, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glasschrysocolla.getRegistryName()),
		ItemList.glassgarnet = new ItemBlock(BlockList.glassgarnet, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassgarnet.getRegistryName()),
		ItemList.glassjade = new ItemBlock(BlockList.glassjade, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassjade.getRegistryName()),
		ItemList.glassjasper = new ItemBlock(BlockList.glassjasper, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassjasper.getRegistryName()),
		ItemList.glassmalachite = new ItemBlock(BlockList.glassmalachite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassmalachite.getRegistryName()),
		ItemList.glassonyx = new ItemBlock(BlockList.glassonyx, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassonyx.getRegistryName()),
		ItemList.glassphoenixite = new ItemBlock(BlockList.glassphoenixite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassphoenixite.getRegistryName()),
		ItemList.glassruby = new ItemBlock(BlockList.glassruby, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassruby.getRegistryName()),
		ItemList.glasssapphire = new ItemBlock(BlockList.glasssapphire, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glasssapphire.getRegistryName()),
		ItemList.glassspinel = new ItemBlock(BlockList.glassspinel, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glassspinel.getRegistryName()),
		ItemList.glasssugilite = new ItemBlock(BlockList.glasssugilite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glasssugilite.getRegistryName()),
		ItemList.glasstopaz = new ItemBlock(BlockList.glasstopaz, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glasstopaz.getRegistryName()),
		ItemList.glasstourmaline = new ItemBlock(BlockList.glasstourmaline, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.glasstourmaline.getRegistryName()),
	    
		ItemList.blockagate = new ItemBlock(BlockList.blockagate, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockagate.getRegistryName()),
	    ItemList.blockamethyst = new ItemBlock(BlockList.blockamethyst, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockamethyst.getRegistryName()),
		ItemList.blockcitrine = new ItemBlock(BlockList.blockcitrine, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockcitrine.getRegistryName()),
		ItemList.blockchrysocolla = new ItemBlock(BlockList.blockchrysocolla, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockchrysocolla.getRegistryName()),
		ItemList.blockgarnet = new ItemBlock(BlockList.blockgarnet, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockgarnet.getRegistryName()),
		ItemList.blockjade = new ItemBlock(BlockList.blockjade, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockjade.getRegistryName()),
		ItemList.blockjasper = new ItemBlock(BlockList.blockjasper, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockjasper.getRegistryName()),
		ItemList.blockmalachite = new ItemBlock(BlockList.blockmalachite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockmalachite.getRegistryName()),
		ItemList.blockonyx = new ItemBlock(BlockList.blockonyx, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockonyx.getRegistryName()),
		ItemList.blockphoenixite = new ItemBlock(BlockList.blockphoenixite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockphoenixite.getRegistryName()),
		ItemList.blockruby = new ItemBlock(BlockList.blockruby, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockruby.getRegistryName()),
		ItemList.blocksapphire = new ItemBlock(BlockList.blocksapphire, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blocksapphire.getRegistryName()),
		ItemList.blockspinel = new ItemBlock(BlockList.blockspinel, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blockspinel.getRegistryName()),
		ItemList.blocksugilite = new ItemBlock(BlockList.blocksugilite, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blocksugilite.getRegistryName()),
		ItemList.blocktopaz = new ItemBlock(BlockList.blocktopaz, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blocktopaz.getRegistryName()),
		ItemList.blocktourmaline = new ItemBlock(BlockList.blocktourmaline, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.blocktourmaline.getRegistryName()),
	    
		ItemList.agateglasspane = new ItemBlock(BlockList.agateglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.agateglasspane.getRegistryName()),
		ItemList.amethystglasspane = new ItemBlock(BlockList.amethystglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.amethystglasspane.getRegistryName()),
		ItemList.citrineglasspane = new ItemBlock(BlockList.citrineglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.citrineglasspane.getRegistryName()),
		ItemList.chrysocollaglasspane = new ItemBlock(BlockList.chrysocollaglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.chrysocollaglasspane.getRegistryName()),
		ItemList.garnetglasspane = new ItemBlock(BlockList.garnetglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.garnetglasspane.getRegistryName()),
		ItemList.jadeglasspane = new ItemBlock(BlockList.jadeglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.jadeglasspane.getRegistryName()),
		ItemList.jasperglasspane = new ItemBlock(BlockList.jasperglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.jasperglasspane.getRegistryName()),
		ItemList.malachiteglasspane = new ItemBlock(BlockList.malachiteglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.malachiteglasspane.getRegistryName()),
		ItemList.onyxglasspane = new ItemBlock(BlockList.onyxglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.onyxglasspane.getRegistryName()),
		ItemList.phoenixiteglasspane = new ItemBlock(BlockList.phoenixiteglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.phoenixiteglasspane.getRegistryName()),
		ItemList.rubyglasspane = new ItemBlock(BlockList.rubyglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.rubyglasspane.getRegistryName()),
		ItemList.sapphireglasspane = new ItemBlock(BlockList.sapphireglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sapphireglasspane.getRegistryName()),
		ItemList.spinelglasspane = new ItemBlock(BlockList.spinelglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.spinelglasspane.getRegistryName()),
		ItemList.sugiliteglasspane = new ItemBlock(BlockList.sugiliteglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.sugiliteglasspane.getRegistryName()),
		ItemList.topazglasspane = new ItemBlock(BlockList.topazglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.topazglasspane.getRegistryName()),
		ItemList.tourmalineglasspane = new ItemBlock(BlockList.tourmalineglasspane, new Item.Properties().group(gemsplusplusblock)).setRegistryName(BlockList.tourmalineglasspane.getRegistryName()),
		
		ItemList.helmetagate = new GPPArmor(ArmorMaterialList.AGATE, EntityEquipmentSlot.HEAD, new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetagate")),
		ItemList.helmetamethyst = new GPPArmor(ArmorMaterialList.AMETHYST, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetamethyst")),
		ItemList.helmetcitrine = new GPPArmor(ArmorMaterialList.CITRINE, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetcitrine")),
		ItemList.helmetchrysocolla = new GPPArmor(ArmorMaterialList.CHRYSOCOLLA, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetchrysocolla")),
		ItemList.helmetgarnet = new GPPArmor(ArmorMaterialList.GARNET, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetgarnet")),
		ItemList.helmetjade = new GPPArmor(ArmorMaterialList.JADE, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetjade")),
		ItemList.helmetjasper = new GPPArmor(ArmorMaterialList.JASPER, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetjasper")),
		ItemList.helmetmalachite = new GPPArmor(ArmorMaterialList.MALACHITE, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetmalachite")),
		ItemList.helmetonyx = new GPPArmor(ArmorMaterialList.ONYX, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetonyx")),
		ItemList.helmetphoenixite = new GPPArmor(ArmorMaterialList.PHOENIXITE, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetphoenixite")),
		ItemList.helmetruby = new GPPArmor(ArmorMaterialList.RUBY, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetruby")),
		ItemList.helmetsapphire = new GPPArmor(ArmorMaterialList.SAPPHIRE, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetsapphire")),
		ItemList.helmetspinel = new GPPArmor(ArmorMaterialList.SPINEL, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetspinel")),
		ItemList.helmetsugilite = new GPPArmor(ArmorMaterialList.SUGILITE, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmetsugilite")),
		ItemList.helmettopaz = new GPPArmor(ArmorMaterialList.TOPAZ, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmettopaz")),
		ItemList.helmettourmaline = new GPPArmor(ArmorMaterialList.TOURMALINE, EntityEquipmentSlot.HEAD,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("helmettourmaline")),
		ItemList.bootsphoenixite = new GPPArmor(ArmorMaterialList.PHOENIXITE, EntityEquipmentSlot.FEET,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("bootsphoenixite")),
		ItemList.leggingsphoenixite = new GPPArmor(ArmorMaterialList.PHOENIXITE, EntityEquipmentSlot.LEGS,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("leggingsphoenixite")),
		ItemList.chestplatephoenixite = new GPPArmor(ArmorMaterialList.PHOENIXITE, EntityEquipmentSlot.CHEST,new Item.Properties().group(gemsplusplusitem)).setRegistryName(location("chestplatephoenixite"))
		
		);
		logger.info("Items Registered");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			
			event.getRegistry().registerAll(
			BlockList.oreagate = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oreagate")),
			BlockList.oreamethyst = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oreamethyst")),
			BlockList.orecitrine = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("orecitrine")),
			BlockList.orechrysocolla = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("orechrysocolla")),
			BlockList.oregarnet = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oregarnet")),
			BlockList.orejade = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("orejade")),
			BlockList.orejasper = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("orejasper")),
			BlockList.oremalachite = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oremalachite")),
			BlockList.oreonyx = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oreonyx")),
			BlockList.orephoenixite = new GPPOrePhoenixite(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).lightValue(5).needsRandomTick().sound(SoundType.STONE)).setRegistryName(location("orephoenixite")),
			BlockList.oreruby = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oreruby")),
			BlockList.oresapphire = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oresapphire")),
			BlockList.orespinel = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("orespinel")),
			BlockList.oresugilite = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oresugilite")),
			BlockList.oretopaz = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oretopaz")),
			BlockList.oretourmaline = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("oretourmaline")),
			
			BlockList.glassagate = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glassagate")),
		    BlockList.glassamethyst = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glassamethyst")),
			BlockList.glasscitrine = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glasscitrine")),
			BlockList.glasschrysocolla = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glasschrysocolla")),
			BlockList.glassgarnet = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glassgarnet")),
			BlockList.glassjade = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glassjade")),
			BlockList.glassjasper = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glassjasper")),
			BlockList.glassmalachite = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glassmalachite")),
			BlockList.glassonyx = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glassonyx")),
			BlockList.glassphoenixite = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).lightValue(5).sound(SoundType.GLASS)).setRegistryName(location("glassphoenixite")),
			BlockList.glassruby = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glassruby")),
			BlockList.glasssapphire = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glasssapphire")),
			BlockList.glassspinel = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glassspinel")),
			BlockList.glasssugilite = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glasssugilite")),
			BlockList.glasstopaz = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glasstopaz")),
			BlockList.glasstourmaline = new GPPGlass(Block.Properties.create(Material.GLASS).hardnessAndResistance(2.0f).sound(SoundType.GLASS)).setRegistryName(location("glasstourmaline")),
			
			BlockList.netheroreagate = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroreagate")),
			BlockList.netheroreamethyst = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroreamethyst")),
			BlockList.netherorecitrine = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netherorecitrine")),
			BlockList.netherorechrysocolla = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netherorechrysocolla")),
			BlockList.netheroregarnet = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroregarnet")),
			BlockList.netherorejade = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netherorejade")),
			BlockList.netherorejasper = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netherorejasper")),
			BlockList.netheroremalachite = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroremalachite")),
			BlockList.netheroreonyx = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroreonyx")),
			BlockList.netherorephoenixite = new GPPOrePhoenixite(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).lightValue(5).needsRandomTick().sound(SoundType.STONE)).setRegistryName(location("netherorephoenixite")),
			BlockList.netheroreruby = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroreruby")),
			BlockList.netheroresapphire = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroresapphire")),
			BlockList.netherorespinel = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netherorespinel")),
			BlockList.netheroresugilite = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroresugilite")),
			BlockList.netheroretopaz = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroretopaz")),
		    BlockList.netheroretourmaline = new GPPOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("netheroretourmaline")),
		    
		    BlockList.sandagate = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandagate")),
			BlockList.sandamethyst = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandamethyst")),
			BlockList.sandcitrine = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandcitrine")),
			BlockList.sandchrysocolla = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandchrysocolla")),
			BlockList.sandgarnet = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandgarnet")),
			BlockList.sandjade = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandjade")),
			BlockList.sandjasper = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandjasper")),
			BlockList.sandmalachite = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandmalachite")),
			BlockList.sandonyx = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandonyx")),
			BlockList.sandphoenixite = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).lightValue(5).sound(SoundType.SAND)).setRegistryName(location("sandphoenixite")),
			BlockList.sandruby = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandruby")),
			BlockList.sandsapphire = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandsapphire")),
			BlockList.sandspinel = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandspinel")),
			BlockList.sandsugilite = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandsugilite")),
			BlockList.sandtopaz = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandtopaz")),
			BlockList.sandtourmaline = new BlockSand(0,Block.Properties.create(Material.SAND).hardnessAndResistance(0.2f, 2f).sound(SoundType.SAND)).setRegistryName(location("sandtourmaline")),
			
			BlockList.blockagate = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockagate")),
	     	BlockList.blockamethyst = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockamethyst")),
			BlockList.blockcitrine = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockcitrine")),
			BlockList.blockchrysocolla = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockchrysocolla")),
			BlockList.blockgarnet = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockgarnet")),
			BlockList.blockjade = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockjade")),
			BlockList.blockjasper = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockjasper")),
			BlockList.blockmalachite = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockmalachite")),
			BlockList.blockonyx = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockonyx")),
			BlockList.blockphoenixite = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).lightValue(5).sound(SoundType.STONE)).setRegistryName(location("blockphoenixite")),
			BlockList.blockruby = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockruby")),
			BlockList.blocksapphire = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blocksapphire")),
			BlockList.blockspinel = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blockspinel")),
			BlockList.blocksugilite = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blocksugilite")),
			BlockList.blocktopaz = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blocktopaz")),
			BlockList.blocktourmaline = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 10f).sound(SoundType.STONE)).setRegistryName(location("blocktourmaline")),		
			
			BlockList.agateglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("agateglasspane")),
	        BlockList.amethystglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("amethystglasspane")),
	        BlockList.citrineglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("citrineglasspane")),
	        BlockList.chrysocollaglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("chrysocollaglasspane")),
	        BlockList.garnetglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("garnetglasspane")),
	        BlockList.jadeglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("jadeglasspane")),
	        BlockList.jasperglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("jasperglasspane")),
	        BlockList.malachiteglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("malachiteglasspane")),
	        BlockList.onyxglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("onyxglasspane")),
	        BlockList.phoenixiteglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS).lightValue(5)).setRegistryName(location("phoenixiteglasspane")),
	        BlockList.rubyglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("rubyglasspane")),
	        BlockList.sapphireglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("sapphireglasspane")),
	        BlockList.spinelglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("spinelglasspane")),
	        BlockList.sugiliteglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("sugiliteglasspane")),
	        BlockList.topazglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("topazglasspane")),
	        BlockList.tourmalineglasspane = new GPPGlassPane(Block.Properties.create(Material.GLASS).hardnessAndResistance(1f).sound(SoundType.GLASS)).setRegistryName(location("tourmalineglasspane"))
	        
			);
			
			
			
			logger.info("Blocks Registered");
			
		}
		
		private static ResourceLocation location(String name) {
			return new ResourceLocation(References.MODID, name);
		}
		
		@SubscribeEvent
		public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
		{
			System.out.println("Testing");	
		}
	}

}
