package trhod177.gemsplusplus.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.gemsplusplus.GemsPlusPlus;
import trhod177.gemsplusplus.blocks.BlockGem;
import trhod177.gemsplusplus.blocks.BlockGemGlass;
import trhod177.gemsplusplus.blocks.BlockGemOre;
import trhod177.gemsplusplus.blocks.BlockGemSand;
import trhod177.gemsplusplus.blocks.GPPGlassPane;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;


public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block blockruby = new BlockGem("blockruby", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blocksapphire = new BlockGem("blocksapphire", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockamethyst = new BlockGem("blockamethyst", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blocktopaz = new BlockGem("blocktopaz", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockphoenixite = new BlockGem("blockphoenixite", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockjade = new BlockGem("blockjade", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockcitrine = new BlockGem("blockcitrine", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockgarnet = new BlockGem("blockgarnet", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockspinel = new BlockGem("blockspinel", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockonyx = new BlockGem("blockonyx", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockagate = new BlockGem("blockagate", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockmalachite = new BlockGem("blockmalachite", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blocktourmaline = new BlockGem("blocktourmaline", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockchrysocolla = new BlockGem("blockchrysocolla", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blockjasper = new BlockGem("blockjasper", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block blocksugilite = new BlockGem("blocksugilite", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	//public static final Block blockperidot = new BlockGem("blockperidot", Material.ROCK).setCreativeTab(GemsPlusPlus.GPPBlocksTab);

    public static final Block oreruby = new BlockGemOre("oreruby", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block oresapphire = new BlockGemOre("oresapphire", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block oreamethyst = new BlockGemOre("oreamethyst", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block oretopaz = new BlockGemOre("oretopaz", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block orephoenixite = new BlockGemOre("orephoenixite", 5f, 600f).setLightLevel(5).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block orejade = new BlockGemOre("orejade", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block orecitrine = new BlockGemOre("orecitrine", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block oregarnet = new BlockGemOre("oregarnet", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block orespinel = new BlockGemOre("orespinel", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block oreonyx = new BlockGemOre("oreonyx", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block oreagate = new BlockGemOre("oreagate", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block oremalachite = new BlockGemOre("oremalachite", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block oretourmaline = new BlockGemOre("oretourmaline", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block orechrysocolla = new BlockGemOre("orechrysocolla", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block orejasper = new BlockGemOre("orejasper", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block oresugilite = new BlockGemOre("oresugilite", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	//public static final Block orechrysolite = new BlockGemOre("orechrysolite").setCreativeTab(GemsPlusPlus.GPPBlocksTab);

	public static final Block netheroreruby = new BlockGemOre("netheroreruby", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netheroresapphire = new BlockGemOre("netheroresapphire", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netheroreamethyst = new BlockGemOre("netheroreamethyst", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netheroretopaz = new BlockGemOre("netheroretopaz", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netherorephoenixite = new BlockGemOre("netherorephoenixite", 5f, 600f).setLightLevel(5).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netherorejade = new BlockGemOre("netherorejade", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netherorecitrine = new BlockGemOre("netherorecitrine", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netheroregarnet = new BlockGemOre("netheroregarnet", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netherorespinel = new BlockGemOre("netherorespinel", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netheroreonyx = new BlockGemOre("netheroreonyx", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netheroreagate = new BlockGemOre("netheroreagate", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netheroremalachite = new BlockGemOre("netheroremalachite", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netheroretourmaline = new BlockGemOre("netheroretourmaline", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netherorechrysocolla = new BlockGemOre("netherorechrysocolla", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netherorejasper = new BlockGemOre("netherorejasper", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block netheroresugilite = new BlockGemOre("netheroresugilite", 2f, 400f).setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	//public static final Block netherorechrysolite = new BlockGemOre("netherorechrysolite").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	
    public static final Block glassruby = new BlockGemGlass("glassruby").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glasssapphire = new BlockGemGlass("glasssapphire").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glassamethyst = new BlockGemGlass("glassamethyst").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glasstopaz = new BlockGemGlass("glasstopaz").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glassphoenixite = new BlockGemGlass("glassphoenixite").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glassjade = new BlockGemGlass("glassjade").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glasscitrine = new BlockGemGlass("glasscitrine").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glassgarnet = new BlockGemGlass("glassgarnet").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glassspinel = new BlockGemGlass("glassspinel").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glassonyx = new BlockGemGlass("glassonyx").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glassagate = new BlockGemGlass("glassagate").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glassmalachite = new BlockGemGlass("glassmalachite").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glasstourmaline = new BlockGemGlass("glasstourmaline").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glasschrysocolla = new BlockGemGlass("glasschrysocolla").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glassjasper = new BlockGemGlass("glassjasper").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block glasssugilite = new BlockGemGlass("glasssugilite").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	//public static final Block glassperidot = new BlockGemGlass("glassperidot").setCreativeTab(GemsPlusPlus.GPPBlocksTab);

    public static final Block sandruby = new BlockGemSand("sandruby").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandsapphire = new BlockGemSand("sandsapphire").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandamethyst = new BlockGemSand("sandamethyst").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandtopaz = new BlockGemSand("sandtopaz").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandphoenixite = new BlockGemSand("sandphoenixite").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandjade = new BlockGemSand("sandjade").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandcitrine = new BlockGemSand("sandcitrine").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandgarnet = new BlockGemSand("sandgarnet").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandspinel = new BlockGemSand("sandspinel").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandonyx = new BlockGemSand("sandonyx").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandagate = new BlockGemSand("sandagate").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandmalachite = new BlockGemSand("sandmalachite").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandtourmaline = new BlockGemSand("sandtourmaline").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandchrysocolla = new BlockGemSand("sandchrysocolla").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandjasper = new BlockGemSand("sandjasper").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sandsugilite = new BlockGemSand("sandsugilite").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	//public static final Block sandperidot = new BlockGemSand("sandperidot").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	
	public static final Block rubyglasspane = new GPPGlassPane("rubyglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sapphireglasspane = new GPPGlassPane("sapphireglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block amethystglasspane = new GPPGlassPane("amethystglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block topazglasspane = new GPPGlassPane("topazglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block phoenixiteglasspane = new GPPGlassPane("phoenixiteglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block jadeglasspane = new GPPGlassPane("jadeglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block citrineglasspane = new GPPGlassPane("citrineglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block garnetglasspane = new GPPGlassPane("garnetglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block spinelglasspane = new GPPGlassPane("spinelglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block onyxglasspane = new GPPGlassPane("onyxglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block agateglasspane = new GPPGlassPane("agateglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block malachiteglasspane = new GPPGlassPane("malachiteglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block tourmalineglasspane = new GPPGlassPane("tourmalineglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block chrysocollaglasspane = new GPPGlassPane("chrysocollaglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block jasperglasspane = new GPPGlassPane("jasperglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	public static final Block sugiliteglasspane = new GPPGlassPane("sugiliteglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);
	//public static final Block peridotglasspane = new GPPGlassPane("peridotglasspane").setCreativeTab(GemsPlusPlus.GPPBlocksTab);


}
