package net.nitric.nitricdiscs.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.client.sound.Sound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.nitric.nitricdiscs.NitricDiscs;

public class ModSounds {
    public static final SoundEvent NEVER_GONNA_GIVE_YOU_UP = registerSoundEvent("never_gonna_give_you_up");
    public static final RegistryKey<JukeboxSong> NEVER_GONNA_GIVE_YOU_UP_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "never_gonna_give_you_up"));
    public static final SoundEvent FUNKY_TOWN = registerSoundEvent("funky_town");
    public static final RegistryKey<JukeboxSong> FUNKY_TOWN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "funky_town"));
    public static final SoundEvent CRAB_RAVE = registerSoundEvent("crab_rave");
    public static final RegistryKey<JukeboxSong> CRAB_RAVE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "crab_rave"));
    public static final SoundEvent BONE_THEME = registerSoundEvent("bone_theme");
    public static final RegistryKey<JukeboxSong> BONE_THEME_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "bone_theme"));
    public static final SoundEvent ANALOG_SUNRISE = registerSoundEvent("analog_sunrise");
    public static final RegistryKey<JukeboxSong> ANALOG_SUNRISE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "analog_sunrise"));
    public static final SoundEvent BEAT_IT = registerSoundEvent("beat_it");
    public static final RegistryKey<JukeboxSong> BEAT_IT_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "beat_it"));
    public static final SoundEvent ANOTHER_ONE_BITES_THE_DUST = registerSoundEvent("another_one_bites_the_dust");
    public static final RegistryKey<JukeboxSong> ANOTHER_ONE_BITES_THE_DUST_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "another_one_bites_the_dust"));
    public static final SoundEvent DONT_STOP_ME_NOW = registerSoundEvent("dont_stop_me_now");
    public static final RegistryKey<JukeboxSong> DONT_STOP_ME_NOW_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "dont_stop_me_now"));
    public static final SoundEvent KEY_GEN = registerSoundEvent("key_gen");
    public static final RegistryKey<JukeboxSong> KEY_GEN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "key_gen"));
    public static final SoundEvent LAVA_CHICKEN = registerSoundEvent("lava_chicken");
    public static final RegistryKey<JukeboxSong> LAVA_CHICKEN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(NitricDiscs.MOD_ID, "lava_chicken"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(NitricDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }





}

