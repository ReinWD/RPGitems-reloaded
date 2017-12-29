package think.rpgitems.power.types;

import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public interface PowerDig extends IPower {
    void onDestroyBlock(BlockBreakEvent event, Player player, ItemStack item);
}
