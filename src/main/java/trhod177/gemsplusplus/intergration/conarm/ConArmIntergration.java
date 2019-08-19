package trhod177.gemsplusplus.intergration.conarm;

import java.util.Optional;

import c4.conarm.common.armor.traits.ArmorTraits;
import c4.conarm.lib.ArmoryRegistry;
import c4.conarm.lib.armor.ArmorNBT;
import c4.conarm.lib.materials.ArmorMaterialType;
import c4.conarm.lib.materials.ArmorMaterials;
import c4.conarm.lib.materials.CoreMaterialStats;
import c4.conarm.lib.materials.PlatesMaterialStats;
import c4.conarm.lib.materials.TrimMaterialStats;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.tools.TinkerTraits;
import trhod177.gemsplusplus.intergration.tconstruct.MaterialInit;

public class ConArmIntergration {
	
	public static void preInit(FMLPreInitializationEvent event) {
		
	
	}
	
	public static void init(FMLInitializationEvent event) {
		
	if(Loader.isModLoaded("conarm") && !Loader.isModLoaded("armoryexpansion")) {
		Optional.ofNullable(MaterialInit.Agate).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f), new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Amethyst).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Chrysocolla).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Citrine).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Garnet).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Jade).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Malachite).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Onyx).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Phoenixite).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, ArmorTraits.superhot);
			ArmorMaterials.addArmorTrait(mat, ArmorTraits.infernal);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(30, 40), new PlatesMaterialStats(2, 5, 5.4f),
					new TrimMaterialStats(20f));
		});
		
		Optional.ofNullable(MaterialInit.Ruby).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Sapphire).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Spinel).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Sugilite).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Topaz).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
		
		Optional.ofNullable(MaterialInit.Tourmaline).ifPresent(mat -> {
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.lightweight, ArmorMaterialType.CORE);
			ArmorMaterials.addArmorTrait(mat, TinkerTraits.stiff);
			TinkerRegistry.addMaterialStats(mat, new CoreMaterialStats(14, 20), new PlatesMaterialStats(1, 7, 2.2f),
					new TrimMaterialStats(10f));
		});
	}
		
	}
	
	public static void postInit(FMLPostInitializationEvent event) {
		
	}

}
