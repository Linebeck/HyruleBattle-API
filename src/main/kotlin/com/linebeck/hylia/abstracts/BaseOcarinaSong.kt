package com.linebeck.hylia.abstracts

import com.linebeck.hylia.enums.HyruleSound
import com.linebeck.hylia.enums.OcarinaNotes
import com.linebeck.hylia.handlers.SoundHandler
import org.bukkit.entity.Player

abstract class BaseOcarinaSong(
    name: String,
    val notes: List<OcarinaNotes>,
    val hyruleSound: HyruleSound
) : BaseSong(name) {

    // Note Reference
    // (A) 0D, (Down) 0F, (Left) 1B, (Right) 1A, (Up) 1D

    open fun perform(player: Player) {
        play(player)
        trigger(player)
    }

    private fun play(player: Player) {
        SoundHandler.playSound(
            player,
            hyruleSound,
            net.kyori.adventure.sound.Sound.Source.RECORD,
            1.0f,
            1.0f
        )
    }
}