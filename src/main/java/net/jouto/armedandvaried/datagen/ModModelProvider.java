package net.jouto.armedandvaried.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jouto.armedandvaried.block.ModBlocks;
import net.jouto.armedandvaried.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_GOLD_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LEATHER_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_GOLD_MASS, Models.GENERATED);

        itemModelGenerator.register(ModItems.ROSE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_CARROT, Models.GENERATED);

        itemModelGenerator.register(ModItems.ROSE_GOLD_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_SWORD, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSE_GOLD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSE_GOLD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSE_GOLD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSE_GOLD_BOOTS));

        itemModelGenerator.register(ModItems.COPPER_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_BOOTS));

        itemModelGenerator.register(ModItems.AMETHYST_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_SWORD, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_BOOTS));

        itemModelGenerator.register(ModItems.EMERALD_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_BOOTS));

        itemModelGenerator.register(ModItems.ROSE_GOLD_HORSE_ARMOR, Models.GENERATED);



    }
}
