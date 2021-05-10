package com.github.nebelnidas.oceancraft;

import com.github.nebelnidas.oceancraft.feature.OceancraftFeature;
import com.github.nebelnidas.oceancraft.init.*;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class Oceancraft implements ModInitializer {

	public static final String MOD_ID = "oceancraft";
	public static ItemGroup itemGroup;	


	@Override
	public void onInitialize() {
		itemGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "oceancraft"), () -> new ItemStack(OceancraftItems.CORAL_HELMET));

		OceancraftBlocks.init();
		OceancraftItems.init();
		OceancraftFeature.init();
		OceancraftConfiguredFeatures.init();
	}
	
}
