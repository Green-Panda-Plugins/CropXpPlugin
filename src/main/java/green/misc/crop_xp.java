package green.misc;

import green.misc.Events.CropXpEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class crop_xp extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[CropXpPlugin] is enabled");
        getServer().getPluginManager().registerEvents(new CropXpEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[CropXpPlugin] is disabled");
    }
}
