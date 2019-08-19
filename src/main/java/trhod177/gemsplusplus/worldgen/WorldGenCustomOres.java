package trhod177.gemsplusplus.worldgen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import net.minecraftforge.fml.common.IWorldGenerator;
import trhod177.gemsplusplus.init.BlockInit;
import trhod177.gemsplusplus.util.MainConfigHandler;

public class WorldGenCustomOres implements IWorldGenerator {
	private WorldGenerator oreruby;
	private WorldGenerator oresapphire;
	private WorldGenerator oreamethyst;
	private WorldGenerator oretopaz;
	private WorldGenerator orephoenixite;
	private WorldGenerator orejade;
	private WorldGenerator orecitrine;
	private WorldGenerator oregarnet;
	private WorldGenerator orespinel;
	private WorldGenerator oreonyx;
	private WorldGenerator oreagate;
	private WorldGenerator oremalachite;
	private WorldGenerator oretourmaline;
	private WorldGenerator orechrysocolla;
	private WorldGenerator orejasper;
	private WorldGenerator oresugilite;
	private WorldGenerator netheroreruby;
	private WorldGenerator netheroresapphire;
	private WorldGenerator netheroreamethyst;
	private WorldGenerator netheroretopaz;
	private WorldGenerator netherorephoenixite;
	private WorldGenerator netherorejade;
	private WorldGenerator netherorecitrine;
	private WorldGenerator netheroregarnet;
	private WorldGenerator netherorespinel;
	private WorldGenerator netheroreonyx;
	private WorldGenerator netheroreagate;
	private WorldGenerator netheroremalachite;
	private WorldGenerator netheroretourmaline;
	private WorldGenerator netherorechrysocolla;
	private WorldGenerator netherorejasper;
	private WorldGenerator netheroresugilite;

