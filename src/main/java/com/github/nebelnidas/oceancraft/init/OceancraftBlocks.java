package com.github.nebelnidas.oceancraft.init;

import com.github.nebelnidas.oceancraft.Oceancraft;
import com.github.nebelnidas.oceancraft.blocks.*;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


// This class exports public block constants, these fields have to be public
public class OceancraftBlocks {
	public static SeaweedBlock SEAWEED_BLOCK;

	public static void init() {
		SEAWEED_BLOCK = new SeaweedBlock();



		SEAWEED_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Oceancraft.MOD_ID, "seaweed_block"), SEAWEED_BLOCK);
	}
}
