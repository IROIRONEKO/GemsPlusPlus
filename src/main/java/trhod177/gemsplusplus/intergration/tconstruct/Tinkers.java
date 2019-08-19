package trhod177.gemsplusplus.intergration.tconstruct;

import c4.conarm.common.armor.utils.ArmorHelper;
import c4.conarm.integrations.contenttweaker.ArmorFunctions;
import c4.conarm.lib.ArmoryRegistry;
import c4.conarm.lib.ArmoryRegistryClient;
import c4.conarm.lib.armor.ArmorCore;
import c4.conarm.lib.materials.ArmorMaterialType;
import c4.conarm.lib.materials.ArmorMaterials;
import c4.conarm.lib.materials.TrimMaterialStats;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import slimeknights.mantle.util.RecipeMatch;
import slimeknights.tconstruct.TinkerIntegration;
import slimeknights.tconstruct.library.MaterialIntegration;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.BowMaterialStats;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.materials.MaterialTypes;
import slimeknights.tconstruct.library.tinkering.TinkersItem;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;
import slimeknights.tconstruct.tools.TinkerMaterials;
import slimeknights.tconstruct.tools.TinkerTools;
import slimeknights.tconstruct.tools.TinkerTraits;



public class Tinkers {
	
	public static void preInit(FMLPreInitializationEvent event) {
		//RegistryHandler.preInitRegistries(event);
			
		FluidInit.registerFluids();
		MaterialInit.registerMaterials();
		
	
		NBTTagCompound agate = new NBTTagCompound();
		agate.setString("fluid", FluidInit.moltenagate.getName());
		agate.setString("ore", "Agate");
		agate.setString("ingot", "Agate");
		agate.setString("block", "Agate");
		agate.setBoolean("toolforge", true);
		
		NBTTagCompound ruby = new NBTTagCompound();
		ruby.setString("fluid", FluidInit.moltenruby.getName());
		ruby.setString("ore", "Ruby");
		ruby.setString("ingot", "Ruby");
		ruby.setString("block", "Ruby");
		ruby.setBoolean("toolforge", true);

		NBTTagCompound sapphire = new NBTTagCompound();
		sapphire.setString("fluid", FluidInit.moltensapphire.getName());
		sapphire.setString("ore", "Sapphire");
		sapphire.setString("ingot", "Sapphire");
		sapphire.setString("block", "Sapphire");
		sapphire.setBoolean("toolforge", true);

		NBTTagCompound amethyst = new NBTTagCompound();
		amethyst.setString("fluid", FluidInit.moltenamethyst.getName());
		amethyst.setString("ore", "Amethyst");
		amethyst.setString("ingot", "Amethyst");
		amethyst.setString("block", "Amethyst");
		amethyst.setBoolean("toolforge", true);

		NBTTagCompound topaz = new NBTTagCompound();
		topaz.setString("fluid", FluidInit.moltentopaz.getName());
		topaz.setString("ore", "Topaz");
		topaz.setString("ingot", "Topaz");
		topaz.setString("block", "Topaz");
		topaz.setBoolean("toolforge", true);

		NBTTagCompound phoenixite = new NBTTagCompound();
		phoenixite.setString("fluid", FluidInit.moltenphoenixite.getName());
		phoenixite.setString("ore", "Phoenixite");
		phoenixite.setString("ingot", "Phoenixite");
		phoenixite.setString("block", "Phoenixite");
		phoenixite.setBoolean("toolforge", true);
		
		NBTTagCompound jade = new NBTTagCompound();
		jade.setString("fluid", FluidInit.moltenjade.getName());
		jade.setString("ore", "Jade");
		jade.setString("ingot", "Jade");
		jade.setString("block", "Jade");
		jade.setBoolean("toolforge", true);
		
		NBTTagCompound citrine = new NBTTagCompound();
		citrine.setString("fluid", FluidInit.moltencitrine.getName());
		citrine.setString("ore", "Citrine");
		citrine.setString("ingot", "Citrine");
		citrine.setString("block", "Citrine");
		citrine.setBoolean("toolforge", true);

		NBTTagCompound garnet = new NBTTagCompound();
		garnet.setString("fluid", FluidInit.moltengarnet.getName());
		garnet.setString("ore", "Garnet");
		garnet.setString("ingot", "Garnet");
		garnet.setString("block", "Garnet");
		garnet.setBoolean("toolforge", true);
		
		NBTTagCompound spinel = new NBTTagCompound();
		spinel.setString("fluid", FluidInit.moltenspinel.getName());
		spinel.setString("ore", "Spinel");
		spinel.setString("ingot", "Spinel");
		spinel.setString("block", "Spinel");
		spinel.setBoolean("toolforge", true);

		NBTTagCompound onyx = new NBTTagCompound();
		onyx.setString("fluid", FluidInit.moltenonyx.getName());
		onyx.setString("ore", "Onyx");
		onyx.setString("ingot", "Onyx");
		onyx.setString("block", "Onyx");
		onyx.setBoolean("toolforge", true);

		NBTTagCompound malachite = new NBTTagCompound();
		malachite.setString("fluid", FluidInit.moltenmalachite.getName());
		malachite.setString("ore", "Malachite");
		malachite.setString("ingot", "Malachite");
		malachite.setString("block", "Malachite");
		malachite.setBoolean("toolforge", true);
		
		NBTTagCompound tourmaline = new NBTTagCompound();
		tourmaline.setString("fluid", FluidInit.moltentourmaline.getName());
		tourmaline.setString("ore", "Tourmaline");
		tourmaline.setString("ingot", "Tourmaline");
		tourmaline.setString("block", "Tourmaline");
		tourmaline.setBoolean("toolforge", true);

		NBTTagCompound chrysocolla = new NBTTagCompound();
		chrysocolla.setString("fluid", FluidInit.moltenchrysocolla.getName());
		chrysocolla.setString("ore", "Chrysocolla");
		chrysocolla.setString("ingot", "Chrysocolla");
		chrysocolla.setString("block", "Chrysocolla");
		chrysocolla.setBoolean("toolforge", true);

		NBTTagCompound sugilite = new NBTTagCompound();
		sugilite.setString("fluid", FluidInit.moltensugilite.getName());
		sugilite.setString("ore", "Sugilite");
		sugilite.setString("ingot", "Sugilite");
		sugilite.setString("block", "Sugilite");
		sugilite.setBoolean("toolforge", true);
		
		NBTTagCompound jasper = new NBTTagCompound();
		jasper.setString("fluid", FluidInit.moltenjasper.getName());
		jasper.setString("ore", "Jasper");
		jasper.setString("ingot", "Jasper");
		jasper.setString("block", "Jasper");
		jasper.setBoolean("toolforge", true);

		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", phoenixite);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", sugilite);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", chrysocolla);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", tourmaline);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", malachite);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", onyx);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", spinel);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", garnet);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", citrine);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", jade);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", topaz);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", amethyst);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", sapphire);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", ruby);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", agate);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", jasper);
		
			
			
		
	}
	

	public static void init(FMLInitializationEvent event) {

		TinkerRegistry.registerTableCasting(new ItemStack(trhod177.gemsplusplus.init.ItemInit.agate, 1), TinkerSmeltery.castGem, FluidInit.moltenagate, 144);
		TinkerRegistry.registerBasinCasting(new ItemStack(trhod177.gemsplusplus.init.BlockInit.blockagate, 1), ItemStack.EMPTY, FluidInit.moltenagate, 1296);
		
		TinkerRegistry.registerSmelteryFuel(new FluidStack(FluidInit.moltenphoenixite, 10), 500);
		
		
		//RegistryHandler.initRegistries(event);
		
	}
	

	public static void postInit(FMLPostInitializationEvent event) {
		//RegistryHandler.postInitRegistries(event);
			
	}

}
