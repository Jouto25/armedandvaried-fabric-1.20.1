package net.jouto.armedandvaried.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    ROSE_GOLD_INGOT(250, 8.0f, 3f, 3, 14, () -> Ingredient.ofItems(ModItems.ROSE_GOLD_INGOT)),

    COPPER_INGOT(191, 5.0f, 1f, 2, 12, () -> Ingredient.ofItems(Items.COPPER_INGOT)),

    AMETHYST_SHARD(578, 6.0f, 2f, 3, 12, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),

    EMERALD(906, 7.0f, 2f, 3, 12, () -> Ingredient.ofItems(Items.EMERALD));

    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int itemDurability, float miningSpeed, float attackDamage, int miningLevel, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
