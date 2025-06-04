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

    }
}
