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

    public static void load() {
        flareItem = new Item("flare-item") {{
            cost = 1.2f;
            hardness = 6;
            radioactivity = 5000f;
            explosiveness = 5000f;
            flammability = 0.01f;
            charge = 5000f;
        }};

        flarogusItem = new Item("flarogus-item") {{
            cost = 1.4f;
            hardness = 5;
            radioactivity = 21474837f;
            explosiveness = 21474837f;
            flammability = 0.01f;
            charge = 21474837f;
        }};
    }}
