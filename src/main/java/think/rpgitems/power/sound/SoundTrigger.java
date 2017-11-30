package think.rpgitems.power.sound;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import think.rpgitems.item.RPGItem;
import think.rpgitems.power.Power;

import java.util.HashMap;
import java.util.Map;

public class SoundTrigger {

    private HashMap<RPGItem,Sound> triggerMap;

    public SoundTrigger(){
        triggerMap = new HashMap<>();
        //TODO: initialize trigger list
    }

    public void triggerSound(Power power, Player player){
        Sound soundToPlay = triggerMap.get(power.item);
        if(soundToPlay!=null) {
            player.playSound(player.getLocation(), soundToPlay, 1.0f, 1.0f);
        }
    }
}
