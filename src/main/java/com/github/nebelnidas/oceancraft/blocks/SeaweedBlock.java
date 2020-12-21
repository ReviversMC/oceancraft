package com.github.nebelnidas.oceancraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class SeaweedBlock extends Block {

	public SeaweedBlock() {
		super(FabricBlockSettings.copy(Blocks.HAY_BLOCK));
	}

}
