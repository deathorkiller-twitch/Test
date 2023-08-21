package me.deathorkiller.grundlagen;

import me.deathorkiller.grundlagen.commans.Dc;
import me.deathorkiller.grundlagen.commans.DoCommand;
import me.deathorkiller.grundlagen.commans.TestCommand;
import me.deathorkiller.grundlagen.commans.Dc;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new TestCommand());
        getCommand("do").setExecutor(new DoCommand());
        getCommand("dc").setExecutor(new Dc());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
