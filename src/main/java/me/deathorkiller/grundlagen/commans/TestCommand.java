package me.deathorkiller.grundlagen.commans;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TestCommand implements CommandExecutor {
    //public class du hast Zugriff von Überall, private class nur in der Datei selber.


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String message = "Das ist ein zweiter ";

        sender.sendMessage( message + "Test.");
        //sender = wer den command ausführt (z.B. Console, Player) und der Rest ist klar xd

        return false;
    }
}
