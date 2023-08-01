package net.societyreborn.companies.commands;

import net.kyori.adventure.text.Component;
import net.societyreborn.companies.Companies;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandHandler implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(command.getName().equalsIgnoreCase("companies")) {
            if (args.length==0) {
                sender.sendMessage(Component.text(ChatColor.translateAlternateColorCodes('&', "&cMissing arguments!")));
                return true;
            } else if (args[0].equals("reload") && sender.hasPermission("meow.admin")) {
                Companies.getSettings().reloadConfig();
                sender.sendMessage(Component.text(ChatColor.translateAlternateColorCodes('&', "&6Config reloaded!")));
                return true;
            }
        }
        return false;
    }
}
