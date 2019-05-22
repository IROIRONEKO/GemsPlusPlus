package trhod177.gemsplusplus.lists;

import net.minecraft.init.Items;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;


public enum ToolMaterialList implements IItemTier {
	
	agate(3, 675, 6f, 2.0f, 18, ItemList.agate),
	amethyst(2, 600, 6f, 2.0f, 10, ItemList.amethyst),
	citrine(3, 700, 6f, 3.0f, 17, ItemList.citrine),
	chrysocolla(2, 300, 3f, 1.0f, 7, ItemList.chrysocolla),
	garnet(2, 700, 5.5f, 2.0f, 16, ItemList.garnet),
	jade(3, 600, 6f, 3.0f, 15, ItemList.jade),
	jasper(2, 675, 5.5f, 2.0f, 16, ItemList.jasper),
	malachite(3, 375, 3.5f, 1.0f, 9, ItemList.malachite),
	onyx(2, 650, 6f, 2.0f, 17, ItemList.onyx),
	phoenixite(4, 700, 6f, 3.0f, 15, Items.LAVA_BUCKET),
	ruby(2, 900, 5f, 2.0f, 19, ItemList.ruby),
	sapphire(3, 900, 5f, 2.0f, 19, ItemList.sapphire),
	spinel(2, 750, 6.5f, 2.0f, 15, ItemList.spinel),
	sugilite(3, 625, 6f, 2.0f, 17, ItemList.sugilite),
	topaz(2, 800, 6f, 3.0f, 15, ItemList.topaz),
	tourmaline(3, 725, 6.5f, 2.0f, 15, ItemList.tourmaline);
	
	private float attackDamage, efficiency;
	private int durability, harvestlevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialList(int harvestlevel, int durability,  float efficiency, float attackDamage, int enchantability, Item repairMaterial) {
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestlevel = harvestlevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}
	@Override
	public int getMaxUses() {
		return this.durability;
	}
	@Override
	public float getEfficiency() {
		return this.efficiency;
	}
	@Override
	public float getAttackDamage() {
		
		return this.attackDamage;
	}
	@Override
	public int getHarvestLevel() {
		
		return this.harvestlevel;
	}
	@Override
	public int getEnchantability() {
		
		return this.getEnchantability();
	}
	@Override
	public Ingredient getRepairMaterial() {
		
		return Ingredient.fromItems(this.repairMaterial);
	}

}
