package net.jouto.armedandvaried.trim;

import net.jouto.armedandvaried.ArmedandVaried;
import net.jouto.armedandvaried.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> ROSE_GOLD_INGOT = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(ArmedandVaried.MOD_ID, "rose_gold_ingot"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, ROSE_GOLD_INGOT, Registries.ITEM.getEntry(ModItems.ROSE_GOLD_INGOT),
                Style.EMPTY.withColor(TextColor.parse("#ffded6")), 1.0f);
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
