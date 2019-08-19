package trhod177.gemsplusplus.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.init.ItemInit;
import trhod177.gemsplusplus.util.interfaces.IHasModel;

public class BlockGemOre extends Block implements IHasModel {

	public BlockGemOre(String name, float hardness, float resistance) {
		super(Material.ROCK);
		setHardness(hardness);
		setResistance(resistance);
		this.setHarvestLevel("pickaxe", 2);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
		
		if (this == BlockInit.orephoenixite || this == BlockInit.netherorephoenixite) {
			this.setLightLevel(5);
		}

	}

	@Override
	public void registerModels() {
		GemsPlusPlus.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		if (this == BlockInit.oreruby) {
			return ItemInit.ruby;
		} else if (this == BlockInit.oreamethyst) {
			return ItemInit.amethyst;
		} else if (this == BlockInit.orechrysocolla) {
			return ItemInit.chrysocolla;
		} else if (this == BlockInit.orecitrine) {
			return ItemInit.citrine;
		} else if (this == BlockInit.oregarnet) {
			return ItemInit.garnet;
		} else if (this == BlockInit.orejade) {
			return ItemInit.jade;
		} else if (this == BlockInit.orejasper) {
			return ItemInit.jasper;
		} else if (this == BlockInit.oremalachite) {
			return ItemInit.malachite;
		} else if (this == BlockInit.oreonyx) {
			return ItemInit.onyx;
		} else if (this == BlockInit.oreagate){
		    return ItemInit.agate;
		} else if (this == BlockInit.orephoenixite) {
			return ItemInit.phoenixite;
		} else if (this == BlockInit.oresapphire) {
			return ItemInit.sapphire;
		} else if (this == BlockInit.orespinel) {
			return ItemInit.spinel;
		} else if (this == BlockInit.oresugilite) {
			return ItemInit.sugilite;
		} else if (this == BlockInit.oretopaz) {
			return ItemInit.topaz;
		} else if (this == BlockInit.oretourmaline) {
			return ItemInit.tourmaline; 
		}else if (this == BlockInit.netheroreamethyst) {
			return ItemInit.amethyst;
		} else if (this == BlockInit.netherorechrysocolla) {
			return ItemInit.chrysocolla;
		} else if (this == BlockInit.netherorecitrine) {
			return ItemInit.citrine;
		} else if (this == BlockInit.netheroregarnet) {
			return ItemInit.garnet;
		} else if (this == BlockInit.netherorejade) {
			return ItemInit.jade;
		} else if (this == BlockInit.netherorejasper) {
			return ItemInit.jasper;
		} else if (this == BlockInit.netheroremalachite) {
			return ItemInit.malachite;
		} else if (this == BlockInit.netheroreonyx) {
			return ItemInit.onyx;
		} else if (this == BlockInit.netherorephoenixite) {
			return ItemInit.phoenixite;
		} else if (this == BlockInit.netheroresapphire) {
			return ItemInit.sapphire;
		} else if (this == BlockInit.netherorespinel) {
			return ItemInit.spinel;
		} else if (this == BlockInit.netheroresugilite) {
			return ItemInit.sugilite;
		} else if (this == BlockInit.netheroretopaz) {
			return ItemInit.topaz;
		} else if (this == BlockInit.netheroretourmaline) {
			return ItemInit.tourmaline;
		} else {
			return null;
		}

	}

	public int quantityDropped(Random random) {
		return random.nextInt(3) + 1;
	}

	public int quantityDroppedWithBonus(int fortune, Random random) {
		if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(
				(IBlockState) this.getBlockState().getValidStates().iterator().next(), random, fortune)) {
			int i = random.nextInt(fortune + 2) - 1;

			if (i < 0) {
				i = 0;
			}

			return this.quantityDropped(random) * (i + 1);
		} else {
			return this.quantityDropped(random);
		}
	}
	
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
    	if (this == BlockInit.orephoenixite || this == BlockInit.netherorephoenixite) {
            double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
            double d2 = (double)pos.getZ() + 0.5D;
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;

            
                   worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_FIRE_AMBIENT, SoundCategory.BLOCKS, 0.2F, 0.2F, false);
            

                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - 0.01D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                   
    	}
     
    }

	@Override
	public BlockGemOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(GemsPlusPlus.GPPBlocksTab);
		return this;
	}

}
