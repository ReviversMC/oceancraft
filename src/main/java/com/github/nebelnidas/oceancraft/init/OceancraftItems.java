package com.github.nebelnidas.oceancraft.init;

import com.github.nebelnidas.oceancraft.Oceancraft;
import com.github.nebelnidas.oceancraft.armor.*;
import com.github.nebelnidas.oceancraft.items.*;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


// This class exports public item constants, these fields have to be public
public class OceancraftItems {
	public static final ToolMaterial CORAL_TOOL_MATERIAL = new CoralToolMaterial();
	public static final ArmorMaterial CORAL_ARMOR_MATERIAL = new CoralArmorMaterial();


	public static Item BLACK_PEARL;
	public static Item CORAL_DUST;
	public static Item CORAL_INGOT;

	public static ToolItem CORAL_AXE;
	public static ToolItem CORAL_PICKAXE;
	public static ToolItem CORAL_SHOVEL;
	public static ToolItem CORAL_HOE;
	public static ToolItem CORAL_SWORD;

	public static ArmorItem CORAL_HELMET;
	public static ArmorItem CORAL_CHESTPLATE;
	public static ArmorItem CORAL_LEGGINGS;
	public static ArmorItem CORAL_BOOTS;

	public static BlockItem SEAWEED_BLOCK;

	public static void init() {
		SEAWEED_BLOCK = new BlockItem(OceancraftBlocks.SEAWEED_BLOCK, new Item.Settings().group(Oceancraft.itemGroup));

		CORAL_DUST = new Item(new Item.Settings().group(Oceancraft.itemGroup));
		CORAL_INGOT = new Item(new Item.Settings().group(Oceancraft.itemGroup));
		CORAL_SWORD = new CoralSwordItem(CORAL_TOOL_MATERIAL, new Item.Settings().group(Oceancraft.itemGroup));
		CORAL_SHOVEL = new CoralShovelItem(CORAL_TOOL_MATERIAL, new Item.Settings().group(Oceancraft.itemGroup));
		CORAL_AXE = new CoralAxeItem(CORAL_TOOL_MATERIAL, new Item.Settings().group(Oceancraft.itemGroup));
		CORAL_PICKAXE = new CoralPickaxeItem(new CoralToolMaterial(), new Item.Settings().group(Oceancraft.itemGroup));
		CORAL_HOE = new CoralHoeItem(CORAL_TOOL_MATERIAL, new Item.Settings().group(Oceancraft.itemGroup));

		CORAL_HELMET = new CoralArmorBase(CORAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Oceancraft.itemGroup));
		CORAL_CHESTPLATE = new CoralArmorBase(CORAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Oceancraft.itemGroup));
		CORAL_LEGGINGS = new CoralArmorBase(CORAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Oceancraft.itemGroup));
		CORAL_BOOTS = new CoralArmorBase(CORAL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Oceancraft.itemGroup));

		BLACK_PEARL = new Item(new Item.Settings().group(Oceancraft.itemGroup));


		
		SEAWEED_BLOCK = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "seaweed_block"), SEAWEED_BLOCK);

		CORAL_DUST = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_dust"), CORAL_DUST);
		CORAL_INGOT = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_ingot"), CORAL_INGOT);
		CORAL_SWORD = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_sword"), CORAL_SWORD);
		CORAL_SHOVEL = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_shovel"), CORAL_SHOVEL);
		CORAL_AXE = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_axe"), CORAL_AXE);
		CORAL_PICKAXE = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_pickaxe"), CORAL_PICKAXE);
		CORAL_HOE = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_hoe"), CORAL_HOE);
		
		CORAL_HELMET = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_helmet"), CORAL_HELMET);
		CORAL_CHESTPLATE = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_chestplate"), CORAL_CHESTPLATE);
		CORAL_LEGGINGS = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_leggings"), CORAL_LEGGINGS);
		CORAL_BOOTS = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "coral_boots"), CORAL_BOOTS);

		BLACK_PEARL = Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, "black_pearl"), BLACK_PEARL);
	}
}
