package Month.Main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI {
    protected Inventory getGUI() {
        Inventory inv = Bukkit.createInventory(null, 45, " §d> §5=-=-= §d<  [§4 未知世界選單 §d]  > §5=-=-= §d<");
        ItemStack air = new ItemStack(Material.STAINED_GLASS_PANE);
        ItemMeta airName = air.getItemMeta();
        airName.setDisplayName(" §f> §6 這 只 是 個 框 §f<");
        return inv;
    }
}