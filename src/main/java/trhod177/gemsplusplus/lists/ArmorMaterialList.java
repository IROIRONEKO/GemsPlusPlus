
  package trhod177.gemsplusplus.lists;
  
  import java.util.function.Supplier;
  
  import net.minecraft.init.Items; import net.minecraft.init.SoundEvents;
  import net.minecraft.inventory.EntityEquipmentSlot; import
  net.minecraft.item.IArmorMaterial; import
  net.minecraft.item.crafting.Ingredient; import
  net.minecraft.util.LazyLoadBase; import net.minecraft.util.SoundEvent; import
  net.minecraftforge.api.distmarker.Dist; import
  net.minecraftforge.api.distmarker.OnlyIn;
  
  public enum ArmorMaterialList implements IArmorMaterial {
  
  AGATE("agate", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, () -> { return Ingredient.fromItems(Items.DIAMOND); });
  
  
  private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
  private final String name; private final int maxDamageFactor; private final
  int[] damageReductionAmountArray; private final int enchantability; private
  final SoundEvent soundEvent; private final float toughness; private final
  LazyLoadBase<Ingredient> repairMaterial;
  
  private ArmorMaterialList(String nameIn, int maxDamageFactor, int[]
  damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float
  toughness, Supplier<Ingredient> repairMaterial) { this.name = nameIn;
  this.maxDamageFactor = maxDamageFactor; this.damageReductionAmountArray =
  damageReductionAmountArray; this.enchantability = enchantability;
  this.soundEvent = soundEvent; this.toughness = toughness; this.repairMaterial
  = new LazyLoadBase<>(repairMaterial); }
  
  public int getDurability(EntityEquipmentSlot slotIn) { return
  MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor; }
  
  public int getDamageReductionAmount(EntityEquipmentSlot slotIn) { return
  this.damageReductionAmountArray[slotIn.getIndex()]; }
  
  public int getEnchantability() { return this.enchantability; }
  
  public SoundEvent getSoundEvent() { return this.soundEvent; }
  
  public Ingredient getRepairMaterial() { return
  this.repairMaterial.getValue(); }
  
  @OnlyIn(Dist.CLIENT) public String getName() { return this.name; }
  
  public float getToughness() { return this.toughness; }
  
  }
 