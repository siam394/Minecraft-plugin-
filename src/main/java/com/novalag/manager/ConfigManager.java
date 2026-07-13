package com.novalag.manager;

import com.novalag.NovaLag;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {

    private final NovaLag plugin;

    public ConfigManager(NovaLag plugin) {
        this.plugin = plugin;
    }

    public FileConfiguration getConfig() {
        return plugin.getConfig();
    }

    public boolean isEnabled() {
        return getConfig().getBoolean("enabled", true);
    }

    public int getCleanupInterval() {
        return getConfig().getInt("cleanup.interval", 10);
    }

    public boolean isBroadcastEnabled() {
        return getConfig().getBoolean("broadcast", true);
    }

    public void reload() {
        plugin.reloadConfig();
    }
}
