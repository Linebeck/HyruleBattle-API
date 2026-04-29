package com.linebeck.hylia.enums

import com.linebeck.hylia.abstracts.BaseOcarinaSong
import com.linebeck.hylia.objects.*

enum class OcarinaSongs(val song: BaseOcarinaSong) {

    BOLERO_OF_FIRE(BoleroOfFire),
    ELEGY_OF_EMPTINESS(ElegyOfEmptiness),
    EPONAS_SONG(EponasSong),
    GORON_LULLABY(GoronLullaby),
    INVERTED_SONG_OF_TIME(InvertedSongOfTime),
    MINUET_OF_FOREST(MinuetOfForest),
    NEW_WAVE_BOSSA_NOVA(NewWaveBossaNova),
    NOCTURNE_OF_SHADOW(NocturneOfShadow),
    OATH_TO_ORDER(OathToOrder),
    PRELUDE_OF_LIGHT(PreludeOfLight),
    REQUIEM_OF_SPIRIT(RequiemOfSpirit),
    SARIAS_SONG(SariasSong),
    SERENADE_OF_WATER(SerenadeOfWater),
    SONATA_OF_AWAKENING(SonataOfAwakening),
    SONG_OF_DOUBLE_TIME(SongOfDoubleTime),
    SONG_OF_HEALING(SongOfHealing),
    SONG_OF_SOARING(SongOfSoaring),
    SONG_OF_STORMS(SongOfStorms),
    SONG_OF_TIME(SongOfTime),
    SUNS_SONG(SunsSong),
    ZELDAS_LULLABY(ZeldaLullaby);

    companion object {

        fun possibleMatches(input: List<OcarinaNotes>): List<OcarinaSongs> {
            TODO("Function is implemented in Hylia.")
        }
    }
}