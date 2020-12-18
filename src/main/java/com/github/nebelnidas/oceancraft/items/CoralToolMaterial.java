package com.github.nebelnidas.oceancraft.items;

import com.github.nebelnidas.oceancraft.init.OceancraftItems;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

public class CoralToolMaterial implements ToolMaterial {

	// Identical to stone

	@Override
	public int getDurability() {
		return ToolMaterials.STONE.getDurability();
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return ToolMaterials.STONE.getMiningSpeedMultiplier();
	}

	@Override
	public float getAttackDamage() {
		return ToolMaterials.STONE.getAttackDamage();
	}

	@Override
	public int getMiningLevel() {
		return ToolMaterials.STONE.getMiningLevel();
	}

	@Override
	public int getEnchantability() {
		return ToolMaterials.STONE.getEnchantability();
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(OceancraftItems.CORAL_INGOT);
	}
	
}
