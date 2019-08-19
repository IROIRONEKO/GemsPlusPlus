package trhod177.gemsplusplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.interfaces.IHasModel;

public class BlockGem extends Block implements IHasModel {


	  
	  
	public BlockGem(String name, Material material) {
		super(Material.ROCK);
		
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
		BlockInit.BLOCKS.add(this);
	    ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
		
	}
	
	@Override
    public void registerModels() {
        GemsPlusPlus.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }
	


	@Override
	public BlockGem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(GemsPlusPlus.GPPBlocksTab);
		return this;
	}
	
	

}