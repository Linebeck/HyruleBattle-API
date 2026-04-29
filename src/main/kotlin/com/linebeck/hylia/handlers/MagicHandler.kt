package com.linebeck.hylia.handlers

import com.linebeck.hylia.objects.Magic
import org.bukkit.entity.Player
import org.bukkit.scheduler.BukkitTask
import java.util.*

// Go through to update magic for the HUD to react.
object MagicHandler {

    private const val INFINITE_MAGIC_SEC = 900L

    private val infiniteMagicTasks = mutableMapOf<UUID, BukkitTask>()

    @JvmStatic
    fun toggleMagic(player: Player, magic: Magic, enabled: Boolean) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun addMagic(player: Player, magic: Magic, amount: Int) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun subtractMagic(player: Player, magic: Magic, amount: Int) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun setMagic(player: Player, magic: Magic, amount: Int) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun setInfiniteMagic(player: Player, magic: Magic, enabled: Boolean) {
        TODO("Function is implemented in Hylia.")
    }

    @JvmStatic
    fun clear(player: Player) {
        TODO("Function is implemented in Hylia.")
    }
}