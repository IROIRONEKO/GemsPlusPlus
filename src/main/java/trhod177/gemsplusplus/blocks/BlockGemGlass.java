package trhod177.gemsplusplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.interfaces.IHasModel;

public class BlockGemGlass extends Block implements IHasModel {

	
	private static final IBlockAccess world = null;
	private static final boolean ignoreSimilarity = false;

	public BlockGemGlass(String name) {
		
		super(Material.GLASS);
		
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
	public BlockGemGlass setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(GemsPlusPlus.GPPBlocksTab);
		return this;
	}
	
	  
	
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();

      
            if (blockState != iblockstate)
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }
        

        return !this.ignoreSimilarity && block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }
    
    
}