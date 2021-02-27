package Month.Main;

import Month.Commands.CommandGUI;
import Month.Commands.CommandMain;
import org.bukkit.command.Command;
import org.bukkit.event.Listener;

public class MonthPlugin extends MonthJavaPlugin implements Listener {

    @Override
    public final void onLoad() {
        System.out.println(" > =-=-=-=-=-=-=-=-=-=-=-=-=-= <");
        System.out.println("[ 未知世界 ] 插件正在啟動. . .");
        System.out.println(" > =-=-=-=-=-=-=-=-=-=-=-=-=-= <");
    }

    @Override
    public void onEnable() {
        setupCommands();

        System.out.println(" > =-=-=-=-=-=-=-=-=-=-=-=-=-= <");
        System.out.println(" [ 未知世界 ] 插件啟動成功!");
        System.out.println(" [ 未知世界 ] 歡迎使用by.Month_ouod");
        System.out.println(" > =-=-=-=-=-=-=-=-=-=-=-=-=-= <");
    }

    @Override
    public final void onDisable() {
        System.out.println(" > =-=-=-=-=-=-=-=-=-=-=-=-=-= <");
        System.out.println(" [ 未知世界 ] 插件關閉成功!");
        System.out.println(" [ 未知世界 ] 歡迎再次使用by.Month_ouod");
        System.out.println(" > =-=-=-=-=-=-=-=-=-=-=-=-=-= <");
    }
    public void setupCommands() {
        getCommand("Month").setExecutor(new CommandMain());

        getCommand("Month").setExecutor(new CommandGUI());
    }

    public final void onReload() {
        System.out.println("onReload !");
    }

}
