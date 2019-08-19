package trhod177.gemsplusplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.interfaces.IHasModel;



public class GPPBlockTemplate extends Block implements IHasModel {


	protected String name;

	public GPPBlockTemplate(Material material, String name) {
		
		super(material.ROCK);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		 BlockInit.BLOCKS.add(this);
	     ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
		
	}
	
	@Override
    public void registerModels() {
        GemsPlusPlus.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }

	@Override
	public GPPBlockTemplate setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	


	

}
