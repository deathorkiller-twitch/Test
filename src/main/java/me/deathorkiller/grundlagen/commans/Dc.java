package me.deathorkiller.grundlagen.commans;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Dc implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "Du musst ein Spieler sein!");
            return false;
        }else {
            Player player = (Player) sender;
            player.kickPlayer("Mhm Discord oder?");
        }

        return false;
    }
}
