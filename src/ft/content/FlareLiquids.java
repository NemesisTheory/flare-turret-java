package ft.content;

import arc.graphics.Color;
import mindustry.type.Liquid;
import mindustry.graphics.Pal;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import arc.util.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.logic.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.content.Liquids;
import mindustry.content.*;

import static mindustry.entities.Puddles.*;
import static mindustry.content.Liquids.*;

public class FlareLiquids {

    public static Liquid diarrheaJuice;

    public static void load() {
        diarrheaJuice = new Liquid ("diarrhea-juice", Pal.muddy) {{
            viscosity = 15f;
            flammability = 12f;
            explosiveness = 502f;
            heatCapacity = 74f;
            barColor = Pal.muddy;
            effect = FlareStatus.explosiveDiarrhea;
            boilPoint = 0.1f;
            canStayOn.add(water);
        }};
    }
}
