package trhod177.gemsplusplus.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.References;
import trhod177.gemsplusplus.armor.ArmourBase;


public class ArmourInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ArmorMaterial ARMOUR_EMERALD = EnumHelper.addArmorMaterial("armour_emerald", References.MODID + ":emerald", 44, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.ruby));
	public static final ArmorMaterial ARMOUR_RUBY = EnumHelper.addArmorMaterial("armour_ruby", References.MODID + ":ruby", 50, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.ruby));
	public static final ArmorMaterial ARMOUR_SAPPHIRE = EnumHelper.addArmorMaterial("armour_sapphire", References.MODID + ":sapphire", 50, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.sapphire));	
	public static final ArmorMaterial ARMOUR_AMETHYST = EnumHelper.addArmorMaterial("armour_amethyst", References.MODID + ":amethyst", 40, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.amethyst));
	public static final ArmorMaterial ARMOUR_TOPAZ = EnumHelper.addArmorMaterial("armour_topaz", References.MODID + ":topaz", 46, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.topaz));
	public static final ArmorMaterial ARMOUR_PHOENIXITE = EnumHelper.addArmorMaterial("armour_phoenixite", References.MODID + ":phoenixite", 48, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(Items.LAVA_BUCKET));
	public static final ArmorMaterial ARMOUR_JADE = EnumHelper.addArmorMaterial("armour_jade", References.MODID + ":jade", 40, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.jade));
	public static final ArmorMaterial ARMOUR_CITRINE = EnumHelper.addArmorMaterial("armour_citrine", References.MODID + ":citrine", 46, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.citrine));
	public static final ArmorMaterial ARMOUR_GARNET = EnumHelper.addArmorMaterial("armour_garnet", References.MODID + ":garnet", 42, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.garnet));
	public static final ArmorMaterial ARMOUR_SPINEL = EnumHelper.addArmorMaterial("armour_spinel", References.MODID + ":spinel", 50, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.spinel));
	public static final ArmorMaterial ARMOUR_ONYX = EnumHelper.addArmorMaterial("armour_onyx", References.MODID + ":onyx", 40, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.onyx));
	public static final ArmorMaterial ARMOUR_AGATE = EnumHelper.addArmorMaterial("armour_agate", References.MODID + ":agate", 42, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.agate));
	public static final ArmorMaterial ARMOUR_MALACHITE = EnumHelper.addArmorMaterial("armour_malachite", References.MODID + ":malachite", 26, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.malachite));
	public static final ArmorMaterial ARMOUR_TOURMALINE = EnumHelper.addArmorMaterial("armour_tourmaline", References.MODID + ":tourmaline", 44, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.tourmaline));
	public static final ArmorMaterial ARMOUR_CHRYSOCOLLA = EnumHelper.addArmorMaterial("armour_chrysocolla", References.MODID + ":chrysocolla", 22, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.chrysocolla));
	public static final ArmorMaterial ARMOUR_JASPER = EnumHelper.addArmorMaterial("armour_jasper", References.MODID + ":jasper", 42, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.jasper));
	public static final ArmorMaterial ARMOUR_SUGILITE = EnumHelper.addArmorMaterial("armour_sugilite", References.MODID + ":sugilite", 38, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F).setRepairItem(new ItemStack(ItemInit.sugilite));
	
	
	public static final ArmourBase helmetemerald = new ArmourBase("helmetemerald", ARMOUR_EMERALD, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplateemerald = new ArmourBase("chestplateemerald", ARMOUR_EMERALD, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsemerald = new ArmourBase("leggingsemerald", ARMOUR_EMERALD, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsemerald = new ArmourBase("bootsemerald", ARMOUR_EMERALD, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetruby = new ArmourBase("helmetruby", ARMOUR_RUBY, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplateruby = new ArmourBase("chestplateruby", ARMOUR_RUBY, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsruby = new ArmourBase("leggingsruby", ARMOUR_RUBY, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsruby = new ArmourBase("bootsruby", ARMOUR_RUBY, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
    public static final ArmourBase helmetsapphire = new ArmourBase("helmetsapphire", ARMOUR_SAPPHIRE, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatesapphire = new ArmourBase("chestplatesapphire", ARMOUR_SAPPHIRE, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingssapphire = new ArmourBase("leggingssapphire", ARMOUR_SAPPHIRE, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootssapphire = new ArmourBase("bootssapphire", ARMOUR_SAPPHIRE, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
    public static final ArmourBase helmetamethyst = new ArmourBase("helmetamethyst", ARMOUR_AMETHYST, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplateamethyst = new ArmourBase("chestplateamethyst", ARMOUR_AMETHYST, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsamethyst = new ArmourBase("leggingsamethyst", ARMOUR_AMETHYST, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsamethyst = new ArmourBase("bootsamethyst", ARMOUR_AMETHYST, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
    public static final ArmourBase helmettopaz = new ArmourBase("helmettopaz", ARMOUR_TOPAZ, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatetopaz = new ArmourBase("chestplatetopaz", ARMOUR_TOPAZ, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingstopaz = new ArmourBase("leggingstopaz", ARMOUR_TOPAZ, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootstopaz = new ArmourBase("bootstopaz", ARMOUR_TOPAZ, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
    public static final ArmourBase helmetphoenixite = new ArmourBase("helmetphoenixite", ARMOUR_PHOENIXITE, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatephoenixite = new ArmourBase("chestplatephoenixite", ARMOUR_PHOENIXITE, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsphoenixite = new ArmourBase("leggingsphoenixite", ARMOUR_PHOENIXITE, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsphoenixite = new ArmourBase("bootsphoenixite", ARMOUR_PHOENIXITE, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetjade = new ArmourBase("helmetjade", ARMOUR_JADE, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatejade = new ArmourBase("chestplatejade", ARMOUR_JADE, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsjade = new ArmourBase("leggingsjade", ARMOUR_JADE, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsjade = new ArmourBase("bootsjade", ARMOUR_JADE, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetcitrine = new ArmourBase("helmetcitrine", ARMOUR_CITRINE, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatecitrine = new ArmourBase("chestplatecitrine", ARMOUR_CITRINE, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingscitrine = new ArmourBase("leggingscitrine", ARMOUR_CITRINE, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootscitrine = new ArmourBase("bootscitrine", ARMOUR_CITRINE, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetgarnet = new ArmourBase("helmetgarnet", ARMOUR_GARNET, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplategarnet = new ArmourBase("chestplategarnet", ARMOUR_GARNET, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsgarnet = new ArmourBase("leggingsgarnet", ARMOUR_GARNET, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsgarnet = new ArmourBase("bootsgarnet", ARMOUR_GARNET, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetspinel = new ArmourBase("helmetspinel", ARMOUR_SPINEL, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatespinel = new ArmourBase("chestplatespinel", ARMOUR_SPINEL, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsspinel = new ArmourBase("leggingsspinel", ARMOUR_SPINEL, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsspinel = new ArmourBase("bootsspinel", ARMOUR_SPINEL, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetonyx = new ArmourBase("helmetonyx", ARMOUR_ONYX, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplateonyx = new ArmourBase("chestplateonyx", ARMOUR_ONYX, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsonyx = new ArmourBase("leggingsonyx", ARMOUR_ONYX, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsonyx = new ArmourBase("bootsonyx", ARMOUR_ONYX, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetagate = new ArmourBase("helmetagate", ARMOUR_AGATE, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplateagate = new ArmourBase("chestplateagate", ARMOUR_AGATE, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsagate = new ArmourBase("leggingsagate", ARMOUR_AGATE, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsagate = new ArmourBase("bootsagate", ARMOUR_AGATE, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetmalachite = new ArmourBase("helmetmalachite", ARMOUR_MALACHITE, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatemalachite = new ArmourBase("chestplatemalachite", ARMOUR_MALACHITE, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsmalachite = new ArmourBase("leggingsmalachite", ARMOUR_MALACHITE, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsmalachite = new ArmourBase("bootsmalachite", ARMOUR_MALACHITE, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmettourmaline = new ArmourBase("helmettourmaline", ARMOUR_TOURMALINE, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatetourmaline = new ArmourBase("chestplatetourmaline", ARMOUR_TOURMALINE, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingstourmaline = new ArmourBase("leggingstourmaline", ARMOUR_TOURMALINE, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootstourmaline = new ArmourBase("bootstourmaline", ARMOUR_TOURMALINE, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetchrysocolla = new ArmourBase("helmetchrysocolla", ARMOUR_CHRYSOCOLLA, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatechrysocolla= new ArmourBase("chestplatechrysocolla", ARMOUR_CHRYSOCOLLA, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingschrysocolla = new ArmourBase("leggingschrysocolla", ARMOUR_CHRYSOCOLLA, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootschrysocolla= new ArmourBase("bootschrysocolla", ARMOUR_CHRYSOCOLLA, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetjasper = new ArmourBase("helmetjasper", ARMOUR_JASPER, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatejasper = new ArmourBase("chestplatejasper", ARMOUR_JASPER, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingsjasper = new ArmourBase("leggingsjasper", ARMOUR_JASPER, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootsjasper = new ArmourBase("bootsjasper", ARMOUR_JASPER, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
	public static final ArmourBase helmetsugilite = new ArmourBase("helmetsugilite", ARMOUR_SUGILITE, 1, EntityEquipmentSlot.HEAD).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase chestplatesugilite = new ArmourBase("chestplatesugilite", ARMOUR_SUGILITE, 1, EntityEquipmentSlot.CHEST).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase leggingssugilite = new ArmourBase("leggingssugilite", ARMOUR_SUGILITE, 2, EntityEquipmentSlot.LEGS).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	public static final ArmourBase bootssugilite = new ArmourBase("bootssugilite", ARMOUR_SUGILITE, 1, EntityEquipmentSlot.FEET).setCreativeTab(GemsPlusPlus.GPPItemsTab);
	
}

