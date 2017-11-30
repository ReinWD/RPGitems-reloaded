package think.rpgitems.power.sound;

import org.bukkit.Sound;

import java.util.HashMap;

public class SoundManager {
    private HashMap<TriggerType,Sound> soundMap;

    public SoundManager(){
        soundMap = new HashMap<>();
    }

    public Sound getSound(TriggerType type){
        return soundMap.get(type);
    }

    public void setSound(TriggerType type, Sound sound){
        soundMap.put(type,sound);
    }

    public HashMap<TriggerType, Sound> getSoundMap() {
        return soundMap;
    }
}
