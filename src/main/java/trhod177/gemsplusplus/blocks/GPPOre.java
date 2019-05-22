package trhod177.gemsplusplus.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBubbleColumn;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReaderBase;
import net.minecraft.world.World;
import trhod177.gemsplusplus.lists.BlockList;
import trhod177.gemsplusplus.lists.ItemList;

public class GPPOre extends Block {

	public GPPOre(Block.Properties builder) {
		super(builder);

	}

	public void tick(IBlockState state, World worldIn, BlockPos pos, Random random) {
		if (this == BlockList.netherorephoenixite) {
			BlockBubbleColumn.placeBubbleColumn(worldIn, pos.up(), true);
		}

		if (this == BlockList.orephoenixite) {
			BlockBubbleColumn.placeBubbleColumn(worldIn, pos.up(), true);
		}
	}

	public int tickRate(IWorldReaderBase worldIn) {
		return 20;

	}

	public void onBlockAdded(IBlockState state, World worldIn, BlockPos pos, IBlockState oldState) {
		worldIn.getPendingBlockTicks().scheduleTick(pos, this, this.tickRate(worldIn));
	}

	public IItemProvider getItemDropped(IBlockState state, World worldIn, BlockPos pos, int fortune) {
		if (this == BlockList.oreagate) {
			return ItemList.agate;
		} else if (this == BlockList.oreamethyst) {
			return ItemList.amethyst;
		} else if (this == BlockList.orechrysocolla) {
			return ItemList.chrysocolla;
		} else if (this == BlockList.orecitrine) {
			return ItemList.citrine;
		} else if (this == BlockList.oregarnet) {
			return ItemList.garnet;
		} else if (this == BlockList.orejade) {
			return ItemList.jade;
		} else if (this == BlockList.orejasper) {
			return ItemList.jasper;
		} else if (this == BlockList.oremalachite) {
			return ItemList.malachite;
		} else if (this == BlockList.oreonyx) {
			return ItemList.onyx;
		} else if (this == BlockList.orephoenixite) {
			return ItemList.phoenixite;
		} else if (this == BlockList.oreruby) {
			return ItemList.ruby;
		} else if (this == BlockList.oresapphire) {
			return ItemList.sapphire;
		} else if (this == BlockList.orespinel) {
			return ItemList.spinel;
		} else if (this == BlockList.oresugilite) {
			return ItemList.sugilite;
		} else if (this == BlockList.oretopaz) {
			return ItemList.topaz;
		} else if (this == BlockList.oretourmaline) {
			return ItemList.tourmaline;
		} else if (this == BlockList.netheroreagate) {
			return ItemList.agate;
		} else if (this == BlockList.netheroreamethyst) {
			return ItemList.amethyst;
		} else if (this == BlockList.netherorechrysocolla) {
			return ItemList.chrysocolla;
		} else if (this == BlockList.netherorecitrine) {
			return ItemList.citrine;
		} else if (this == BlockList.netheroregarnet) {
			return ItemList.garnet;
		} else if (this == BlockList.netherorejade) {
			return ItemList.jade;
		} else if (this == BlockList.netherorejasper) {
			return ItemList.jasper;
		} else if (this == BlockList.netheroremalachite) {
			return ItemList.malachite;
		} else if (this == BlockList.netheroreonyx) {
			return ItemList.onyx;
		} else if (this == BlockList.netherorephoenixite) {
			return ItemList.phoenixite;
		} else if (this == BlockList.netheroreruby) {
			return ItemList.ruby;
		} else if (this == BlockList.netheroresapphire) {
			return ItemList.sapphire;
		} else if (this == BlockList.netherorespinel) {
			return ItemList.spinel;
		} else if (this == BlockList.netheroresugilite) {
			return ItemList.sugilite;
		} else if (this == BlockList.netheroretopaz) {
			return ItemList.topaz;
		} else if (this == BlockList.netheroretourmaline) {
			return ItemList.tourmaline;
		} else {
			return Items.PAPER;
		}
	}

	public int quantityDropped(IBlockState state, Random random) {
		return random.nextInt(3) + 1;
	}

	protected boolean canSilkHarvest() {
		return true;
	}
}