package Month.Main;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public final class PlayNew {
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        int playmax = Bukkit.getMaxPlayers();
        int playlist = Bukkit.getOnlinePlayers().size();

        if (event.getJoinMessage().contains("joined the game")) {

            // Play 刪除原訊息
            event.setJoinMessage(null);
        }

        if(!event.getPlayer().hasPlayedBefore()) {

            event.getPlayer().sendMessage(" §f> §6=-=-=-=-=§f <  §2[§a 歡迎第一次進入未知世界伺服器! §2]  §f> §6=-=-=-=-=§f <");
            event.getPlayer().sendMessage(" §f> ");

        } else {

            event.getPlayer().sendMessage(" §f> §6=-=-=-=-=-=-=§f <  §2[§a 未知世界 §2]  §f> §6=-=-=-=-=-=-=§f <");
            event.getPlayer().sendMessage(" §7    §6玩家數量: §a" + playlist + " / " + playmax);
            event.getPlayer().sendMessage(" §7    ");
            event.getPlayer().sendMessage(" §7    ");
            event.getPlayer().sendMessage(" §7    ");
            event.getPlayer().sendMessage(" §7    ");
            event.getPlayer().sendMessage(" §7    ");
            event.getPlayer().sendMessage(" §f> §6=-=-=-=-=-=-=§f <  §2[§a 歡迎進入 §2]  §f> §6=-=-=-=-=-=-=§f <");
        }
    }
}
