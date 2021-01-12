package com.github.nebelnidas.oceancraft.init;

import com.github.nebelnidas.oceancraft.Oceancraft;
import com.github.nebelnidas.oceancraft.armor.*;
import com.github.nebelnidas.oceancraft.items.*;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
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

	public static ArmorItem TURTLE_SHELL;
	public static BlockItem SEAWEED_BLOCK;

	public static void init() {
		SEAWEED_BLOCK = new BlockItem(OceancraftBlocks.SEAWEED_BLOCK, DEFAULT_ITEM_SETTINGS);

		CORAL_DUST = new Item(DEFAULT_ITEM_SETTINGS);
		CORAL_INGOT = new Item(DEFAULT_ITEM_SETTINGS);
		CORAL_SWORD = new CoralSwordItem(CORAL_TOOL_MATERIAL, DEFAULT_ITEM_SETTINGS);
		CORAL_SHOVEL = new CoralShovelItem(CORAL_TOOL_MATERIAL, DEFAULT_ITEM_SETTINGS);
		CORAL_AXE = new CoralAxeItem(CORAL_TOOL_MATERIAL, DEFAULT_ITEM_SETTINGS);
		CORAL_PICKAXE = new CoralPickaxeItem(new CoralToolMaterial(), DEFAULT_ITEM_SETTINGS);
		CORAL_HOE = new CoralHoeItem(CORAL_TOOL_MATERIAL, DEFAULT_ITEM_SETTINGS);

		CORAL_HELMET = new OceancraftArmorItem(CORAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, DEFAULT_ITEM_SETTINGS);
		CORAL_CHESTPLATE = new OceancraftArmorItem(CORAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, DEFAULT_ITEM_SETTINGS);
		CORAL_LEGGINGS = new OceancraftArmorItem(CORAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, DEFAULT_ITEM_SETTINGS);
		CORAL_BOOTS = new OceancraftArmorItem(CORAL_ARMOR_MATERIAL, EquipmentSlot.FEET, DEFAULT_ITEM_SETTINGS);

		TURTLE_SHELL = new OceancraftArmorItem(OCEANCRAFT_TURTLE_ARMOR_MATERIAL, EquipmentSlot.CHEST, DEFAULT_ITEM_SETTINGS);
		BLACK_PEARL = new Item(DEFAULT_ITEM_SETTINGS);



		SEAWEED_BLOCK = registerItem(SEAWEED_BLOCK, "seaweed_block");

		CORAL_DUST = registerItem(CORAL_DUST,"coral_dust");
		CORAL_INGOT = registerItem(CORAL_INGOT, "coral_ingot");
		CORAL_SWORD = registerItem(CORAL_SWORD, "coral_sword");
		CORAL_SHOVEL = registerItem(CORAL_SHOVEL, "coral_shovel");
		CORAL_AXE = registerItem(CORAL_AXE, "coral_axe");
		CORAL_PICKAXE = registerItem(CORAL_PICKAXE, "coral_pickaxe");
		CORAL_HOE = registerItem(CORAL_HOE, "coral_hoe");

		CORAL_HELMET = registerItem(CORAL_HELMET, "coral_helmet");
		CORAL_CHESTPLATE = registerItem(CORAL_CHESTPLATE, "coral_chestplate");
		CORAL_LEGGINGS = registerItem(CORAL_LEGGINGS, "coral_leggings");
		CORAL_BOOTS = registerItem(CORAL_BOOTS, "coral_boots");

		TURTLE_SHELL = registerItem(TURTLE_SHELL, "turtle_shell");
		BLACK_PEARL = registerItem(BLACK_PEARL, "black_pearl");
	}

	private static <T extends Item> T registerItem(Item item, String id) {
        return (T) Registry.register(Registry.ITEM, new Identifier(Oceancraft.MOD_ID, id), item);
    }
}
