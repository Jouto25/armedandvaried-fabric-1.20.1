package net.jouto.armedandvaried.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jouto.armedandvaried.block.ModBlocks;
import net.jouto.armedandvaried.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> ROSE_GOLD_SMELTABLES = List.of(ModItems.COPPER_GOLD_MASS);


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, ROSE_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 0.7f, 200, "rose_gold");
        offerBlasting(exporter, ROSE_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 0.7f, 100, "rose_gold");


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ROSE_GOLD_BLOCK);



        /// Chainmail Armor

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET, 1)
                .pattern("III")
                .pattern("I I")
                .input('I', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Items.CHAINMAIL_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Items.CHAINMAIL_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Items.CHAINMAIL_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS, 1)
                .pattern("I I")
                .pattern("I I")
                .input('I', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(Items.CHAINMAIL_BOOTS)));

        /// Rose Gold Tools

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_AXE, 1)
                .pattern("RR")
                .pattern("RS")
                .pattern(" S")
                .input('R', ModItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_HOE, 1)
                .pattern("RR")
                .pattern(" S")
                .pattern(" S")
                .input('R', ModItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_SHOVEL, 1)
                .pattern("R")
                .pattern("S")
                .pattern("S")
                .input('R', ModItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_SWORD, 1)
                .pattern("R")
                .pattern("R")
                .pattern("S")
                .input('R', ModItems.ROSE_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_SWORD)));

        /// Shapeless Recipes

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_GOLD_MASS, 1)
                .input(Items.GOLD_INGOT)
                .input(Items.GOLD_INGOT)
                .input(Items.GOLD_INGOT)
                .input(Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_GOLD_MASS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEATHER_SCRAP, 4)
                .input(Items.LEATHER)
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LEATHER_SCRAP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET, 9)
                .input(ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_NUGGET)));
    }
}
