package net.jouto.armedandvaried.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent ROSE_GOLD_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 250, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3000, 0), 1f).alwaysEdible().build();
    public static final FoodComponent ROSE_GOLD_CARROT = new FoodComponent.Builder().hunger(8).saturationModifier(1.2f).build();
}
