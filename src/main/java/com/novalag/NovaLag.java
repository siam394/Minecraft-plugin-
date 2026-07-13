package com.novalag;

import org.bukkit.plugin.java.JavaPlugin;

public final class NovaLag extends JavaPlugin {

    private static NovaLag instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getLogger().info("================================");
        getLogger().info("NovaLag Enabled");
        getLogger().info("Running on Purpur 26.2");
        getLogger().info("Java 25");
        getLogger().info("================================");
    }

    @Override
    public void onDisable() {
        getLogger().info("NovaLag Disabled");
    }

    public static NovaLag getInstance() {
        return instance;
    }
}
