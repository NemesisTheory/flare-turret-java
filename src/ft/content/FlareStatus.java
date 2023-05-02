package ft.content;

import mindustry.graphics.*;
import mindustry.type.*;

public class FlareStatus {
    public static StatusEffect flareStatus;
    public static StatusEffect flarogusStatus;
    public static StatusEffect explosiveDiarrhea;
    public static StatusEffect movus;
    public static void load() {
        flareStatus = new StatusEffect("flare-status"){{
            color = Pal.lightOrange;
            damage = 0.5f;
            speedMultiplier = 0.85f;

            init(() -> {
                opposite(flarogusStatus);
            });
        }};

        flarogusStatus = new StatusEffect("flarogus-status"){{
            color = Pal.lighterOrange;
            damage = 2f;
            speedMultiplier = 0.7f;
            healthMultiplier = 0.5f;
            reloadMultiplier = 0.4f;
        }};

        explosiveDiarrhea = new StatusEffect("explosive-diarrhea"){{
            color = Pal.muddy;
            damage = 8f;
            speedMultiplier =  0.25f;
            healthMultiplier = 0.8f;
            reloadMultiplier = 1.5f;
        }};

        movus = new StatusEffect("movus"){{
            damage = 0.0001f;
            speedMultiplier = 0.0001f;
            healthMultiplier = 5f;
            reloadMultiplier = 0.0001f;
        }};
}}
