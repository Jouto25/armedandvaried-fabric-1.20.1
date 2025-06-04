package net.jouto.armedandvaried.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jouto.armedandvaried.ArmedandVaried;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    ///  Misc

    public static  final Item LEATHER_SCRAP = registerItem("leather_scrap", new Item(new FabricItemSettings()));
    public static  final Item COPPER_GOLD_MASS = registerItem("copper_gold_mass", new Item(new FabricItemSettings()));

    /// Rose Gold Items

    public static  final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new FabricItemSettings()));
    public static  final Item ROSE_GOLD_NUGGET = registerItem("rose_gold_nugget", new Item(new FabricItemSettings()));
    public static  final Item ROSE_GOLD_APPLE = registerItem("rose_gold_apple", new Item(new FabricItemSettings().food(ModFoodComponents.ROSE_GOLD_APPLE)));
    public static  final Item ROSE_GOLD_CARROT = registerItem("rose_gold_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.ROSE_GOLD_CARROT)));

    ///  Rose Gold Tools

    public static  final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe", new AxeItem(ModToolMaterial.ROSE_GOLD_INGOT, 5, -3f, new FabricItemSettings()));
    public static  final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe", new HoeItem(ModToolMaterial.ROSE_GOLD_INGOT, -3, 0f, new FabricItemSettings()));
    public static  final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe", new PickaxeItem(ModToolMaterial.ROSE_GOLD_INGOT, 1, -2.8f, new FabricItemSettings()));
    public static  final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel", new ShovelItem(ModToolMaterial.ROSE_GOLD_INGOT, 1.5F, -3f, new FabricItemSettings()));
    public static  final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword", new SwordItem(ModToolMaterial.ROSE_GOLD_INGOT, 3, -2.4f, new FabricItemSettings()));

    public static  final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet", new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.HELMET,  new FabricItemSettings()));
    public static  final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate", new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.CHESTPLATE,  new FabricItemSettings()));
    public static  final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings", new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.LEGGINGS,  new FabricItemSettings()));
    public static  final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots", new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.BOOTS,  new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ArmedandVaried.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ArmedandVaried.LOGGER.info("Registrering Mod Items for " + ArmedandVaried.MOD_ID);



    }
}
