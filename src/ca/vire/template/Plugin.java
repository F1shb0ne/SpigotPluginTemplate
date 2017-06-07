package ca.vire.template;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Starting up!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Shutting down.");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("hello")) {
            if (sender.getName().contentEquals("CONSOLE")) {
                sender.sendMessage("Hello console!");
            } else {
                String name = sender.getName();
                sender.sendMessage("Hello " + name + "!");
            }
        }
        return true;
    }

}
