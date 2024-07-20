package com.linebeck.hyrulebattle.managers

import com.linebeck.hyrulebattle.abstracts.BaseCharacter
import com.linebeck.hyrulebattle.objects.BattlePlayer
import java.util.*

class BattleGameManager {

    companion object {

        @JvmStatic
        fun getBattlePlayerByUUID(uuid: UUID): BattlePlayer? {
            TODO("Function is implemented in HyruleBattle.")
        }

        @JvmStatic
        fun getBattlePlayersByCharacter(character: BaseCharacter): List<BattlePlayer> {
            TODO("Function is implemented in HyruleBattle.")
        }

        @JvmStatic
        fun getAllBattlePlayers(uuid: UUID): List<BattlePlayer>? {
            TODO("Function is implemented in HyruleBattle.")
        }

        @JvmStatic
        fun isInTeamGame(uuid: UUID): Boolean {
            TODO("Function is implemented in HyruleBattle.")
        }

        @JvmStatic
        fun getTeamBattlePlayers(uuid: UUID): List<BattlePlayer>? {
            TODO("Function is implemented in HyruleBattle.")
        }

        @JvmStatic
        fun getTeamUUIDs(uuid: UUID): List<UUID>?  {
            TODO("Function is implemented in HyruleBattle.")
        }
    }
}