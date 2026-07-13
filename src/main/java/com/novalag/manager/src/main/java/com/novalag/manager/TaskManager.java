package com.novalag.manager;

import com.novalag.NovaLag;

public class TaskManager {

    private final NovaLag plugin;

    public TaskManager(NovaLag plugin) {
        this.plugin = plugin;
    }

    public void startTasks() {
        // Future ClearLag tasks will start here.
    }

    public void stopTasks() {
        // Future ClearLag tasks will stop here.
    }

    public NovaLag getPlugin() {
        return plugin;
    }
}
