package trhod177.gemsplusplus.intergration.tconstruct;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import slimeknights.tconstruct.library.fluid.FluidMolten;

public class FluidInit {

	public static final Fluid moltenagate = new FluidMolten("moltenagate", 0x176AC4, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltenruby = new FluidMolten("moltenruby", 0xB10000, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltensapphire = new FluidMolten("moltensapphire", 0x003DB4, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltenamethyst = new FluidMolten("moltenamethyst", 0x8600CB, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltentopaz = new FluidMolten("moltentopaz", 0xAC931C, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltenphoenixite = new FluidMolten("moltenphoenixite", 0xEC3B13, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow")).setTemperature(2000);
	public static final Fluid moltenjade = new FluidMolten("moltenjade", 0x44A113, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltencitrine = new FluidMolten("moltencitrine", 0xA89A14, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltengarnet = new FluidMolten("moltengarnet", 0x881012, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltenspinel = new FluidMolten("moltenspinel", 0xB11551, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltenonyx = new FluidMolten("moltenonyx", 0x181818, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltenmalachite = new FluidMolten("moltenmalachite", 0x15B557, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltentourmaline = new FluidMolten("moltentourmaline", 0xB21578, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltenchrysocolla = new FluidMolten("moltenchrysocolla", 0x15B5B1, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltensugilite = new FluidMolten("moltensugilite", 0x4700A9, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	public static final Fluid moltenjasper = new FluidMolten("moltenjasper", 0x922A2A, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
	
	public static void registerFluids() {
		
		
		registerFluid(moltenagate);
		registerFluid(moltenruby);
		registerFluid(moltenamethyst);
		registerFluid(moltentopaz);
		registerFluid(moltenphoenixite);
		registerFluid(moltenjade);
		registerFluid(moltencitrine);
		registerFluid(moltengarnet);
		registerFluid(moltenspinel);
		registerFluid(moltenonyx);
		registerFluid(moltenmalachite);
		registerFluid(moltentourmaline);
		registerFluid(moltenchrysocolla);
		registerFluid(moltensugilite);
		registerFluid(moltenjasper);
		registerFluid(moltensapphire);
	}
	
	public static void registerFluid(Fluid fluid) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
