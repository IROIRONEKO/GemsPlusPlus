package trhod177.gemsplusplus;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import trhod177.gemsplusplus.lists.BlockList;

public class GemsPlusPlusBlockItemGroup extends ItemGroup {

	public GemsPlusPlusBlockItemGroup() {
		super("gemsplusplusblock");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockList.oreagate));
	}
	
	

}
