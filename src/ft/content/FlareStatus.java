package ft.content;

import arc.*;
import arc.graphics.*;
import arc.math.*;
import mindustry.game.EventType.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.content.StatusEffects;

import static mindustry.Vars.*;
import static ft.content.FlareBlocks.*;
import static ft.content.FlareItems.*;

public class FlareStatus {
    public static StatusEffect flareStatus;
    public static StatusEffect flarogusStatus;

    public static void load() {
        flareStatus = new StatusEffect("flare-status"){{
            color = Pal.lightOrange;
            damage = 2f;
            speedMultiplier = 0.85f;

            init(() -> {
                opposite(flarogusStatus);
            });
        }};

        flarogusStatus = new StatusEffect("flarogus-status"){{
            color = Pal.lighterOrange;
            damage = 4f;
            speedMultiplier = 0.7f;
            healthMultiplier = 0.5f;
            reloadMultiplier = 0.4f;
        }};
    }
}
