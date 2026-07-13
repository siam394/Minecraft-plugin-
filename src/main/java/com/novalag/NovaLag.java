package com.novalag;

import com.novalag.manager.ConfigManager;
import com.novalag.manager.MessageManager;
import com.novalag.manager.TaskManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NovaLag extends JavaPlugin {

    private static NovaLag instance;

    private ConfigManager configManager;
    private MessageManager messageManager;
    private TaskManager taskManager;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        configManager = new ConfigManager(this);
        messageManager = new MessageManager(this);
        taskManager = new TaskManager(this);

        taskManager.startTasks();

        getLogger().info("================================");
        getLogger().info("NovaLag Enabled Successfully!");
        getLogger().info("Java: 25");
        getLogger().info("Purpur: 26.2");
        getLogger().info("================================");
    }

    @Override
    public void onDisable() {
        if (taskManager != null) {
            taskManager.stopTasks();
        }

        getLogger().info("NovaLag Disabled.");
    }

    public static NovaLag getInstance() {
        return instance;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

    public MessageManager getMessageManager() {
        return messageManager;
    }

    public TaskManager getTaskManager() {
        return taskManager;
    }
}
