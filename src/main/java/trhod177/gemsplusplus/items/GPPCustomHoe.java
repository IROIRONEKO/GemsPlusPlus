package trhod177.gemsplusplus.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.interfaces.IHasModel;

public class GPPCustomHoe extends ItemHoe implements IHasModel {
	
	protected String name;

	public GPPCustomHoe(String name, ToolMaterial material) {
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
	
	@Override
	public GPPCustomHoe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(GemsPlusPlus.GPPItemsTab);
		return this;

}
}
