package com.linebeck.hylia.handlers

import com.linebeck.hylia.enums.HyruleSound
import org.bukkit.Location
import org.bukkit.entity.Player
import net.kyori.adventure.sound.Sound as KyoriSound

object SoundHandler {

    /* NMS Sound Categories
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

    @JvmStatic
    fun playSound(player: Player, sound: String, kyoriSource: KyoriSound.Source, volume: Float, pitch: Float) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun playSound(player: Player, hyruleSound: HyruleSound, kyoriSource: KyoriSound.Source, volume: Float, pitch: Float) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun playSound(player: Player, location: Location, sound: String, kyoriSource: KyoriSound.Source, volume: Float, pitch: Float) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun playSound(player: Player, location: Location, hyruleSound: HyruleSound, kyoriSource: KyoriSound.Source, volume: Float, pitch: Float) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun playSoundNearby(location: Location, sound: String, kyoriSource: KyoriSound.Source, volume: Float, pitch: Float, distance: Double) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun playSoundNearby(location: Location, hyruleSound: HyruleSound, kyoriSource: KyoriSound.Source, volume: Float, pitch: Float, distance: Double) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun stopSound(player: Player, sound: String) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun stopSound(player: Player, hyruleSound: HyruleSound) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun stopSoundNearby(location: Location, sound: String, distance: Double) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun stopSoundNearby(location: Location, hyruleSound: HyruleSound, distance: Double) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun selectSound(player: Player) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun leaveSound(player: Player) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun closeSound(player: Player) {
        TODO("Function is implemented in Hylia.")
    }
}