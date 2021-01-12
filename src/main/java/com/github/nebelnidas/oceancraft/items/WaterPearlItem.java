package com.github.nebelnidas.oceancraft.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;


public class WaterPearlItem extends WaterPearlItemBase {

	public WaterPearlItem(Settings settings) {
		super(settings.food(new FoodComponent.Builder().hunger(1).saturationModifier(1F).meat().alwaysEdible()
		.statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 20*60*4), 1)
		.statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 20*60*2), 1)
		.build()));
	}
}
