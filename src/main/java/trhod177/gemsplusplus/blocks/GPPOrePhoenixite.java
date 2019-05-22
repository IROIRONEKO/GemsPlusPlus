package trhod177.gemsplusplus.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBubbleColumn;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Particles;
import net.minecraft.init.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.IWorldReaderBase;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import trhod177.gemsplusplus.lists.ItemList;

public class GPPOrePhoenixite extends Block {

	public GPPOrePhoenixite(Block.Properties builder) {
		super(builder);
	}

	public void tick(IBlockState state, World worldIn, BlockPos pos, Random random) {
		BlockBubbleColumn.placeBubbleColumn(worldIn, pos.up(), true);
	}

	public int tickRate(IWorldReaderBase worldIn) {
	      return 20;
	   }
	
	 @OnlyIn(Dist.CLIENT)
	   public int getPackedLightmapCoords(IBlockState state, IWorldReader source, BlockPos pos) {
	      return 15728880;
	   }

	public void onBlockAdded(IBlockState state, World worldIn, BlockPos pos, IBlockState oldState) {
		worldIn.getPendingBlockTicks().scheduleTick(pos, this, this.tickRate(worldIn));
	}

	public IBlockState updatePostPlacement(IBlockState stateIn, EnumFacing facing, IBlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		if (facing == EnumFacing.UP && facingState.getBlock() == Blocks.WATER) {
			worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, this.tickRate(worldIn));
		}

		return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}

	public void randomTick(IBlockState state, World worldIn, BlockPos pos, Random random) {
		BlockPos blockpos = pos.up();
		if (worldIn.getFluidState(pos).isTagged(FluidTags.WATER)) {
			worldIn.playSound((EntityPlayer) null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F,
					2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);
			if (worldIn instanceof WorldServer) {
				((WorldServer) worldIn).spawnParticle(Particles.LARGE_SMOKE, (double) blockpos.getX() + 0.5D,
						(double) blockpos.getY() + 0.25D, (double) blockpos.getZ() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D);
			}
		}

	}

	public boolean needsPostProcessing(IBlockState p_201783_1_, IBlockReader worldIn, BlockPos pos) {
		return true;
	}

	public IItemProvider getItemDropped(IBlockState state, World worldIn, BlockPos pos, int fortune) {

		return ItemList.phoenixite;

	}

	public int quantityDropped(IBlockState state, Random random) {
		return random.nextInt(3) + 1;
	}

	protected boolean canSilkHarvest() {
		return true;
	}

}
