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
	public static final Item.Settings DEFAULT_ITEM_SETTINGS = new Item.Settings().group(Oceancraft.itemGroup);

	public static final ToolMaterial CORAL_TOOL_MATERIAL = new CoralToolMaterial();
	public static final ArmorMaterial CORAL_ARMOR_MATERIAL = new CoralArmorMaterial();
	public static final ArmorMaterial OCEANCRAFT_TURTLE_ARMOR_MATERIAL = new OceancraftTurtleArmorMaterial();


	public static BlockItem SEAWEED_PLANT_BLOCK;
	public static BlockItem THICK_SEAWEED_PLANT_BLOCK;
	public static BlockItem SEAWEED_BLOCK;

	public static BlockItem SEAROD_CORAL;
	public static BlockItem SEAWHIP_CORAL;
	public static BlockItem SHEET_CORAL;
	public static BlockItem STAR_CORAL;
	public static BlockItem BRAIN_CORAL;

	public static Item CORAL_DUST;
	public static Item CORAL_INGOT;

	public static ToolItem CORAL_SWORD;
	public static ToolItem CORAL_SHOVEL;
	public static ToolItem CORAL_AXE;
	public static ToolItem CORAL_PICKAXE;
	public static ToolItem CORAL_HOE;

	public static ArmorItem CORAL_HELMET;
	public static ArmorItem CORAL_CHESTPLATE;
	public static ArmorItem CORAL_LEGGINGS;
	public static ArmorItem CORAL_BOOTS;

	public static ArmorItem TURTLE_SHELL;

	public static Item WHITE_PEARL;
	public static Item BLACK_PEARL;
	public static WaterPearlItem WATER_PEARL;
	public static EnchantedWaterPearlItem ENCHANTED_WATER_PEARL;


	public static void init() {
		// ------------------------------------------------------------
		// Seaweed
		SEAWEED_PLANT_BLOCK = new BlockItem(OceancraftBlocks.SEAWEED_PLANT_BLOCK, DEFAULT_ITEM_SETTINGS);
		THICK_SEAWEED_PLANT_BLOCK = new BlockItem(OceancraftBlocks.THICK_SEAWEED_PLANT_BLOCK, DEFAULT_ITEM_SETTINGS);
		SEAWEED_BLOCK = new BlockItem(OceancraftBlocks.SEAWEED_BLOCK, DEFAULT_ITEM_SETTINGS);

		// Corals
		SEAROD_CORAL = new BlockItem(OceancraftBlocks.SEAROD_CORAL, DEFAULT_ITEM_SETTINGS);
		SEAWHIP_CORAL = new BlockItem(OceancraftBlocks.SEAWHIP_CORAL, DEFAULT_ITEM_SETTINGS);
		SHEET_CORAL = new BlockItem(OceancraftBlocks.SHEET_CORAL, DEFAULT_ITEM_SETTINGS);
		STAR_CORAL = new BlockItem(OceancraftBlocks.STAR_CORAL, DEFAULT_ITEM_SETTINGS);
		BRAIN_CORAL = new BlockItem(OceancraftBlocks.BRAIN_CORAL, DEFAULT_ITEM_SETTINGS);

		// Coral tools
		CORAL_DUST = new Item(DEFAULT_ITEM_SETTINGS);
		CORAL_INGOT = new Item(DEFAULT_ITEM_SETTINGS);
		CORAL_SWORD = new CoralSwordItem(CORAL_TOOL_MATERIAL, DEFAULT_ITEM_SETTINGS);
		CORAL_SHOVEL = new CoralShovelItem(CORAL_TOOL_MATERIAL, DEFAULT_ITEM_SETTINGS);
		CORAL_AXE = new CoralAxeItem(CORAL_TOOL_MATERIAL, DEFAULT_ITEM_SETTINGS);
		CORAL_PICKAXE = new CoralPickaxeItem(new CoralToolMaterial(), DEFAULT_ITEM_SETTINGS);
		CORAL_HOE = new CoralHoeItem(CORAL_TOOL_MATERIAL, DEFAULT_ITEM_SETTINGS);

		// Coral armor
		CORAL_HELMET = new OceancraftArmorItem(CORAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, DEFAULT_ITEM_SETTINGS);
		CORAL_CHESTPLATE = new OceancraftArmorItem(CORAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, DEFAULT_ITEM_SETTINGS);
		CORAL_LEGGINGS = new OceancraftArmorItem(CORAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, DEFAULT_ITEM_SETTINGS);
		CORAL_BOOTS = new OceancraftArmorItem(CORAL_ARMOR_MATERIAL, EquipmentSlot.FEET, DEFAULT_ITEM_SETTINGS);

		// Turtle armor
		TURTLE_SHELL = new OceancraftArmorItem(OCEANCRAFT_TURTLE_ARMOR_MATERIAL, EquipmentSlot.CHEST, DEFAULT_ITEM_SETTINGS);

		// Pearls
		WHITE_PEARL = new Item(DEFAULT_ITEM_SETTINGS);
		BLACK_PEARL = new Item(DEFAULT_ITEM_SETTINGS);
		WATER_PEARL = new WaterPearlItem(DEFAULT_ITEM_SETTINGS);
		ENCHANTED_WATER_PEARL = new EnchantedWaterPearlItem(DEFAULT_ITEM_SETTINGS);



		// ------------------------------------------------------------
		// Seaweed
		SEAWEED_PLANT_BLOCK = registerItem(SEAWEED_PLANT_BLOCK, "seaweed_plant_block");
		THICK_SEAWEED_PLANT_BLOCK = registerItem(THICK_SEAWEED_PLANT_BLOCK, "thick_seaweed_plant_block");
		SEAWEED_BLOCK = registerItem(SEAWEED_BLOCK, "seaweed_block");

		// Corals
		SEAROD_CORAL = registerItem(SEAROD_CORAL, "searod_coral");
		SEAWHIP_CORAL = registerItem(SEAWHIP_CORAL, "seawhip_coral");
		SHEET_CORAL = registerItem(SHEET_CORAL, "sheet_coral");
		STAR_CORAL = registerItem(STAR_CORAL, "star_coral");
		BRAIN_CORAL = registerItem(BRAIN_CORAL, "brain_coral");

		// Coral tools
		CORAL_DUST = registerItem(CORAL_DUST,"coral_dust");
		CORAL_INGOT = registerItem(CORAL_INGOT, "coral_ingot");
		CORAL_SWORD = registerItem(CORAL_SWORD, "coral_sword");
		CORAL_SHOVEL = registerItem(CORAL_SHOVEL, "coral_shovel");
		CORAL_AXE = registerItem(CORAL_AXE, "coral_axe");
		CORAL_PICKAXE = registerItem(CORAL_PICKAXE, "coral_pickaxe");
		CORAL_HOE = registerItem(CORAL_HOE, "coral_hoe");

		// Coral armor
		CORAL_HELMET = registerItem(CORAL_HELMET, "coral_helmet");
		CORAL_CHESTPLATE = registerItem(CORAL_CHESTPLATE, "coral_chestplate");
		CORAL_LEGGINGS = registerItem(CORAL_LEGGINGS, "coral_leggings");
		CORAL_BOOTS = registerItem(CORAL_BOOTS, "coral_boots");

		// Turtle armor
		TURTLE_SHELL = registerItem(TURTLE_SHELL, "turtle_shell");

		// Pearls
		WHITE_PEARL = registerItem(WHITE_PEARL, "white_pearl");
		BLACK_PEARL = registerItem(BLACK_PEARL, "black_pearl");
		WATER_PEARL = registerItem(WATER_PEARL, "water_pearl");
		ENCHANTED_WATER_PEARL = registerItem(ENCHANTED_WATER_PEARL, "enchanted_water_pearl");
	}

	private static <T extends Item> T registerItem(Item item, String id) {
        return (T) Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, id), item);
    }
}
