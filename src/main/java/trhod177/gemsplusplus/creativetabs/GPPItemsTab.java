package trhod177.gemsplusplus.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod177.gemsplusplus.init.ItemInit;

public class GPPItemsTab extends CreativeTabs {


	public GPPItemsTab(String label) {
		super("GPPItemsTab");
		this.setBackgroundImageName("items.png");
		
	}
	
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.ruby);
		
	}
}