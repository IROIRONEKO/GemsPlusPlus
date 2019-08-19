package trhod177.gemsplusplus.intergration.tconstruct;

import net.minecraft.entity.passive.EntityVillager.EmeraldForItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Loader;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.BowMaterialStats;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.materials.MaterialTypes;
import slimeknights.tconstruct.library.traits.ITrait;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.tools.TinkerMaterials;
import slimeknights.tconstruct.tools.TinkerTraits;

public class MaterialInit {
	
	public static final Material Agate = new Material("Agate", 0x176AC4);
	public static final	Material Phoenixite = new Material("Phoenixite", 0xEC3B13);
	public static final Material Ruby = new Material("Ruby", 0xB10000);
	public static final Material Sapphire = new Material("Sapphire", 0x003DB4);
	public static final Material Amethyst = new Material("Amethyst", 0x8600CB);
	public static final Material Topaz = new Material("Topaz", 0xAC931C);
	public static final Material Jade = new Material("Jade", 0x44A113);
	public static final Material Citrine = new Material("Citrine", 0xA89A14);
	public static final Material Garnet = new Material("Garnet", 0x881012);
	public static final Material Spinel = new Material("Spinel", 0xB11551);
	public static final Material Malachite = new Material("Malachite", 0x15B557);
	public static final Material Tourmaline = new Material("Tourmaline", 0xB21578);
	public static final Material Chrysocolla = new Material("Chrysocolla", 0x15B5B1);
	public static final Material Sugilite = new Material("Sugilite", 0x4700A9);
	public static final Material Onyx = new Material("Onyx", 0x181818);

	
	public static void registerMaterials() {
		
	
    TinkerMaterials.materials.add(Agate);
    Agate.setCraftable(false);
    Agate.setCastable(true);
    Agate.setFluid(FluidInit.moltenagate);
    Agate.addItem(trhod177.gemsplusplus.init.ItemInit.agate);
    Agate.addItemIngot("ingotAgate");
    Agate.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.agate);
    Agate.addTrait(TinkerTraits.lightweight, MaterialTypes.HEAD);
    Agate.addTrait(TinkerTraits.stiff, MaterialTypes.HEAD);
    TinkerRegistry.addMaterialStats(Agate,
                new HeadMaterialStats(400, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Agate);
    
    TinkerMaterials.materials.add(Phoenixite);
    Phoenixite.setCraftable(false);
    Phoenixite.setCastable(true);
    Phoenixite.setFluid(FluidInit.moltenphoenixite);
    Phoenixite.addItem(trhod177.gemsplusplus.init.ItemInit.phoenixite);
    Phoenixite.addItemIngot("ingotPhoenixite");
    Phoenixite.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.phoenixite);
    Phoenixite.addTrait(TinkerTraits.autosmelt, MaterialTypes.HEAD);
    Phoenixite.addTrait(TinkerTraits.hellish, MaterialTypes.HEAD);
    Phoenixite.addTrait(TinkerTraits.superheat, MaterialTypes.PROJECTILE);
    TinkerRegistry.addMaterialStats(Phoenixite,
                new HeadMaterialStats(1300, 6.00f, 3.00f, HarvestLevels.COBALT),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Phoenixite);
    
