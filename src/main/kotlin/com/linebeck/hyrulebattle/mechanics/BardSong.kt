package com.linebeck.hyrulebattle.mechanics

import com.linebeck.hylia.abstracts.BaseSong
import com.linebeck.hyrulebattle.enums.BardInput
import com.linebeck.hyrulebattle.enums.BardPerformanceQuality
import org.bukkit.Instrument
import org.bukkit.Note
import org.bukkit.entity.Player

class BardSong(
    name: String,
    val instrument: Instrument,
    val notes: List<BardNote>,
    private val effects: (Player, BardPerformanceQuality) -> Unit
) : BaseSong(name) {

    fun perform(player: Player, quality: BardPerformanceQuality) {
        TODO("Function is implemented in HyruleBattle.")
    }

    fun playNote(player: Player, note: BardNote) {
        TODO("Function is implemented in HyruleBattle.")
    }

    override fun trigger(player: Player) {
        TODO("Function is implemented in HyruleBattle.")
    }
}

data class BardNote(
    val input: BardInput,
    val key: Note,
    val tickOffset: Long
)

data class BardPerformanceState(
    val song: BardSong,
    val startTick: Long,
    var lastNoteTick: Long,
    var currentNoteIndex: Int = 0,
    var score: Int = 0,
    var missed: Int = 0
)