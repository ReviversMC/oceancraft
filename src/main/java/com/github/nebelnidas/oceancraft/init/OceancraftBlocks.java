package com.github.nebelnidas.oceancraft.init;

import com.github.nebelnidas.oceancraft.Oceancraft;
import com.github.nebelnidas.oceancraft.blocks.*;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


// This class exports public block constants, these fields have to be public
public class OceancraftBlocks {
	public static SeaweedPlantBlock SEAWEED_PLANT_BLOCK;
	public static ThickSeaweedPlantBlock THICK_SEAWEED_PLANT_BLOCK;
	public static SeaweedBlock SEAWEED_BLOCK;

	
	public static void init() {
		SEAWEED_PLANT_BLOCK = new SeaweedPlantBlock();
		THICK_SEAWEED_PLANT_BLOCK = new ThickSeaweedPlantBlock();
		SEAWEED_BLOCK = new SeaweedBlock();



		SEAWEED_PLANT_BLOCK = registerBlock(SEAWEED_PLANT_BLOCK, "seaweed_plant_block");
		THICK_SEAWEED_PLANT_BLOCK = registerBlock(THICK_SEAWEED_PLANT_BLOCK, "thick_seaweed_plant_block");
		SEAWEED_BLOCK = registerBlock(SEAWEED_BLOCK, "seaweed_block");


		BlockRenderLayerMap.INSTANCE.putBlock(OceancraftBlocks.SEAWEED_PLANT_BLOCK, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(OceancraftBlocks.THICK_SEAWEED_PLANT_BLOCK, RenderLayer.getCutout());
	}

	private static <T extends Block> T registerBlock(Block block, String id) {
        return (T) Registry.register(Registry.BLOCK, new Identifier(Oceancraft.MOD_ID, id), block);
    }
}