    TinkerMaterials.materials.add(Ruby);
    Ruby.setCraftable(false);
    Ruby.setCastable(true);
    Ruby.setFluid(FluidInit.moltenruby);
    Ruby.addItem(trhod177.gemsplusplus.init.ItemInit.ruby);
    Ruby.addItemIngot("ingotRuby");
    Ruby.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.ruby);
    TinkerRegistry.addMaterialStats(Ruby,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Ruby);
    
   
    TinkerMaterials.materials.add(Sapphire);
    Sapphire.setCraftable(false);
    Sapphire.setFluid(FluidInit.moltensapphire);
    Sapphire.setCastable(true);
    Sapphire.addItem(trhod177.gemsplusplus.init.ItemInit.sapphire);
    Sapphire.addItemIngot("ingotSapphire");
    Sapphire.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.sapphire);
    TinkerRegistry.addMaterialStats(Sapphire,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Sapphire);
    
    
    TinkerMaterials.materials.add(Amethyst);
    Amethyst.setCraftable(false);
    Amethyst.setFluid(FluidInit.moltenamethyst);
    Amethyst.setCastable(true);
    Amethyst.addItem(trhod177.gemsplusplus.init.ItemInit.amethyst);
    Amethyst.addItemIngot("ingotAmethyst");
    Amethyst.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.amethyst);
    TinkerRegistry.addMaterialStats(Amethyst,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Amethyst);
    
    
    TinkerMaterials.materials.add(Topaz);
    Topaz.setCraftable(false);
    Topaz.setFluid(FluidInit.moltentopaz);
    Topaz.setCastable(true);
    Topaz.addItem(trhod177.gemsplusplus.init.ItemInit.topaz);
    Topaz.addItemIngot("ingotTopaz");
    Topaz.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.topaz);
    TinkerRegistry.addMaterialStats(Topaz,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Topaz);
    
    
    TinkerMaterials.materials.add(Jade);
    Jade.setCraftable(false);
    Jade.setFluid(FluidInit.moltenjade);
    Jade.setCastable(true);
    Jade.addItem(trhod177.gemsplusplus.init.ItemInit.jade);
    Jade.addItemIngot("ingotJade");
    Jade.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.jade);
    TinkerRegistry.addMaterialStats(Jade,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Jade);
    
    
    TinkerMaterials.materials.add(Citrine);
    Citrine.setCraftable(false);
    Citrine.setFluid(FluidInit.moltencitrine);
    Citrine.setCastable(true);
    Citrine.addItem(trhod177.gemsplusplus.init.ItemInit.citrine);
    Citrine.addItemIngot("ingotCitrine");
    Citrine.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.citrine);
    TinkerRegistry.addMaterialStats(Citrine,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Citrine);

    
    TinkerMaterials.materials.add(Garnet);
    Garnet.setCraftable(false);
    Garnet.setFluid(FluidInit.moltengarnet);
    Garnet.setCastable(true);
    Garnet.addItem(trhod177.gemsplusplus.init.ItemInit.garnet);
    Garnet.addItemIngot("ingotGarnet");
    Garnet.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.garnet);
    TinkerRegistry.addMaterialStats(Garnet,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Garnet);

    
    TinkerMaterials.materials.add(Spinel);
    Spinel.setCraftable(false);
    Spinel.setFluid(FluidInit.moltenspinel);
    Spinel.setCastable(true);
    Spinel.addItem(trhod177.gemsplusplus.init.ItemInit.spinel);
    Spinel.addItemIngot("ingotSpinel");
    Spinel.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.spinel);
    TinkerRegistry.addMaterialStats(Spinel,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Spinel);

    
    TinkerMaterials.materials.add(Malachite);
    Malachite.setCraftable(false);
    Malachite.setFluid(FluidInit.moltenmalachite);
    Malachite.setCastable(true);
    Malachite.addItem(trhod177.gemsplusplus.init.ItemInit.malachite);
    Malachite.addItemIngot("ingotMalachite");
    Malachite.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.malachite);
    TinkerRegistry.addMaterialStats(Malachite,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Malachite);

    
    TinkerMaterials.materials.add(Tourmaline);
    Tourmaline.setCraftable(false);
    Tourmaline.setFluid(FluidInit.moltentourmaline);
    Tourmaline.setCastable(true);
    Tourmaline.addItem(trhod177.gemsplusplus.init.ItemInit.tourmaline);
    Tourmaline.addItemIngot("ingotTourmaline");
    Tourmaline.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.tourmaline);
    TinkerRegistry.addMaterialStats(Tourmaline,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Tourmaline);

    
    TinkerMaterials.materials.add(Chrysocolla);
    Chrysocolla.setCraftable(false);
    Chrysocolla.setFluid(FluidInit.moltenchrysocolla);
    Chrysocolla.setCastable(true);
    Chrysocolla.addItem(trhod177.gemsplusplus.init.ItemInit.chrysocolla);
    Chrysocolla.addItemIngot("ingotChrysocolla");
    Chrysocolla.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.chrysocolla);
    TinkerRegistry.addMaterialStats(Chrysocolla,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Chrysocolla);

    
    TinkerMaterials.materials.add(Sugilite);
    Sugilite.setCraftable(false);
    Sugilite.setFluid(FluidInit.moltensugilite);
    Sugilite.setCastable(true);
    Sugilite.addItem(trhod177.gemsplusplus.init.ItemInit.sugilite);
    Sugilite.addItemIngot("ingotSugilite");
    Sugilite.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.sugilite);
    TinkerRegistry.addMaterialStats(Sugilite,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Sugilite);

    Material Jasper = new Material("Jasper", 0x922A2A);
    TinkerMaterials.materials.add(Jasper);
    Jasper.setCraftable(false);
    Jasper.setFluid(FluidInit.moltenjasper);
    Jasper.setCastable(true);
    Jasper.addItem(trhod177.gemsplusplus.init.ItemInit.jasper);
    Jasper.addItemIngot("ingotJasper");
    Jasper.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.jasper);
    TinkerRegistry.addMaterialStats(Jasper,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Jasper);
    
   
    TinkerMaterials.materials.add(Onyx);
    Onyx.setCraftable(false);
    Onyx.setFluid(FluidInit.moltenonyx);
    Onyx.setCastable(true);
    Onyx.addItem(trhod177.gemsplusplus.init.ItemInit.onyx);
    Onyx.addItemIngot("ingotOnyx");
    Onyx.setRepresentativeItem(trhod177.gemsplusplus.init.ItemInit.onyx);
    TinkerRegistry.addMaterialStats(Onyx,
                new HeadMaterialStats(600, 6.00f, 3.00f, HarvestLevels.IRON),
                new HandleMaterialStats(0.50f, 350),
                new ExtraMaterialStats(150),
                new BowMaterialStats(0.5f, 1.5f, 7f));
    TinkerRegistry.integrate(Onyx);
    
	}
}
