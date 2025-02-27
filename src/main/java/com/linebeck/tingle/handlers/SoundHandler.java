package com.linebeck.tingle.handlers;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SoundHandler {

    /*
     * net.minecraft.sounds.SoundCategory.a == MASTER
     * net.minecraft.sounds.SoundCategory.b == MUSIC
     * net.minecraft.sounds.SoundCategory.c == RECORDS
     * net.minecraft.sounds.SoundCategory.d == WEATHER
     * net.minecraft.sounds.SoundCategory.e == BLOCKS
     * net.minecraft.sounds.SoundCategory.f == HOSTILE
     * net.minecraft.sounds.SoundCategory.g == NEUTRAL
     * net.minecraft.sounds.SoundCategory.h == PLAYERS
     * net.minecraft.sounds.SoundCategory.i == AMBIENT
     * net.minecraft.sounds.SoundCategory.j == VOICE
     */

    public static void sendCustomSound(Player player, Location location, String customSound, net.kyori.adventure.sound.Sound.Source category, float volume, float pitch) {}

    public static void sendCustomSoundToNearbyPlayers(Location location, String customSound, net.kyori.adventure.sound.Sound.Source category, float volume, float pitch, double distance) {}

    public static void stopCustomSound(Player player, String customSound) {}

    public static void stopCustomSoundForNearbyPlayers(Location location, String customSound, double distance) {}
}