package com.linebeck.hylia.handlers

import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class FakeItem {

    companion object {

        @JvmStatic
        val MAIN_HAND = "mainhand"

        @JvmStatic
        val OFF_HAND = "offhand"

        @JvmStatic
        val FEET = "feet"

        @JvmStatic
        val LEGS = "legs"

        @JvmStatic
        val CHEST = "chest"

        @JvmStatic
        val HEAD = "head"

        @JvmStatic
        fun sendFakeItem(player: Player, equipmentSlotName: String, itemStack: ItemStack) {
            TODO("Function is implemented in Hylia.")
        }

        @JvmStatic
        fun sendFakeItemToNearbyPlayers(player: Player, equipmentSlotName: String, itemStack: ItemStack, distance: Double) {
            TODO("Function is implemented in Hylia.")
        }

        @JvmStatic
        fun sendFakeItemToEveryOtherNearbyPlayer(player: Player, equipmentSlotName: String, itemStack: ItemStack, distance: Double) {
            TODO("Function is implemented in Hylia.")
        }
    }
}