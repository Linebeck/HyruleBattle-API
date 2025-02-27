package com.linebeck.hyrulebattle.abstracts

import com.destroystokyo.paper.profile.ProfileProperty

// Main class for Java/Kotlin developers to extend off of.
abstract class JvmCharacter(
    name: String,
    profileProperty: ProfileProperty,
    tauntSound: String,
    health: Float
) : BaseCharacter(
    name,
    profileProperty,
    tauntSound,
    health,
    true,
    false
)