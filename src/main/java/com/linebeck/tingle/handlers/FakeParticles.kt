package com.linebeck.tingle.handlers

import org.bukkit.Location
import org.bukkit.Particle
import org.bukkit.entity.Player

class FakeParticles {

    companion object {

        @JvmStatic
        fun sendFakeParticles(player: Player, location: Location, particle: Particle, count: Int) {}

        @JvmStatic
        fun sendFakeParticlesToNearbyPlayers(location: Location, particle: Particle, count: Int, distance: Double) {}
    }
}