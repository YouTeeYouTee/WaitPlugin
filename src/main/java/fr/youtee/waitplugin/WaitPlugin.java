package fr.youtee.waitplugin;

import fr.youtee.waitplugin.Commands.WaitCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class WaitPlugin extends JavaPlugin {

    public static WaitPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        this.getLogger().info("Enabled!");
        getCommand("wait").setExecutor(new WaitCommand());
        // Plugin startup logic
    }

}
