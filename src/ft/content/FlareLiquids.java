package ft.content;

import mindustry.type.Liquid;
import mindustry.graphics.Pal;

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
