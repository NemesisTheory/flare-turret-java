package ft.items;

import arc.graphics.Color;
import mindustry.type.Item;
import mindustry.content.Items;

public class FlareItems {
public static Item flareItem;

    public static void load() {
        flareItem = new Item("flare-item") {;
                cost = 1.2;
                hardness = 6;
                radioactivity = 5000f;
                explosiveness = 5000f;
                flammability = 0.01f;
                charge = 5000f;
            };
        };
    }
}
