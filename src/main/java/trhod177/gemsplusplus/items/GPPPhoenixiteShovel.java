package trhod177.gemsplusplus.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.interfaces.IHasModel;


public class GPPPhoenixiteShovel extends ItemSpade implements IHasModel {
	
	protected String name;

	public GPPPhoenixiteShovel(String name, ToolMaterial material) {
		super(material);
		this.name = name;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		 ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        GemsPlusPlus.proxy.registerModel(this, 0);
    }
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(2, attacker);
        target.setFire(5);
        return true;
    }
	
	@Override
	public GPPPhoenixiteShovel setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(GemsPlusPlus.GPPItemsTab);
		return this;

}

}
