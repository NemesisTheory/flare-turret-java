package ft.content;

import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.type.Item;

public class FlareItems {
    public static Item flareItem;

    public static void load() {
        flareItem = new Item("flare-item") {{
                cost = 1.2f;
                hardness = 6;
                radioactivity = 5000f;
                explosiveness = 5000f;
                flammability = 0.01f;
                charge = 5000f;
            }
        };
    }
}
