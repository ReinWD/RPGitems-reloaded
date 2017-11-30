package think.rpgitems.power.sound;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import think.rpgitems.item.RPGItem;
import think.rpgitems.power.Power;
import think.rpgitems.power.types.PowerSoundable;

import java.util.HashMap;
import java.util.Map;

public class SoundTrigger {

    private HashMap<PowerSoundable,Sound> triggerMap;

    public SoundTrigger(){
        triggerMap = new HashMap<>();
        //TODO: initialize trigger list
    }

    public void triggerSound(PowerSoundable power, Player player){
//        Sound soundToPlay = triggerMap.get();
//        if(soundToPlay!=null) {
//            player.playSound(player.getLocation(), soundToPlay, 1.0f, 1.0f);
//        }
    }
}
