package me.deathorkiller.grundlagen.commans;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

import java.util.Locale;

public class DoCommand implements CommandExecutor {

    //
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "Du musst ein Spieler sein!");
            return false;
        }
        if(!(sender.hasPermission("op"))){
            sender.sendMessage(ChatColor.RED + "Du musst Opa`s Rechte haben!");
            sender.sendMessage(sender.getName() + " ich weiß wo du wohnst!");
            sender.sendMessage( "Etwas kommt dich in " + ((Player) sender).getPing() + " ms besuchen");

            sender.sendMessage(((String) ("Server Restart in " + ((Player) sender).getPing() + " Seconds...")));
            for(int ping = ((Player) sender).getPing(); ping > 0; --ping) {
                sender.sendMessage(String.valueOf(ping));
                try {
                    wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return false;
        }

        Player player = (Player) sender;
        if (args.length == 1){
            switch (args[0]){
                case "one":
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage(ChatColor.GREEN + "Du bist im Gamemode.,");
                    break;
                case "two":
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendMessage(ChatColor.GREEN + "Du bist im Survival.,");
                    break;
                case "three":
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage(ChatColor.GREEN + "Du bist ein Lappen.,");
                    break;
                default:
                    sender.sendMessage(ChatColor.BLUE + "/do <one | two>");
                    break;
            }

        } else {
            sender.sendMessage(ChatColor.BLUE + "/do <one | two>");
        }

        return false;
    }
}
