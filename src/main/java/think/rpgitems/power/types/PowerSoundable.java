package think.rpgitems.power.types;

import org.bukkit.entity.Player;
import think.rpgitems.power.sound.TriggerType;

import java.util.Map;

public interface PowerSoundable {
    void playSound(TriggerType type, Player player, float volume, float pitch);
    <T extends Map> T getSoundMap();
}
