package think.rpgitems.power;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import think.rpgitems.commands.Property;
import think.rpgitems.power.types.PowerDig;

public class PowerTreasure extends Power implements PowerDig {

    @Override
    public void onDestroyBlock(BlockBreakEvent event, Player player, ItemStack item) {
        //todo:finish this function.
    }

    @Override
    public void init(ConfigurationSection s) {

    }

    @Override
    public void save(ConfigurationSection s) {

    }

    @Override
    public String getName() {
        return "treasure";
    }

    @Override
    public String displayText() {
        return "power.treasure";
    }
}
