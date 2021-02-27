package Month.Commands;

import Month.Main.GUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandMain extends GUI implements CommandExecutor {
    public boolean onCommand(CommandSender Play, Command cmd, String arg2, String[] args) {
        if (cmd.getName().toLowerCase().equalsIgnoreCase("Month")) { // 客戶端
            if (args.length == 0) {
                Play.sendMessage(" §f> §6=-=-=-=-=-=-=§f <  §2[§a 未知世界 §2]  §f> §6=-=-=-=-=-=-=§f <");
                Play.sendMessage("");
                Play.sendMessage(" §7  /Month help    §e●§6 查 詢 指 令");
                Play.sendMessage(" §7  /Month bata    §e●§6 導 入 新 訊 息 測 試 使 用");
                Play.sendMessage(" §7     正 在 開 發 中 . . .");
                Play.sendMessage(" §7     正 在 開 發 中 . . .");
                Play.sendMessage(" §7  /Month reload  §e●§6 重 新 載 入 Month 插 件 ");
                Play.sendMessage("");
                Play.sendMessage(" §f> §6=-=-=-=-=-=-=§f <  §2[§a 幫助頁面 §2]  §f> §6=-=-=-=-=-=-=§f <");
                return true;
            }

            if (args.length == 1) {

                if (args[0].toLowerCase().equalsIgnoreCase("bata")) {
                    Play.sendMessage(" §f> §6目 前 擁 有 的 B a t a 項 目 : §7Play §8- §7Menu");
                    return true;
                }

            }
        }
        Play.sendMessage("§8[ §7未知世界 §8]   §f> §6請 確 認 指 令 輸 入 是 否 正 確 ! §f<");
        return true;
    }
}
