package com.linebeck.hylia.handlers

import org.bukkit.Location
import org.bukkit.Particle
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class FakeParticles {

    companion object {

        @JvmStatic
        fun sendFakeParticles(player: Player, location: Location, particle: Particle, count: Int) {}

        @JvmStatic
        fun sendFakeParticlesToNearbyPlayers(location: Location, particle: Particle, count: Int, distance: Double) {}

        @JvmStatic
        fun sendScatterEffect(location: Location, distance: Double, itemStack: ItemStack) {}
    }
}