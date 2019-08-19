package trhod177.gemsplusplus.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.lists.ItemList;

public class GPPArmor extends ItemArmor {

	public GPPArmor(IArmorMaterial materialIn, EntityEquipmentSlot slots, Properties builder) {
		super(materialIn, slots, builder); 
		
	}
	
	@OnlyIn(Dist.CLIENT)
	public void onArmorTick(World world, EntityPlayer player, ItemStack item) {
		System.out.print("222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
		if (player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(1) != null
				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(3) != null) {
			System.out.print("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
			if (player.inventory.armorItemInSlot(0).getItem() == ItemList.helmetphoenixite
					&& player.inventory.armorItemInSlot(1).getItem() == ItemList.chestplatephoenixite
					&& player.inventory.armorItemInSlot(2).getItem() == ItemList.leggingsphoenixite
					&& player.inventory.armorItemInSlot(3).getItem() == ItemList.bootsphoenixite) {
				System.out.print("THIS IS WORKING!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10, 5, false, false));

			}

		}
	}
	
	   

}
