package trhod177.gemsplusplus;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import trhod177.gemsplusplus.lists.ItemList;

public class GemsPlusPlusItemItemGroup extends ItemGroup {

	public GemsPlusPlusItemItemGroup() {
		super("gemsplusplusitem");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemList.agate);
	}
	
	

}
