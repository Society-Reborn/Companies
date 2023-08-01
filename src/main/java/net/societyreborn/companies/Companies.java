package net.societyreborn.companies;

import net.societyreborn.companies.listeners.SignEditModification;
import net.societyreborn.companies.utils.DataHandler;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Companies extends JavaPlugin {
    private static DataHandler settings;

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new SignEditModification(), this);
        settings = new DataHandler(this, "settings");
    }

    @Override
    public void onDisable() {

    }

    public static DataHandler getSettings() {
        return settings;
    }
}
