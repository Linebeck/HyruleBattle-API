package com.linebeck.hylia.abstracts

import com.linebeck.hylia.enums.HyruleSound
import com.linebeck.hylia.enums.OcarinaNotes
import org.bukkit.entity.Player

abstract class BaseOcarinaSong(
    val name: String,
    val notes: List<OcarinaNotes>,
    val hyruleSound: HyruleSound
) {

    // Note Reference
    // (A) 0D, (Down) 0F, (Left) 1B, (Right) 1A, (Up) 1D

    fun play(player: Player) {
        TODO("Function is implemented in Hylia.")
    }

    open fun trigger(player: Player) {
        TODO("Function is implemented in Hylia.")
    }
}