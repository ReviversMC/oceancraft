package com.github.nebelnidas.oceancraft.armor;

import com.github.nebelnidas.oceancraft.init.OceancraftItems;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class CoralArmorMaterial implements ArmorMaterial {

	@Override
	public int getDurability(EquipmentSlot slot) {
		return ArmorMaterials.GOLD.getDurability(slot);
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return ArmorMaterials.GOLD.getProtectionAmount(slot);
	}

	@Override
	public int getEnchantability() {
		return ArmorMaterials.IRON.getEnchantability();
	}

	@Override
	public SoundEvent getEquipSound() {
		return ArmorMaterials.GOLD.getEquipSound();
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(OceancraftItems.CORAL_INGOT);
	}

	@Override
	public String getName() {
		return "coral";
	}

	@Override
	public float getToughness() {
		return ArmorMaterials.GOLD.getToughness();
	}

	@Override
	public float getKnockbackResistance() {
		return ArmorMaterials.GOLD.getKnockbackResistance();
	}
	
}
