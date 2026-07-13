package com.novalag.manager;

import com.novalag.NovaLag;
import org.bukkit.ChatColor;

public class MessageManager {

    private final NovaLag plugin;

    public MessageManager(NovaLag plugin) {
        this.plugin = plugin;
    }

    public String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public String get(String path) {
        return color(plugin.getConfig().getString(path, ""));
    }

    public void reload() {
        plugin.reloadConfig();
    }
}
