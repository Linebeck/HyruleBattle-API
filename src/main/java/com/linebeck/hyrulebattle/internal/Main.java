package com.linebeck.hyrulebattle.internal;

import org.bukkit.plugin.java.JavaPlugin;

// Main class is in Java for both Kotlin & Java to find it easy.
public class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance() {
        return instance;
    }
}