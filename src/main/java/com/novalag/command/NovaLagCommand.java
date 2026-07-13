package com.novalag.command;

import com.novalag.NovaLag;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class NovaLagCommand implements CommandExecutor {

    private final NovaLag plugin;

    public NovaLagCommand(NovaLag plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!sender.hasPermission("novalag.admin")) {
            sender.sendMessage("§cYou do not have permission.");
            return true;
        }

        if (args.length == 0) {
            sender.sendMessage("§bNovaLag §7v1.0.0");
            sender.sendMessage("§7/novalag reload");
            sender.sendMessage("§7/novalag stats");
            sender.sendMessage("§7/novalag cleanup");
            sender.sendMessage("§7/novalag monitor");
            return true;
        }

        switch (args[0].toLowerCase()) {

            case "reload":
                plugin.reloadConfig();
                sender.sendMessage("§aNovaLag configuration reloaded.");
                break;

            case "stats":
                sender.sendMessage("§eStatistics system coming soon.");
                break;

            case "cleanup":
                sender.sendMessage("§eCleanup system coming soon.");
                break;

            case "monitor":
                sender.sendMessage("§ePerformance monitor coming soon.");
                break;

            default:
                sender.sendMessage("§cUnknown subcommand.");
                break;
        }

        return true;
    }
}
