package net.nitric.nitricdiscs.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.nitric.nitricdiscs.NitricDiscs;
import net.nitric.nitricdiscs.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Function;

public class ModItems {
    /**
     * Registers an item with the given name and settings.
     *
     * @param name        The name of the item (used in the identifier).
     * @param itemFactory A function to create the item from Item.Settings.
     * @param settings    The settings for the item.
     * @return The registered item.
     */
    private static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key
        Identifier id = Identifier.of(NitricDiscs.MOD_ID, name);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);

        // Create and register the item
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    // Define your music disc
    // Define your music disc
    public static final Item MUSIC_DISC_NEVERGONNAGIVEYOUUP = register(
            "music_disc_nevergonnagiveyouup",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.NEVER_GONNA_GIVE_YOU_UP_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );

    public static final Item MUSIC_DISC_FUNKYTOWN = register(
            "music_disc_funkytown",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.FUNKY_TOWN_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );

    public static final Item MUSIC_DISC_CRABRAVE = register(
            "music_disc_crabrave",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.CRAB_RAVE_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );
    public static final Item MUSIC_DISC_BONETHEME = register(
            "music_disc_bonetheme",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.BONE_THEME_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );

    public static final Item MUSIC_DISC_ANALOGSUNRISE = register(
            "music_disc_analogsunrise",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.ANALOG_SUNRISE_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );

    public static final Item MUSIC_DISC_ANOTHERONEBITESTHEDUST = register(
            "music_disc_anotheronebitesthedust",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.ANOTHER_ONE_BITES_THE_DUST_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );
    public static final Item MUSIC_DISC_DONTSTOPMENOW = register(
            "music_disc_dontstopmenow",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.DONT_STOP_ME_NOW_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );

    public static final Item MUSIC_DISC_KEYGEN = register(
            "music_disc_keygen",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.KEY_GEN_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );

    public static final Item MUSIC_DISC_BEATIT = register(
            "music_disc_beatit",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.BEAT_IT_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );
    public static final Item MUSIC_DISC_LAVACHICKEN = register(
            "music_disc_lavachicken",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.LAVA_CHICKEN_KEY)) {
            },
            new Item.Settings().maxCount(1).rarity(Rarity.UNCOMMON)
    );





    /**
     * Initializes the items and adds them to item groups.
     */
    public static void initialize() {
        // Currently empty; items are registered statically
        // You can add additional initialization logic here if needed
    }
}