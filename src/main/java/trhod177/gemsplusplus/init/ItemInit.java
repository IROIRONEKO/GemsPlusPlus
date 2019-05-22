package trhod177.gemsplusplus.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.items.GPPCustomAxe;
import trhod177.gemsplusplus.items.GPPCustomHoe;
import trhod177.gemsplusplus.items.GPPCustomPickaxe;
import trhod177.gemsplusplus.items.GPPCustomShovel;
import trhod177.gemsplusplus.items.GPPCustomSword;
import trhod177.gemsplusplus.items.GPPItemGem;
import trhod177.gemsplusplus.items.GPPPhoenixiteAxe;
import trhod177.gemsplusplus.items.GPPPhoenixiteHoe;
import trhod177.gemsplusplus.items.GPPPhoenixitePickaxe;
import trhod177.gemsplusplus.items.GPPPhoenixiteShovel;
import trhod177.gemsplusplus.items.GPPPhoenixiteSword;



public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//addToolMaterial(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)
	public static final ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 2500, 15f, 3f, 30).setRepairItem(new ItemStack(Items.EMERALD));
	public static final ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 900, 5f, 2.0f, 19).setRepairItem(new ItemStack(ItemInit.ruby));
	public static final ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 900, 5f, 2.0f, 19).setRepairItem(new ItemStack(ItemInit.sapphire));
	public static final ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2, 600, 6f, 2.0f, 10).setRepairItem(new ItemStack(ItemInit.amethyst));
	public static final ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 800, 6f, 3.0f, 15).setRepairItem(new ItemStack(ItemInit.topaz));
	public static final ToolMaterial PHOENIXITE = EnumHelper.addToolMaterial("PHOENIXITE", 3, 700, 6f, 3.0f, 15).setRepairItem(new ItemStack(Items.LAVA_BUCKET));
	public static final ToolMaterial JADE = EnumHelper.addToolMaterial("JADE", 2, 600, 6f, 3.0f, 15).setRepairItem(new ItemStack(ItemInit.jade));
	public static final ToolMaterial CITRINE = EnumHelper.addToolMaterial("CITRINE", 2, 700, 6f, 3.0f, 17).setRepairItem(new ItemStack(ItemInit.citrine));
	public static final ToolMaterial GARNET = EnumHelper.addToolMaterial("GARNET", 2, 700, 5.5f, 2.0f, 16).setRepairItem(new ItemStack(ItemInit.garnet));
	public static final ToolMaterial SPINEL = EnumHelper.addToolMaterial("SPINEL", 2, 750, 6.5f, 2.0f, 15).setRepairItem(new ItemStack(ItemInit.spinel));
	public static final ToolMaterial ONYX = EnumHelper.addToolMaterial("ONYX", 2, 650, 6f, 2.0f, 17).setRepairItem(new ItemStack(ItemInit.onyx));
	public static final ToolMaterial AGATE = EnumHelper.addToolMaterial("AGATE", 2, 675, 6f, 2.0f, 18).setRepairItem(new ItemStack(ItemInit.agate));
	public static final ToolMaterial MALACHITE = EnumHelper.addToolMaterial("MALACHITE", 2, 375, 4f, 1.0f, 9).setRepairItem(new ItemStack(ItemInit.malachite));
	public static final ToolMaterial TOURMALINE = EnumHelper.addToolMaterial("TOURMALINE", 2, 725, 6.5f, 2.0f, 15).setRepairItem(new ItemStack(ItemInit.tourmaline));
	public static final ToolMaterial CHRYSOCOLLA = EnumHelper.addToolMaterial("CHRYSOCOLLA", 2, 300, 4f, 1.0f, 7).setRepairItem(new ItemStack(ItemInit.chrysocolla));
	public static final ToolMaterial JASPER = EnumHelper.addToolMaterial("JASPER", 2, 675, 5.5f, 2.0f, 16).setRepairItem(new ItemStack(ItemInit.jasper));
	public static final ToolMaterial SUGILITE = EnumHelper.addToolMaterial("SUGILITE", 2, 625, 6f, 2.0f, 17).setRepairItem(new ItemStack(ItemInit.sugilite));
	
	public static final GPPItemGem ruby = new GPPItemGem("ruby").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem sapphire = new GPPItemGem("sapphire").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem amethyst = new GPPItemGem("amethyst").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem topaz = new GPPItemGem("topaz").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem phoenixite = new GPPItemGem("phoenixite").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem jade = new GPPItemGem("jade").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem citrine = new GPPItemGem("citrine").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem garnet = new GPPItemGem("garnet").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem spinel = new GPPItemGem("spinel").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem onyx = new GPPItemGem("onyx").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem agate = new GPPItemGem("agate").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem malachite = new GPPItemGem("malachite").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem tourmaline = new GPPItemGem("tourmaline").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem chrysocolla = new GPPItemGem("chrysocolla").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem jasper = new GPPItemGem("jasper").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem sugilite = new GPPItemGem("sugilite").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final GPPCustomAxe axeruby = new GPPCustomAxe("axeruby", RUBY).setCreativeTab(GemsPlusPlus.GPPItemsTab);
    public static final GPPCustomAxe axesapphire = new GPPCustomAxe("axesapphire", SAPPHIRE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axeamethyst = new GPPCustomAxe("axeamethyst", AMETHYST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axetopaz = new GPPCustomAxe("axetopaz", TOPAZ).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPPhoenixiteAxe axephoenixite = new GPPPhoenixiteAxe("axephoenixite", PHOENIXITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axejade = new GPPCustomAxe("axejade", JADE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axecitrine = new GPPCustomAxe("axecitrine", CITRINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axegarnet = new GPPCustomAxe("axegarnet", GARNET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axespinel = new GPPCustomAxe("axespinel", SPINEL).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axeonyx = new GPPCustomAxe("axeonyx", ONYX).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axeagate = new GPPCustomAxe("axeagate", AGATE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axemalachite = new GPPCustomAxe("axemalachite", MALACHITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axetourmaline = new GPPCustomAxe("axetourmaline", TOURMALINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axechrysocolla = new GPPCustomAxe("axechrysocolla", CHRYSOCOLLA).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axejasper = new GPPCustomAxe("axejasper", JASPER).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axesugilite = new GPPCustomAxe("axesugilite", SUGILITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomAxe axeemerald = new GPPCustomAxe("axeemerald", EMERALD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final GPPCustomPickaxe pickaxeruby = new GPPCustomPickaxe("pickaxeruby", RUBY).setCreativeTab(GemsPlusPlus.GPPItemsTab);
    public static final GPPCustomPickaxe pickaxesapphire = new GPPCustomPickaxe("pickaxesapphire", SAPPHIRE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxeamethyst = new GPPCustomPickaxe("pickaxeamethyst", AMETHYST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxetopaz = new GPPCustomPickaxe("pickaxetopaz", TOPAZ).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPPhoenixitePickaxe pickaxephoenixite = new GPPPhoenixitePickaxe("pickaxephoenixite", PHOENIXITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxejade = new GPPCustomPickaxe("pickaxejade", JADE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxecitrine = new GPPCustomPickaxe("pickaxecitrine", CITRINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxegarnet = new GPPCustomPickaxe("pickaxegarnet", GARNET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxespinel = new GPPCustomPickaxe("pickaxespinel", SPINEL).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxeonyx = new GPPCustomPickaxe("pickaxeonyx", ONYX).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxeagate = new GPPCustomPickaxe("pickaxeagate", AGATE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxemalachite = new GPPCustomPickaxe("pickaxemalachite", MALACHITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxetourmaline = new GPPCustomPickaxe("pickaxetourmaline", TOURMALINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxechrysocolla = new GPPCustomPickaxe("pickaxechrysocolla", CHRYSOCOLLA).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxejasper = new GPPCustomPickaxe("pickaxejasper", JASPER).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxesugilite = new GPPCustomPickaxe("pickaxesugilite", SUGILITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomPickaxe pickaxeemerald = new GPPCustomPickaxe("pickaxeemerald", EMERALD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final GPPCustomShovel shovelruby = new GPPCustomShovel("shovelruby", RUBY).setCreativeTab(GemsPlusPlus.GPPItemsTab);
    public static final GPPCustomShovel shovelsapphire = new GPPCustomShovel("shovelsapphire", SAPPHIRE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelamethyst = new GPPCustomShovel("shovelamethyst", AMETHYST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shoveltopaz = new GPPCustomShovel("shoveltopaz", TOPAZ).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPPhoenixiteShovel shovelphoenixite = new GPPPhoenixiteShovel("shovelphoenixite", PHOENIXITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shoveljade = new GPPCustomShovel("shoveljade", JADE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelcitrine = new GPPCustomShovel("shovelcitrine", CITRINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelgarnet = new GPPCustomShovel("shovelgarnet", GARNET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelspinel = new GPPCustomShovel("shovelspinel", SPINEL).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelonyx = new GPPCustomShovel("shovelonyx", ONYX).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelagate = new GPPCustomShovel("shovelagate", AGATE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelmalachite = new GPPCustomShovel("shovelmalachite", MALACHITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shoveltourmaline = new GPPCustomShovel("shoveltourmaline", TOURMALINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelchrysocolla = new GPPCustomShovel("shovelchrysocolla", CHRYSOCOLLA).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shoveljasper = new GPPCustomShovel("shoveljasper", JASPER).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelsugilite = new GPPCustomShovel("shovelsugilite", SUGILITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomShovel shovelemerald = new GPPCustomShovel("shovelemerald", EMERALD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final GPPCustomHoe hoeruby = new GPPCustomHoe("hoeruby", RUBY).setCreativeTab(GemsPlusPlus.GPPItemsTab);
    public static final GPPCustomHoe hoesapphire = new GPPCustomHoe("hoesapphire", SAPPHIRE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoeamethyst = new GPPCustomHoe("hoeamethyst", AMETHYST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoetopaz = new GPPCustomHoe("hoetopaz", TOPAZ).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPPhoenixiteHoe hoephoenixite = new GPPPhoenixiteHoe("hoephoenixite", PHOENIXITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoejade = new GPPCustomHoe("hoejade", JADE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoecitrine = new GPPCustomHoe("hoecitrine", CITRINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoegarnet = new GPPCustomHoe("hoegarnet", GARNET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoespinel = new GPPCustomHoe("hoespinel", SPINEL).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoeonyx = new GPPCustomHoe("hoeonyx", ONYX).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoeagate = new GPPCustomHoe("hoeagate", AGATE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoemalachite = new GPPCustomHoe("hoemalachite", MALACHITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoetourmaline = new GPPCustomHoe("hoetourmaline", TOURMALINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoechrysocolla = new GPPCustomHoe("hoechrysocolla", CHRYSOCOLLA).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoejasper = new GPPCustomHoe("hoejasper", JASPER).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoesugilite = new GPPCustomHoe("hoesugilite", SUGILITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomHoe hoeemerald = new GPPCustomHoe("hoeemerald", EMERALD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final GPPCustomSword swordruby = new GPPCustomSword("swordruby", RUBY).setCreativeTab(GemsPlusPlus.GPPItemsTab);
    public static final GPPCustomSword swordsapphire = new GPPCustomSword("swordsapphire", SAPPHIRE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordamethyst = new GPPCustomSword("swordamethyst", AMETHYST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordtopaz = new GPPCustomSword("swordtopaz", TOPAZ).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPPhoenixiteSword swordphoenixite = new GPPPhoenixiteSword("swordphoenixite", PHOENIXITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordjade = new GPPCustomSword("swordjade", JADE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordcitrine = new GPPCustomSword("swordcitrine", CITRINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordgarnet = new GPPCustomSword("swordgarnet", GARNET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordspinel = new GPPCustomSword("swordspinel", SPINEL).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordonyx = new GPPCustomSword("swordonyx", ONYX).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordagate = new GPPCustomSword("swordagate", AGATE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordmalachite = new GPPCustomSword("swordmalachite", MALACHITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordtourmaline = new GPPCustomSword("swordtourmaline", TOURMALINE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordchrysocolla = new GPPCustomSword("swordchrysocolla", CHRYSOCOLLA).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordjasper = new GPPCustomSword("swordjasper", JASPER).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordsugilite = new GPPCustomSword("swordsugilite", SUGILITE).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPCustomSword swordemerald = new GPPCustomSword("swordemerald", EMERALD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
    public static final GPPItemGem dustruby = new GPPItemGem("dustruby").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustsapphire = new GPPItemGem("dustsapphire").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustamethyst = new GPPItemGem("dustamethyst").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dusttopaz = new GPPItemGem("dusttopaz").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustphoenixite = new GPPItemGem("dustphoenixite").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustjade = new GPPItemGem("dustjade").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustcitrine = new GPPItemGem("dustcitrine").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustgarnet = new GPPItemGem("dustgarnet").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustspinel = new GPPItemGem("dustspinel").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustonyx = new GPPItemGem("dustonyx").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustagate = new GPPItemGem("dustagate").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustmalachite = new GPPItemGem("dustmalachite").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dusttourmaline = new GPPItemGem("dusttourmaline").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustchrysocolla = new GPPItemGem("dustchrysocolla").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustjasper = new GPPItemGem("dustjasper").setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final GPPItemGem dustsugilite = new GPPItemGem("dustsugilite").setCreativeTab(GemsPlusPlus.GPPItemsTab);


}

