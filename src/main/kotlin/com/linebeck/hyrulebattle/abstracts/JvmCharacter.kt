package com.linebeck.hyrulebattle.abstracts

import com.destroystokyo.paper.profile.ProfileProperty
import com.linebeck.hylia.enums.HyruleSound

// Main class for Java/Kotlin developers to extend off of.
abstract class JvmCharacter(
    name: String,
    profileProperty: ProfileProperty,
    tauntSound: HyruleSound,
    health: Float
) : BaseCharacter(
    name,
    profileProperty,
    tauntSound,
    health,
    true,
    false
)