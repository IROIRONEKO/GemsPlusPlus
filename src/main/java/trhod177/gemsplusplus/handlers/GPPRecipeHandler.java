package trhod177.gemsplusplus.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.gemsplusplus.init.ArmourInit;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;

public class GPPRecipeHandler {

	public static void registerCraftingBlocks() {
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsagate), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.agate, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetagate), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.agate, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplateagate), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.agate, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsagate), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.agate, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsemerald), new Object[] {"XXX","SXS","SXS", 'S', Items.EMERALD, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetemerald), new Object[] {"SSS","SXS","XXX", 'S', Items.EMERALD, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplateemerald), new Object[] {"SXS","SSS","SSS", 'S', Items.EMERALD, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsemerald), new Object[] {"SSS","SXS","SXS", 'S', Items.EMERALD, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsruby), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.ruby, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetruby), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.ruby, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplateruby), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.ruby, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsruby), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.ruby, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootssapphire), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.sapphire, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetsapphire), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.sapphire, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatesapphire), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.sapphire, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingssapphire), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.sapphire, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsamethyst), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.amethyst, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetamethyst), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.amethyst, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplateamethyst), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.amethyst, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsamethyst), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.amethyst, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootstopaz), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.topaz, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmettopaz), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.topaz, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatetopaz), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.topaz, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingstopaz), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.topaz, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsphoenixite), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.phoenixite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetphoenixite), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.phoenixite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatephoenixite), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.phoenixite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsphoenixite), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.phoenixite, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsjade), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.jade, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetjade), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.jade, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatejade), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.jade, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsjade), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.jade, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootscitrine), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.citrine, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetcitrine), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.citrine, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatecitrine), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.citrine, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingscitrine), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.citrine, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsgarnet), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.garnet, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetgarnet), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.garnet, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplategarnet), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.garnet, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsgarnet), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.garnet, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsspinel), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.spinel, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetspinel), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.spinel, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatespinel), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.spinel, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsspinel), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.spinel, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsonyx), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.onyx, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetonyx), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.onyx, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplateonyx), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.onyx, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsonyx), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.onyx, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsmalachite), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.malachite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetmalachite), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.malachite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatemalachite), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.malachite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsmalachite), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.malachite, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootstourmaline), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.tourmaline, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmettourmaline), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.tourmaline, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatetourmaline), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.tourmaline, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingstourmaline), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.tourmaline, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootschrysocolla), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.chrysocolla, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetchrysocolla), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.chrysocolla, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatechrysocolla), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.chrysocolla, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingschrysocolla), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.chrysocolla, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootsjasper), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.jasper, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetjasper), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.jasper, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatejasper), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.jasper, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingsjasper), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.jasper, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.bootssugilite), new Object[] {"XXX","SXS","SXS", 'S', ItemInit.sugilite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.helmetsugilite), new Object[] {"SSS","SXS","XXX", 'S', ItemInit.sugilite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.chestplatesugilite), new Object[] {"SXS","SSS","SSS", 'S', ItemInit.sugilite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ArmourInit.leggingssugilite), new Object[] {"SSS","SXS","SXS", 'S', ItemInit.sugilite, 'X', Ingredient.EMPTY});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axeagate), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.agate});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axeamethyst), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.amethyst});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axechrysocolla), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.chrysocolla});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axecitrine), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.citrine});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axegarnet), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.garnet});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axejade), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jade});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axejasper), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jasper});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axemalachite), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.malachite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axeonyx), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.onyx});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axephoenixite), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.phoenixite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axeruby), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.ruby});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axesapphire), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sapphire});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axespinel), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.spinel});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axesugilite), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sugilite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axetopaz), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.topaz});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axetourmaline), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.tourmaline});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.axeemerald), new Object[] {"AAX","ASX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', Items.EMERALD});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxeagate), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.agate});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxeamethyst), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.amethyst});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxechrysocolla), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.chrysocolla});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxecitrine), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.citrine});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxegarnet), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.garnet});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxejade), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jade});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxejasper), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jasper});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxemalachite), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.malachite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxeonyx), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.onyx});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxephoenixite), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.phoenixite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxeruby), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.ruby});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxesapphire), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sapphire});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxespinel), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.spinel});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxesugilite), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sugilite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxetopaz), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.topaz});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxetourmaline), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.tourmaline});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.pickaxeemerald), new Object[] {"AAA","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', Items.EMERALD});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelagate), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.agate});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelamethyst), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.amethyst});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelchrysocolla), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.chrysocolla});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelcitrine), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.citrine});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelgarnet), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.garnet});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shoveljade), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jade});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shoveljasper), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jasper});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelmalachite), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.malachite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelonyx), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.onyx});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelphoenixite), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.phoenixite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelruby), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.ruby});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelsapphire), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sapphire});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelspinel), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.spinel});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelsugilite), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sugilite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shoveltopaz), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.topaz});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shoveltourmaline), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.tourmaline});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.shovelemerald), new Object[] {"XAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', Items.EMERALD});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordagate), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.agate});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordamethyst), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.amethyst});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordchrysocolla), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.chrysocolla});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordcitrine), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.citrine});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordgarnet), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.garnet});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordjade), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jade});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordjasper), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jasper});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordmalachite), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.malachite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordonyx), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.onyx});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordphoenixite), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.phoenixite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordruby), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.ruby});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordsapphire), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sapphire});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordspinel), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.spinel});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordsugilite), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sugilite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordtopaz), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.topaz});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordtourmaline), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.tourmaline});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.swordemerald), new Object[] {"XAX","XAX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', Items.EMERALD});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoeagate), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.agate});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoeamethyst), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.amethyst});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoechrysocolla), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.chrysocolla});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoecitrine), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.citrine});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoegarnet), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.garnet});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoejade), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jade});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoejasper), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.jasper});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoemalachite), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.malachite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoeonyx), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.onyx});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoephoenixite), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.phoenixite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoeruby), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.ruby});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoesapphire), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sapphire});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoespinel), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.spinel});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoesugilite), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.sugilite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoetopaz), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.topaz});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoetourmaline), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', ItemInit.tourmaline});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(ItemInit.hoeemerald), new Object[] {"AAX","XSX","XSX", 'X', Ingredient.EMPTY, 'S', Items.STICK, 'A', Items.EMERALD});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockagate), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.agate});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockamethyst), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.amethyst});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockchrysocolla), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.chrysocolla});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockcitrine), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.citrine});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockgarnet), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.garnet});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockjade), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.jade});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockjasper), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.jasper});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockmalachite), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.malachite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockonyx), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.onyx});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockphoenixite), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.phoenixite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockruby), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.ruby});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blocksapphire), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.sapphire});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blockspinel), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.spinel});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blocksugilite), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.sugilite});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blocktopaz), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.topaz});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.blocktourmaline), new Object[] {"AAA","AAA","AAA", 'A', ItemInit.tourmaline});
		
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.agateglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassagate, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.amethystglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassamethyst, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.chrysocollaglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glasschrysocolla, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.citrineglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glasscitrine, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.garnetglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassgarnet, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.jadeglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassjade, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.jasperglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassjasper, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.malachiteglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassmalachite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.onyxglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassonyx, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.phoenixiteglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassphoenixite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.rubyglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassruby, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.sapphireglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glasssapphire, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.spinelglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glassspinel, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.sugiliteglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glasssugilite, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.topazglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glasstopaz, 'X', Ingredient.EMPTY});
		GPPCraftingHandler.addShapedRecipe(new ItemStack(BlockInit.tourmalineglasspane), new Object[] {"XXX", "GGG", "GGG", 'G', BlockInit.glasstourmaline, 'X', Ingredient.EMPTY});
		
	}
	
	
	public static void registerCraftingItems() {
		
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandagate), new Object[] {ItemInit.dustagate, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandamethyst), new Object[] {ItemInit.dustamethyst, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandchrysocolla), new Object[] {ItemInit.dustchrysocolla, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandcitrine), new Object[] {ItemInit.dustcitrine, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandgarnet), new Object[] {ItemInit.dustgarnet, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandjade), new Object[] {ItemInit.dustjade, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandjasper), new Object[] {ItemInit.dustjasper, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandmalachite), new Object[] {ItemInit.dustmalachite, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandonyx), new Object[] {ItemInit.dustonyx, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandphoenixite), new Object[] {ItemInit.dustphoenixite, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandruby), new Object[] {ItemInit.dustruby, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandsapphire), new Object[] {ItemInit.dustsapphire, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandspinel), new Object[] {ItemInit.dustspinel, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandsugilite), new Object[] {ItemInit.dustsugilite, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandtopaz), new Object[] {ItemInit.dusttopaz, Blocks.SAND, Blocks.SAND});
		GPPCraftingHandler.addShapelessRecipe(new ItemStack(BlockInit.sandtourmaline), new Object[] {ItemInit.dusttourmaline, Blocks.SAND, Blocks.SAND});
		
		
	}
	
	

	
	public static void registerSmelting() {
		
		GPPCraftingHandler.addSmelting(ItemInit.ruby, new ItemStack(ItemInit.dustruby, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.sapphire, new ItemStack(ItemInit.dustsapphire, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.amethyst, new ItemStack(ItemInit.dustamethyst, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.topaz, new ItemStack(ItemInit.dusttopaz, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.phoenixite, new ItemStack(ItemInit.dustphoenixite, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.jade, new ItemStack(ItemInit.dustjade, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.citrine, new ItemStack(ItemInit.dustcitrine, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.garnet, new ItemStack(ItemInit.dustgarnet, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.spinel, new ItemStack(ItemInit.dustspinel, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.onyx, new ItemStack(ItemInit.dustonyx, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.agate, new ItemStack(ItemInit.dustagate, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.malachite, new ItemStack(ItemInit.dustmalachite, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.tourmaline, new ItemStack(ItemInit.dusttourmaline, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.chrysocolla, new ItemStack(ItemInit.dustchrysocolla, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.jasper, new ItemStack(ItemInit.dustjasper, 2), 3.0F);
		GPPCraftingHandler.addSmelting(ItemInit.sugilite, new ItemStack(ItemInit.dustsugilite, 2), 3.0F);
		
		
		GPPCraftingHandler.addSmelting(BlockInit.oreruby, new ItemStack(ItemInit.ruby, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.oresapphire, new ItemStack(ItemInit.sapphire, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.oreamethyst, new ItemStack(ItemInit.amethyst, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.oretopaz, new ItemStack(ItemInit.topaz, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.orephoenixite, new ItemStack(ItemInit.phoenixite, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.orejade, new ItemStack(ItemInit.jade, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.orecitrine, new ItemStack(ItemInit.citrine, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.oregarnet, new ItemStack(ItemInit.garnet, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.orespinel, new ItemStack(ItemInit.spinel, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.oreonyx, new ItemStack(ItemInit.onyx, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.oreagate, new ItemStack(ItemInit.agate, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.oremalachite, new ItemStack(ItemInit.malachite, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.oretourmaline, new ItemStack(ItemInit.tourmaline, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.orechrysocolla, new ItemStack(ItemInit.chrysocolla, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.orejasper, new ItemStack(ItemInit.jasper, 2), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.oresugilite, new ItemStack(ItemInit.sugilite, 2), 3.0F);
		
		GPPCraftingHandler.addSmelting(BlockInit.sandruby, new ItemStack(BlockInit.glassruby, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandsapphire, new ItemStack(BlockInit.glasssapphire, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandamethyst, new ItemStack(BlockInit.glassamethyst, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandtopaz, new ItemStack(BlockInit.glasstopaz, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandphoenixite, new ItemStack(BlockInit.glassphoenixite, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandjade, new ItemStack(BlockInit.glassjade, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandcitrine, new ItemStack(BlockInit.glasscitrine, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandgarnet, new ItemStack(BlockInit.glassgarnet, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandspinel, new ItemStack(BlockInit.glassspinel, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandonyx, new ItemStack(BlockInit.glassonyx, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandagate, new ItemStack(BlockInit.glassagate, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandmalachite, new ItemStack(BlockInit.glassmalachite, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandtourmaline, new ItemStack(BlockInit.glasstourmaline, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandchrysocolla, new ItemStack(BlockInit.glasschrysocolla, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandjasper, new ItemStack(BlockInit.glassjasper, 1), 3.0F);
		GPPCraftingHandler.addSmelting(BlockInit.sandsugilite, new ItemStack(BlockInit.glasssugilite, 1), 3.0F);
		
		
		
		
	}
	
	
}
