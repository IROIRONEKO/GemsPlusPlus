package trhod177.gemsplusplus.world;


import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.CompositeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRange;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;
import trhod177.gemsplusplus.lists.BlockList;
import trhod177.gemsplusplus.world.DimensionalGenerator;

public class OreGeneration {
	
	private static final Predicate<IBlockState> IS_NETHERRACK = state -> state.getBlock() == Blocks.NETHERRACK;
	
	public static void setupOreGeneration() {
		
		for (Biome biome : ForgeRegistries.BIOMES) {
			//CountRangeConfig oreagate = new CountRangeConfig(100, 0, 0, 100);
			CountRangeConfig oreagate = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig oreamethyst = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig orecitrine = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig orechrysocolla = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig oregarnet = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig orejade = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig orejasper = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig oremalachite = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig oreonyx = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig orephoenixite = new CountRangeConfig(10, 0, 0, 100);
			CountRangeConfig oreruby = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig oresapphire = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig orespinel = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig oresugilite = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig oretopaz = new CountRangeConfig(15, 0, 0, 100);
			CountRangeConfig oretourmaline = new CountRangeConfig(15, 0, 0, 100);
			
			CountRangeConfig netheroreagate = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netheroreamethyst = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netherorecitrine = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netherorechrysocolla = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netheroregarnet = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netherorejade = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netherorejasper = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netheroremalachite = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netheroreonyx = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netherorephoenixite = new CountRangeConfig(10, 0, 0, 200);
			CountRangeConfig netheroreruby = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netheroresapphire = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netherorespinel = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netheroresugilite = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netheroretopaz = new CountRangeConfig(15, 0, 0, 200);
			CountRangeConfig netheroretourmaline = new CountRangeConfig(15, 0, 0, 200);
			
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oreagate.getDefaultState(), 4), new CountRange(), oreagate));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oreamethyst.getDefaultState(), 4), new CountRange(), oreamethyst));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.orecitrine.getDefaultState(), 4), new CountRange(), orecitrine));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.orechrysocolla.getDefaultState(), 4), new CountRange(), orechrysocolla));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oregarnet.getDefaultState(), 4), new CountRange(), oregarnet));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.orejade.getDefaultState(), 4), new CountRange(), orejade));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.orejasper.getDefaultState(), 4), new CountRange(), orejasper));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oremalachite.getDefaultState(), 4), new CountRange(), oremalachite));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oreonyx.getDefaultState(), 4), new CountRange(), oreonyx));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.orephoenixite.getDefaultState(), 4), new CountRange(), orephoenixite));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oreruby.getDefaultState(), 4), new CountRange(), oreruby));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oresapphire.getDefaultState(), 4), new CountRange(), oresapphire));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.orespinel.getDefaultState(), 4), new CountRange(), orespinel));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oresugilite.getDefaultState(), 4), new CountRange(), oresugilite));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oretopaz.getDefaultState(), 4), new CountRange(), oretopaz));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, BlockList.oretourmaline.getDefaultState(), 4), new CountRange(), oretourmaline));
			
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroreagate.getDefaultState(), 4), new CountRange(), netheroreagate, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroreamethyst.getDefaultState(), 4), new CountRange(), netheroreamethyst, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netherorecitrine.getDefaultState(), 4), new CountRange(), netherorecitrine, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netherorechrysocolla.getDefaultState(), 4), new CountRange(), netherorechrysocolla, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroregarnet.getDefaultState(), 4), new CountRange(), netheroregarnet, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netherorejade.getDefaultState(), 4), new CountRange(), netherorejade, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netherorejasper.getDefaultState(), 4), new CountRange(), netherorejasper, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroremalachite.getDefaultState(), 4), new CountRange(), netheroremalachite, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroreonyx.getDefaultState(), 4), new CountRange(), netheroreonyx, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netherorephoenixite.getDefaultState(), 4), new CountRange(), netherorephoenixite, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroreruby.getDefaultState(), 4), new CountRange(), netheroreruby, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroresapphire.getDefaultState(), 4), new CountRange(), netheroresapphire, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netherorespinel.getDefaultState(), 4), new CountRange(), netherorespinel, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroresugilite.getDefaultState(), 4), new CountRange(), netheroresugilite, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroretopaz.getDefaultState(), 4), new CountRange(), netheroretopaz, DimensionType.NETHER));
			biome.addFeature(Decoration.UNDERGROUND_ORES, new DimensionalGenerator<MinableConfig, CountRangeConfig>(Feature.MINABLE, new MinableConfig(IS_NETHERRACK, BlockList.netheroretourmaline.getDefaultState(), 4), new CountRange(), netheroretourmaline, DimensionType.NETHER));
			
		}
			
	}

}
