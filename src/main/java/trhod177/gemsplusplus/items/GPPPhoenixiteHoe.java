package trhod177.gemsplusplus.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class GPPPhoenixiteHoe extends ItemHoe {

	public GPPPhoenixiteHoe(IItemTier tier, float p_i48488_2_, Properties builder) {
		super(tier, p_i48488_2_, builder);

	}

	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.damageItem(2, attacker);
		target.setFire(5);
		return true;
	}

}
