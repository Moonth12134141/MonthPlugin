package Month.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandGUI extends CommandMain {
    public boolean onCommand(CommandSender Play, Command cmd, String arg2, String[] args) {
        if (args.length == 2) {
            if(args[0].toLowerCase().equalsIgnoreCase("bata")) {
                if(args[1].toLowerCase().equalsIgnoreCase("menu")) {
                    if (!(Play instanceof Player)) {
                        Play.sendMessage(" §f> §c 您 無 法 在 後 台 使 用 此 指 令 !");
                        return true;
                    } else {
                        Player p = (Player) Play;
                        p.openInventory(getGUI());
                        return true;
                    }
                } else {
                    Play.sendMessage(" §f> §6尚 未 擁 有 的 B a t a 項 目 !");
                    return true;
                }
            }
        }
        return false;
    }
}
