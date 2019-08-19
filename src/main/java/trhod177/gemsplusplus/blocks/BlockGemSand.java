package trhod177.gemsplusplus.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.interfaces.IHasModel;

public class BlockGemSand extends BlockFalling implements IHasModel {

	public static boolean fallInstantly;
	protected String name;
	
    public BlockGemSand(String name)
    {
        super(Material.SAND);
        this.name = name;
        this.setSoundType(SoundType.SAND);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
		 BlockInit.BLOCKS.add(this);
	     ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
		
	}
	
	@Override
    public void registerModels() {
        GemsPlusPlus.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
    
	@Override
	public BlockGemSand setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(GemsPlusPlus.GPPBlocksTab);
		return this;
	}
}