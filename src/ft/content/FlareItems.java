package ft.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.effect.MultiEffect;
import mindustry.gen.Sounds;
import mindustry.graphics.Pal;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.world.blocks.defense.turrets.ItemTurret;

import static mindustry.type.ItemStack.with;

public class FlareItems {
    public static Item flareItem;
    public static Item flarogusItem;
    public static Item susgeAlloy;
    public static Item shit;

    public static void load() {
        flareItem = new Item("flare-item") {{
            cost = 1.2f;
            hardness = 6;
            radioactivity = 12f;
            explosiveness = 50f;
            flammability = 0.01f;
            charge = 0.4f;
        }};

        susgeAlloy = new Item("susge-alloy") {{
            cost = 1.4f;
            hardness = 1;
            radioactivity = 13f;
            explosiveness = 0.4f;
            flammability = 0.2f;
            charge = 153f;
        }};

        flarogusItem = new Item("flarogus-item") {{
            cost = 1.4f;
            hardness = 5;
            radioactivity = 500f;
            explosiveness = 12f;
            flammability = 0.01f;
            charge = 100f;
        }};

        shit = new Item("shit") {{
            cost = 1.4f;
            hardness = 10;
            radioactivity = 300000f;
            explosiveness = 35000000f;
            flammability = 0.5f;
            charge = 534f;
        }};
    }
}
