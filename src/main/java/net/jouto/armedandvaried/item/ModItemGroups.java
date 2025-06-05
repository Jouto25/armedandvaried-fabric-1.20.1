package net.jouto.armedandvaried.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jouto.armedandvaried.ArmedandVaried;
import net.jouto.armedandvaried.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ARMED_AND_VARIED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArmedandVaried.MOD_ID, "copper_gold_mass"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.armedandvaried"))
                    .icon(() -> new ItemStack(ModItems.COPPER_GOLD_MASS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LEATHER_SCRAP);
                        entries.add(ModItems.COPPER_GOLD_MASS);

                        entries.add(ModItems.ROSE_GOLD_INGOT);
                        entries.add(ModItems.ROSE_GOLD_NUGGET);

                        entries.add(ModItems.ROSE_GOLD_APPLE);
                        entries.add(ModItems.ROSE_GOLD_CARROT);

                        entries.add(ModBlocks.ROSE_GOLD_BLOCK);

                        entries.add(ModItems.ROSE_GOLD_AXE);
                        entries.add(ModItems.ROSE_GOLD_HOE);
                        entries.add(ModItems.ROSE_GOLD_PICKAXE);
                        entries.add(ModItems.ROSE_GOLD_SHOVEL);
                        entries.add(ModItems.ROSE_GOLD_SWORD);

                        entries.add(ModItems.ROSE_GOLD_HELMET);
                        entries.add(ModItems.ROSE_GOLD_CHESTPLATE);
                        entries.add(ModItems.ROSE_GOLD_LEGGINGS);
                        entries.add(ModItems.ROSE_GOLD_BOOTS);

                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_SWORD);

                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);

                        entries.add(ModItems.AMETHYST_AXE);
                        entries.add(ModItems.AMETHYST_HOE);
                        entries.add(ModItems.AMETHYST_PICKAXE);
                        entries.add(ModItems.AMETHYST_SHOVEL);
                        entries.add(ModItems.AMETHYST_SWORD);

                        entries.add(ModItems.AMETHYST_HELMET);
                        entries.add(ModItems.AMETHYST_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_LEGGINGS);
                        entries.add(ModItems.AMETHYST_BOOTS);

                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_SWORD);

                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_BOOTS);

                    }).build());

    public static void registerItemGroups(){

    }
}
