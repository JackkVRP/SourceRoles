package space.scripted.main;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Jack on 6/13/2017.
 */
public class Main extends JavaPlugin{

    private static Plugin plugin;

    public void onEnable() {
        plugin = this;

        PluginManager pm  = getServer().getPluginManager();

        final FileConfiguration config = this.getConfig();

        // Config
        config.options().copyDefaults(true);
        saveConfig();
    }

    public void onDisable() {
        plugin = null;
    }

    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
    public static Plugin getPlugin() {
        return plugin;
    }
}
