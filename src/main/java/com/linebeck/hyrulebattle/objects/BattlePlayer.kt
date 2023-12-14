package com.linebeck.hyrulebattle.objects

import com.linebeck.hyrulebattle.enums.CharacterEffect
import java.util.UUID

class BattlePlayer(
    uuid: UUID,
    val characterName: String,
    val kills: Int = 0,
    val deaths: Int = 0,
    val characterEffects: MutableMap<CharacterEffect, Long> = mutableMapOf()
)