package com.linebeck.hylia.abstracts

import org.bukkit.entity.Player

abstract class BaseSong (
    val name: String
) {
    open fun trigger(player: Player) {}
}