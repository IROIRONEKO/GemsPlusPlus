package trhod177.gemsplusplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GPPGlassPane extends BlockPane {
	
	  public GPPGlassPane(Block.Properties builder) {
	      super(builder);
	   }

	   public IItemProvider getItemDropped(IBlockState state, World worldIn, BlockPos pos, int fortune) {
	      return Items.AIR;
	   }
	   
	   public BlockRenderLayer getRenderLayer() {
			  return BlockRenderLayer.TRANSLUCENT;
		   }

	

}
