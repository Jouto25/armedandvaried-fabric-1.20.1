package net.jouto.armedandvaried.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jouto.armedandvaried.ArmedandVaried;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    ///  Misc

    public static final Item LEATHER_SCRAP = registerItem("leather_scrap", new Item(new FabricItemSettings()));
    public static final Item COPPER_GOLD_MASS = registerItem("copper_gold_mass", new Item(new FabricItemSettings()));

    /// Rose Gold Items

    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLD_NUGGET = registerItem("rose_gold_nugget", new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLD_APPLE = registerItem("rose_gold_apple", new Item(new FabricItemSettings().food(ModFoodComponents.ROSE_GOLD_APPLE)));
    public static final Item ROSE_GOLD_CARROT = registerItem("rose_gold_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.ROSE_GOLD_CARROT)));

    ///  Rose Gold Tools

    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe", new AxeItem(ModToolMaterial.ROSE_GOLD_INGOT, 5, -3f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe", new HoeItem(ModToolMaterial.ROSE_GOLD_INGOT, -3, 0f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe", new PickaxeItem(ModToolMaterial.ROSE_GOLD_INGOT, 1, -2.8f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel", new ShovelItem(ModToolMaterial.ROSE_GOLD_INGOT, 1.5F, -3f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword", new SwordItem(ModToolMaterial.ROSE_GOLD_INGOT, 3, -2.4f, new FabricItemSettings()));

    ///  Rose Gold Armor

    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet", new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.HELMET,  new FabricItemSettings()));
    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate", new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.CHESTPLATE,  new FabricItemSettings()));
    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings", new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.LEGGINGS,  new FabricItemSettings()));
    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots", new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.BOOTS,  new FabricItemSettings()));

    ///  Copper Tools

    public static final Item COPPER_AXE = registerItem("copper_axe", new AxeItem(ModToolMaterial.COPPER_INGOT, 7, -3.1f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new HoeItem(ModToolMaterial.COPPER_INGOT, -1, -1.5f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(ModToolMaterial.COPPER_INGOT, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolMaterial.COPPER_INGOT, 2F, -3f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolMaterial.COPPER_INGOT, 3, -2.4f, new FabricItemSettings()));

    /// Copper Armor

    public static final Item COPPER_HELMET = registerItem("copper_helmet", new ArmorItem(ModArmorMaterials.COPPER_INGOT, ArmorItem.Type.HELMET,  new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate", new ArmorItem(ModArmorMaterials.COPPER_INGOT, ArmorItem.Type.CHESTPLATE,  new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings", new ArmorItem(ModArmorMaterials.COPPER_INGOT, ArmorItem.Type.LEGGINGS,  new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots", new ArmorItem(ModArmorMaterials.COPPER_INGOT, ArmorItem.Type.BOOTS,  new FabricItemSettings()));

    ///  Amethyst Tools

    public static final Item AMETHYST_AXE = registerItem("amethyst_axe", new AxeItem(ModToolMaterial.AMETHYST_SHARD, 6, -3f, new FabricItemSettings()));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe", new HoeItem(ModToolMaterial.AMETHYST_SHARD, -2, -0.5f, new FabricItemSettings()));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", new PickaxeItem(ModToolMaterial.AMETHYST_SHARD, 1, -2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel", new ShovelItem(ModToolMaterial.AMETHYST_SHARD, 2F, -3f, new FabricItemSettings()));
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword", new SwordItem(ModToolMaterial.AMETHYST_SHARD, 3, -2.4f, new FabricItemSettings()));

    /// Amethyst Armor

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet", new ArmorItem(ModArmorMaterials.AMETHYST_SHARD, ArmorItem.Type.HELMET,  new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate", new ArmorItem(ModArmorMaterials.AMETHYST_SHARD, ArmorItem.Type.CHESTPLATE,  new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings", new ArmorItem(ModArmorMaterials.AMETHYST_SHARD, ArmorItem.Type.LEGGINGS,  new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots", new ArmorItem(ModArmorMaterials.AMETHYST_SHARD, ArmorItem.Type.BOOTS,  new FabricItemSettings()));

    ///  Emerald Tools

    public static final Item EMERALD_AXE = registerItem("emerald_axe", new AxeItem(ModToolMaterial.EMERALD, 6, -3f, new FabricItemSettings()));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", new HoeItem(ModToolMaterial.EMERALD, -2, -0.5f, new FabricItemSettings()));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(ModToolMaterial.EMERALD, 1, -2.8f, new FabricItemSettings()));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(ModToolMaterial.EMERALD, 2F, -3f, new FabricItemSettings()));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ModToolMaterial.EMERALD, 3, -2.4f, new FabricItemSettings()));

    /// Emerald Armor

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,  new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE,  new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,  new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,  new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ArmedandVaried.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ArmedandVaried.LOGGER.info("Registrering Mod Items for " + ArmedandVaried.MOD_ID);



    }
}
