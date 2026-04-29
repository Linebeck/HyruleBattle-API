package com.linebeck.hyrulebattle.objects

import com.linebeck.tingle.objects.SessionPlayer
import java.util.*

class BattlePlayer(
    uuid: UUID,
    var characterName: String = "None",
    var points: Int = 0,
    var kills: Int = 0,
    var deaths: Int = 0,
    var streak: Int = 0,
    val data: Any? = null // Anything character specific related.
) : SessionPlayer(uuid) {

    inline fun <reified T> getTypedData(): T? {
        return data as? T
    }
}