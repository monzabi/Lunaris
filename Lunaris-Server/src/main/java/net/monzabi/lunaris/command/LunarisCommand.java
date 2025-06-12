package net.monzabi.lunaris.command;

import net.monzabi.lunaris.Lunaris;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LunarisCommand extends Command {

    public LunarisCommand(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {

        if (sender instanceof Player) {
            final Player player = (Player) sender;
            if (player.hasPermission("lunaris.command")) {
                if (args.length == 0) {
                    player.sendMessage(Lunaris.lunaris().lunarisHandler().prefix()
                            + "§cLunaris is running on version " + Lunaris.lunaris().lunarisHandler().version() + ".");
                    return true;
                } else if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
                    if (player.hasPermission("lunaris.command.reload")) {
                        player.sendMessage(Lunaris.lunaris().lunarisHandler().prefix()
                                + "§aLunaris has been reloaded successfully.");
                        return true;
                    } else {
                        player.sendMessage("§cYou do not have permission to reload Lunaris.");
                    }
                } else {
                    player.sendMessage("§cUsage: /lunaris [reload]");
                }
            } else {
                player.sendMessage("§cYou do not have permission to use this command.");
            }
        }

        return false;
    }
}
