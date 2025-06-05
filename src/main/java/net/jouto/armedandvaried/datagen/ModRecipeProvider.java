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


        /// Rose Gold Armor

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_HELMET, 1)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_CHESTPLATE, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_LEGGINGS, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_BOOTS, 1)
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROSE_GOLD_BOOTS)));

        /// Copper Tools

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_AXE, 1)
                .pattern("CC")
                .pattern("CS")
                .pattern(" S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HOE, 1)
                .pattern("CC")
                .pattern(" S")
                .pattern(" S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_PICKAXE, 1)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SHOVEL, 1)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SWORD, 1)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SWORD)));


        /// Copper Armor

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HELMET, 1)
                .pattern("CCC")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE, 1)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS, 1)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS, 1)
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_BOOTS)));

        /// Amethyst Tools

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_AXE, 1)
                .pattern("AA")
                .pattern("AS")
                .pattern(" S")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_HOE, 1)
                .pattern("AA")
                .pattern(" S")
                .pattern(" S")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_PICKAXE, 1)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_SHOVEL, 1)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_SWORD, 1)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_SWORD)));


        /// Amethyst Armor

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_HELMET, 1)
                .pattern("AAA")
                .pattern("A A")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_CHESTPLATE, 1)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_LEGGINGS, 1)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_BOOTS, 1)
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_BOOTS)));

        /// Emerald Tools

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_AXE, 1)
                .pattern("EE")
                .pattern("ES")
                .pattern(" S")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_HOE, 1)
                .pattern("EE")
                .pattern(" S")
                .pattern(" S")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_PICKAXE, 1)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_SHOVEL, 1)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_SWORD, 1)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .input('E', Items.EMERALD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_SWORD)));


        /// Emerald Armor

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET, 1)
                .pattern("EEE")
                .pattern("E E")
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE, 1)
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS, 1)
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS, 1)
                .pattern("E E")
                .pattern("E E")
                .input('E', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_BOOTS)));


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