	public WorldGenCustomOres() {
		if (MainConfigHandler.oreruby == true) {
			oreruby = new WorldGenMinable(BlockInit.oreruby.getDefaultState(), MainConfigHandler.orerubyspawnchance);
		}
		if (MainConfigHandler.oresapphire == true) {
			oresapphire = new WorldGenMinable(BlockInit.oresapphire.getDefaultState(), MainConfigHandler.oresapphirespawnchance);
		}
		if (MainConfigHandler.oreamethyst == true) {
			oreamethyst = new WorldGenMinable(BlockInit.oreamethyst.getDefaultState(), MainConfigHandler.oreamethystspawnchance);
		}
		if (MainConfigHandler.oretopaz == true) {
			oretopaz = new WorldGenMinable(BlockInit.oretopaz.getDefaultState(), MainConfigHandler.oretopazspawnchance);
		}
		if (MainConfigHandler.orephoenixite == true) {
			orephoenixite = new WorldGenMinable(BlockInit.orephoenixite.getDefaultState(), MainConfigHandler.oretourmalinespawnchance);
		}
		if (MainConfigHandler.orejade == true) {
			orejade = new WorldGenMinable(BlockInit.orejade.getDefaultState(), MainConfigHandler.orejadespawnchance);
		}
		if (MainConfigHandler.orecitrine == true) {
			orecitrine = new WorldGenMinable(BlockInit.orecitrine.getDefaultState(), MainConfigHandler.orecitrinespawnchance);
		}
		if (MainConfigHandler.oregarnet == true) {
			oregarnet = new WorldGenMinable(BlockInit.oregarnet.getDefaultState(), MainConfigHandler.oregarnetspawnchance);
		}
		if (MainConfigHandler.orespinel == true) {
			orespinel = new WorldGenMinable(BlockInit.orespinel.getDefaultState(), MainConfigHandler.orespinelspawnchance);
		}
		if (MainConfigHandler.oreonyx == true) {
			oreonyx = new WorldGenMinable(BlockInit.oreonyx.getDefaultState(), MainConfigHandler.oreonyxspawnchance);
		}
		if (MainConfigHandler.oreagate == true) {
			oreagate = new WorldGenMinable(BlockInit.oreagate.getDefaultState(), MainConfigHandler.oreagatespawnchance);
		}
		if (MainConfigHandler.oremalachite == true) {
			oremalachite = new WorldGenMinable(BlockInit.oremalachite.getDefaultState(), MainConfigHandler.oremalachitespawnchance);
		}
		if (MainConfigHandler.oretourmaline == true) {
			oretourmaline = new WorldGenMinable(BlockInit.oretourmaline.getDefaultState(), MainConfigHandler.oretourmalinespawnchance);
		}
		if (MainConfigHandler.orechrysocolla == true) {
			orechrysocolla = new WorldGenMinable(BlockInit.orechrysocolla.getDefaultState(), MainConfigHandler.orechrysocollaspawnchance);
		}
		if (MainConfigHandler.orejasper == true) {
			orejasper = new WorldGenMinable(BlockInit.orejasper.getDefaultState(), MainConfigHandler.orejasperspawnchance);
		}
		if (MainConfigHandler.oresugilite == true) {
			oresugilite = new WorldGenMinable(BlockInit.oresugilite.getDefaultState(), MainConfigHandler.oresugilitespawnchance);
		}
		
		if (MainConfigHandler.nethergems == true) {
		
		if (MainConfigHandler.netheroreruby == true) {
			netheroreruby = new WorldGenMinable(BlockInit.netheroreruby.getDefaultState(), MainConfigHandler.netherorerubyspawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netheroresapphire == true) {
			netheroresapphire = new WorldGenMinable(BlockInit.netheroresapphire.getDefaultState(), MainConfigHandler.netheroresapphirespawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netheroreamethyst == true) {
			netheroreamethyst = new WorldGenMinable(BlockInit.netheroreamethyst.getDefaultState(), MainConfigHandler.netheroreamethystspawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netheroretopaz == true) {
			netheroretopaz = new WorldGenMinable(BlockInit.netheroretopaz.getDefaultState(), MainConfigHandler.netheroretopazspawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netherorephoenixite == true) {
			netherorephoenixite = new WorldGenMinable(BlockInit.netherorephoenixite.getDefaultState(), MainConfigHandler.netherorephoenixitespawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netherorejade == true) {
			netherorejade = new WorldGenMinable(BlockInit.netherorejade.getDefaultState(), MainConfigHandler.netherorejadespawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netherorecitrine == true) {
			netherorecitrine = new WorldGenMinable(BlockInit.netherorecitrine.getDefaultState(), MainConfigHandler.netherorecitrinespawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netheroregarnet == true) {
			netheroregarnet = new WorldGenMinable(BlockInit.netheroregarnet.getDefaultState(), MainConfigHandler.netheroregarnetspawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netherorespinel == true) {
			netherorespinel = new WorldGenMinable(BlockInit.netherorespinel.getDefaultState(), MainConfigHandler.netherorespinelspawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netheroreonyx == true) {
			netheroreonyx = new WorldGenMinable(BlockInit.netheroreonyx.getDefaultState(), MainConfigHandler.netheroreonyxspawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netheroreagate == true) {
			netheroreagate = new WorldGenMinable(BlockInit.netheroreagate.getDefaultState(), MainConfigHandler.netheroreagatespawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netheroremalachite == true) {
			netheroremalachite = new WorldGenMinable(BlockInit.netheroremalachite.getDefaultState(), MainConfigHandler.netheroremalachitespawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netheroretourmaline == true) {
			netheroretourmaline = new WorldGenMinable(BlockInit.netheroretourmaline.getDefaultState(), MainConfigHandler.netheroretourmalinespawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netherorechrysocolla == true) {
			netherorechrysocolla = new WorldGenMinable(BlockInit.netherorechrysocolla.getDefaultState(), MainConfigHandler.netherorechrysocollaspawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netherorejasper == true) {
			netherorejasper = new WorldGenMinable(BlockInit.netherorejasper.getDefaultState(), MainConfigHandler.netherorejasperspawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		if (MainConfigHandler.netheroresugilite == true) {
			netheroresugilite = new WorldGenMinable(BlockInit.netheroresugilite.getDefaultState(), MainConfigHandler.netheroresugilitespawnchance, BlockMatcher.forBlock(Blocks.NETHERRACK));
		}
		}
		
		
	}
	

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		
		case -1:
			if (MainConfigHandler.nethergems == true) {
			if (MainConfigHandler.netheroreruby == true) {
				runGenerator(netheroreruby, world, random, chunkX, chunkZ, MainConfigHandler.netherorerubyspawnchance, 0, 125);
			}
			if (MainConfigHandler.netheroresapphire == true) {
				runGenerator(netheroresapphire, world, random, chunkX, chunkZ, MainConfigHandler.netheroresapphirespawnchance, 0, 125);
			}
			if (MainConfigHandler.netheroreamethyst == true) {
				runGenerator(netheroreamethyst, world, random, chunkX, chunkZ, MainConfigHandler.netheroreamethystspawnchance, 0, 125);
			}
			if (MainConfigHandler.netheroretopaz == true) {
				runGenerator(netheroretopaz, world, random, chunkX, chunkZ, MainConfigHandler.netheroretopazspawnchance, 0, 125);
			}
			if (MainConfigHandler.netherorephoenixite == true) {
				runGenerator(netherorephoenixite, world, random, chunkX, chunkZ, MainConfigHandler.netherorephoenixitespawnchance, 0, 125);
			}
			if (MainConfigHandler.netherorejade == true) {
				runGenerator(netherorejade, world, random, chunkX, chunkZ, MainConfigHandler.netherorejadespawnchance, 0, 125);
			}
			if (MainConfigHandler.netherorecitrine == true) {
				runGenerator(netherorecitrine, world, random, chunkX, chunkZ, MainConfigHandler.netherorecitrinespawnchance, 0, 125);
			}
			if (MainConfigHandler.netheroregarnet == true) {
				runGenerator(netheroregarnet, world, random, chunkX, chunkZ, MainConfigHandler.netheroregarnetspawnchance, 0, 125);
			}
			if (MainConfigHandler.netherorespinel == true) {
				runGenerator(netherorespinel, world, random, chunkX, chunkZ, MainConfigHandler.netherorespinelspawnchance, 0, 125);
			}
			if (MainConfigHandler.netheroreonyx == true) {
				runGenerator(netheroreonyx, world, random, chunkX, chunkZ, MainConfigHandler.netheroreonyxspawnchance, 0, 125);
			}
			if (MainConfigHandler.netheroreagate == true) {
				runGenerator(netheroreagate, world, random, chunkX, chunkZ, MainConfigHandler.netheroreagatespawnchance, 0, 125);
			}
			if (MainConfigHandler.netheroremalachite == true) {
				runGenerator(netheroremalachite, world, random, chunkX, chunkZ, MainConfigHandler.netheroremalachitespawnchance, 0, 125);
			}
			if (MainConfigHandler.netheroretourmaline == true) {
				runGenerator(netheroretourmaline, world, random, chunkX, chunkZ, MainConfigHandler.netheroretourmalinespawnchance, 0, 125);
			}
			if (MainConfigHandler.netherorechrysocolla == true) {
				runGenerator(netherorechrysocolla, world, random, chunkX, chunkZ, MainConfigHandler.netherorechrysocollaspawnchance, 0, 125);
			}
			if (MainConfigHandler.netherorejasper == true) {
				runGenerator(netherorejasper, world, random, chunkX, chunkZ, MainConfigHandler.netherorejasperspawnchance, 0, 125);
			}
			if (MainConfigHandler.netheroresugilite == true) {
				runGenerator(netheroresugilite, world, random, chunkX, chunkZ, MainConfigHandler.netheroresugilitespawnchance, 0, 125);
			}
			}
			
			break;
		
		case 0:

			if (MainConfigHandler.oreruby == true) {
				runGenerator(oreruby, world, random, chunkX, chunkZ, MainConfigHandler.orerubyspawnchance, 0, 42);
			}
			if (MainConfigHandler.oresapphire == true) {
				runGenerator(oresapphire, world, random, chunkX, chunkZ, MainConfigHandler.oresapphirespawnchance, 0, 32);
			}
			if (MainConfigHandler.oreamethyst == true) {
				runGenerator(oreamethyst, world, random, chunkX, chunkZ, MainConfigHandler.oreamethystspawnchance, 0, 68);
			}
			if (MainConfigHandler.oretopaz == true) {
				runGenerator(oretopaz, world, random, chunkX, chunkZ, MainConfigHandler.oretopazspawnchance, 0, 40);
			}
			if (MainConfigHandler.orephoenixite == true) {
				runGenerator(orephoenixite, world, random, chunkX, chunkZ, MainConfigHandler.orephoenixitespawnchance, 0, 27);
			}
			if (MainConfigHandler.orejade == true) {
				runGenerator(orejade, world, random, chunkX, chunkZ, MainConfigHandler.orejadespawnchance, 0, 44);
			}
			if (MainConfigHandler.orecitrine == true) {
				runGenerator(orecitrine, world, random, chunkX, chunkZ, MainConfigHandler.orejasperspawnchance, 0, 36);
			}
			if (MainConfigHandler.oregarnet == true) {
				runGenerator(oregarnet, world, random, chunkX, chunkZ, MainConfigHandler.oregarnetspawnchance, 0, 7);
			}
			if (MainConfigHandler.orespinel == true) {
				runGenerator(orespinel, world, random, chunkX, chunkZ, MainConfigHandler.oregarnetspawnchance, 0, 42);
			}
			if (MainConfigHandler.oreonyx == true) {
				runGenerator(oreonyx, world, random, chunkX, chunkZ, MainConfigHandler.oreonyxspawnchance, 0, 40);
			}
			if (MainConfigHandler.oreagate == true) {
				runGenerator(oreagate, world, random, chunkX, chunkZ, MainConfigHandler.oreagatespawnchance, 0, 38);
			}
			if (MainConfigHandler.oremalachite == true) {
				runGenerator(oremalachite, world, random, chunkX, chunkZ, MainConfigHandler.oremalachitespawnchance, 0, 60);
			}
			if (MainConfigHandler.oretourmaline == true) {
				runGenerator(oretourmaline, world, random, chunkX, chunkZ, MainConfigHandler.oretourmalinespawnchance, 0, 34);
			}
			if (MainConfigHandler.orechrysocolla == true) {
				runGenerator(orechrysocolla, world, random, chunkX, chunkZ, MainConfigHandler.orechrysocollaspawnchance, 0, 64);
			}
			if (MainConfigHandler.orejasper == true) {
				runGenerator(orejasper, world, random, chunkX, chunkZ, MainConfigHandler.orejasperspawnchance, 0, 38);
			}
			if (MainConfigHandler.oresugilite == true) {
				runGenerator(oresugilite, world, random, chunkX, chunkZ, MainConfigHandler.oresugilitespawnchance, 0, 42);
			}

			break;
		}
	}

	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance,
			int minHeight, int maxHeight) {
		if ((minHeight > maxHeight) || (minHeight < 0) || (maxHeight > 256)) {
			throw new IllegalArgumentException("Ore generated out of bounds");
		}

		int heightDiff = maxHeight - minHeight + 1;

		for (int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);

			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}


