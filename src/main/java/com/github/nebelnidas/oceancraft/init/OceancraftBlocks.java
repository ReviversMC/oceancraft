package com.github.nebelnidas.oceancraft.init;

import com.github.nebelnidas.oceancraft.Oceancraft;
import com.github.nebelnidas.oceancraft.blocks.*;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.block.MaterialColor;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


// This class exports public block constants, these fields have to be public
public class OceancraftBlocks {
	public static SeaweedPlantBlock SEAWEED_PLANT_BLOCK;
	public static ThickSeaweedPlantBlock THICK_SEAWEED_PLANT_BLOCK;
	public static SeaweedBlock SEAWEED_BLOCK;

	public static CoralBlock SEAROD_CORAL;
	public static CoralBlock SEAWHIP_CORAL;
	public static CoralBlock SHEET_CORAL;
	public static CoralBlock STAR_CORAL;
	public static CoralBlock BRAIN_CORAL;


	public static void init() {
		// ------------------------------------------------------------
		// Seaweed
		SEAWEED_PLANT_BLOCK = new SeaweedPlantBlock();
		THICK_SEAWEED_PLANT_BLOCK = new ThickSeaweedPlantBlock();
		SEAWEED_BLOCK = new SeaweedBlock();

		// Corals
		SEAROD_CORAL = new CoralBlock(MaterialColor.RED);
		SEAWHIP_CORAL = new CoralBlock(MaterialColor.ORANGE);
		SHEET_CORAL = new CoralBlock(MaterialColor.YELLOW);
		STAR_CORAL = new CoralBlock(MaterialColor.BLUE);
		BRAIN_CORAL = new CoralBlock(MaterialColor.GREEN);


		// ------------------------------------------------------------
		// Seaweed
		SEAWEED_PLANT_BLOCK = registerBlock(SEAWEED_PLANT_BLOCK, "seaweed_plant_block");
		THICK_SEAWEED_PLANT_BLOCK = registerBlock(THICK_SEAWEED_PLANT_BLOCK, "thick_seaweed_plant_block");
		SEAWEED_BLOCK = registerBlock(SEAWEED_BLOCK, "seaweed_block");

		// Corals
		SEAROD_CORAL = registerBlock(SEAROD_CORAL, "searod_coral");
		SEAWHIP_CORAL = registerBlock(SEAWHIP_CORAL, "seawhip_coral");
		SHEET_CORAL = registerBlock(SHEET_CORAL, "sheet_coral");
		STAR_CORAL = registerBlock(STAR_CORAL, "star_coral");
		BRAIN_CORAL = registerBlock(BRAIN_CORAL, "brain_coral");


		// ------------------------------------------------------------
		// Register transparent blocks
		BlockRenderLayerMap.INSTANCE.putBlock(OceancraftBlocks.SEAWEED_PLANT_BLOCK, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(OceancraftBlocks.THICK_SEAWEED_PLANT_BLOCK, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(OceancraftBlocks.SEAROD_CORAL, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(OceancraftBlocks.SEAWHIP_CORAL, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(OceancraftBlocks.SHEET_CORAL, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(OceancraftBlocks.STAR_CORAL, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(OceancraftBlocks.BRAIN_CORAL, RenderLayer.getCutout());
	}

	private static <T extends Block> T registerBlock(Block block, String id) {
        return (T) Registry.register(Registry.BLOCK, new Identifier(Oceancraft.MOD_ID, id), block);
    }
}
