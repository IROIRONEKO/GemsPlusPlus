package trhod177.gemsplusplus.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class GPPGlass extends BlockGlass {
	   public GPPGlass(Block.Properties builder) {
	      super(builder);
	   }

	   @Override
	   public boolean propagatesSkylightDown(IBlockState state, IBlockReader reader, BlockPos pos) {
	      return true;
	   }

	   public int quantityDropped(IBlockState state, Random random) {
	      return 0;
	   }

	   public BlockRenderLayer getRenderLayer() {
		  return BlockRenderLayer.TRANSLUCENT;
	   }

	   @Override
	   public boolean isFullCube(IBlockState state) {
	      return false;
	   }

	   protected boolean canSilkHarvest() {
	      return true;
	   }
	}