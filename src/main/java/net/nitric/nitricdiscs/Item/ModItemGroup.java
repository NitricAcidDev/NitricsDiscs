package net.nitric.nitricdiscs.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nitric.nitricdiscs.NitricDiscs;

public class ModItemGroup {
    // Define the registry key for the item group
    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(),
            Identifier.of(NitricDiscs.MOD_ID, "item_group")
    );

    // Define the custom item group
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.nitricdiscs.custom_group"))
            .icon(() -> new ItemStack(ModItems.MUSIC_DISC_NEVERGONNAGIVEYOUUP))
            .entries((displayContext, entries) -> {
                // Add your music disc to the group
                entries.add(ModItems.MUSIC_DISC_NEVERGONNAGIVEYOUUP);
                entries.add(ModItems.MUSIC_DISC_FUNKYTOWN);
                entries.add(ModItems.MUSIC_DISC_CRABRAVE);
                entries.add(ModItems.MUSIC_DISC_DONTSTOPMENOW);
                entries.add(ModItems.MUSIC_DISC_ANALOGSUNRISE);
                entries.add(ModItems.MUSIC_DISC_ANOTHERONEBITESTHEDUST);
                entries.add(ModItems.MUSIC_DISC_BEATIT);
                entries.add(ModItems.MUSIC_DISC_BONETHEME);
                entries.add(ModItems.MUSIC_DISC_LAVACHICKEN);
                entries.add(ModItems.MUSIC_DISC_KEYGEN);
            })
            .build();

    // Method to register the item group
    public static void initialize() {
        Registry.register(
                Registries.ITEM_GROUP,
                CUSTOM_ITEM_GROUP_KEY,
                CUSTOM_ITEM_GROUP
        );
    }
}