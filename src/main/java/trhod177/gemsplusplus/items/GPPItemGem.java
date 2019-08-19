package trhod177.gemsplusplus.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.interfaces.IHasModel;


public class GPPItemGem extends Item implements IHasModel {
	
	protected String name;

	public GPPItemGem(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		 ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        GemsPlusPlus.proxy.registerModel(this, 0);
    }
	
	@Override
	public GPPItemGem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(GemsPlusPlus.GPPItemsTab);
		return this;

}

}