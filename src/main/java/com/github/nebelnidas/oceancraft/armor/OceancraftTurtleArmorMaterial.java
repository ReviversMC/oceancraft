package com.github.nebelnidas.oceancraft.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class OceancraftTurtleArmorMaterial implements ArmorMaterial {

	@Override
	public int getDurability(EquipmentSlot slot) {
		return ArmorMaterials.TURTLE.getDurability(slot);
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return ArmorMaterials.TURTLE.getProtectionAmount(slot);
	}

	@Override
	public int getEnchantability() {
		return ArmorMaterials.TURTLE.getEnchantability();
	}

	@Override
	public SoundEvent getEquipSound() {
		return ArmorMaterials.TURTLE.getEquipSound();
	}

	@Override
	public Ingredient getRepairIngredient() {
		return ArmorMaterials.TURTLE.getRepairIngredient();
	}

	@Override
	public String getName() {
		return "oceancraft_turtle";
	}

	@Override
	public float getToughness() {
		return ArmorMaterials.TURTLE.getToughness();
	}

	@Override
	public float getKnockbackResistance() {
		return ArmorMaterials.TURTLE.getKnockbackResistance();
	}
	
}
