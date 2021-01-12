package com.github.nebelnidas.oceancraft.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemStack;


public class EnchantedWaterPearlItem extends WaterPearlItemBase {

	public EnchantedWaterPearlItem(Settings settings) {
		super(settings.food(new FoodComponent.Builder().hunger(1).saturationModifier(1F).meat().alwaysEdible()
		.statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 20*60*8), 1)
		.statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 20*60*6), 1)
		.statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*60*8), 1)
		.build()));
	}

	public boolean hasGlint(ItemStack stack) {
		return true;
	}
}
