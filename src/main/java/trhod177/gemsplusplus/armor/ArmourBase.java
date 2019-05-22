package trhod177.gemsplusplus.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.init.ArmourInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.interfaces.IHasModel;

public class ArmourBase extends ItemArmor implements IHasModel {
	
	protected String name;
	
	public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
        this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		 ArmourInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        GemsPlusPlus.proxy.registerModel(this, 0);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void onArmorTick(World world, EntityPlayer player, ItemStack item) {
        if (player.inventory.armorItemInSlot(0) != null &&
                player.inventory.armorItemInSlot(1) != null &&
                player.inventory.armorItemInSlot(2) != null &&
                player.inventory.armorItemInSlot(3) != null) {
            if (player.inventory.armorItemInSlot(0).getItem() == ArmourInit.bootsphoenixite &&
                    player.inventory.armorItemInSlot(1).getItem() == ArmourInit.leggingsphoenixite &&
                    player.inventory.armorItemInSlot(2).getItem() == ArmourInit.chestplatephoenixite &&
                    player.inventory.armorItemInSlot(3).getItem() == ArmourInit.helmetphoenixite) {
                player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 10, 5, false, false));
   
            }
        }
    }

	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entity, ItemStack stack, EntityEquipmentSlot slot, ModelBiped oldModel) {
		return oldModel;
		

	}

	
	@Override
	public ArmourBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(GemsPlusPlus.GPPItemsTab);
		return this;

}


}
