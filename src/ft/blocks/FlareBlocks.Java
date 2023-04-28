package ft.blocks;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;

import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;
import mindustry.content.*;

public class FlareBlocks {
    public static ItemTurret reverence;

    public static void load() {
        reverence = new ItemTurret("Reverence") {{
            requirements(Category.turret, with(Items.copper, 820, Items.graphite, 655, Items.titanium, 650, Items.silicon, 455, Items.thorium, 250));
            ammo(
                    Items.pyratite, new BasicBulletType(8f, 35) {{
                        hitSize = 6f;
                        width = 12f;
                        height = 16;
                        frontColor = Pal.lightishOrange;
                        backColor = Pal.lightOrange;
                        status = StatusEffects.burning;
                        statusDuration = 1080f;
                        lifetime = 20f;
                        collidesAir = true;
                        hitEffect = Fx.colorSparkBig;
                        smokeEffect = Fx.fireSmoke;
                        despawnEffect = Fx.fire;
                        pierce = false;
                        incendAmount = 1;
                        incendSpread = 5f;
                        incendChance = 0.85f;
                        fragOnHit = true;
                        hittable = true;
                        hitEffect = new MultiEffect(Fx.hitBulletSmall, Fx.fireHit);
                        makeFire = true;
                        shootEffect = Fx.shootBig;
                        ammoMultiplier = 3;
                        splashDamage = 185f;
                        splashDamageRadius = 86f;
                        knockback = 0.2f;
                    }}
            );
            reload = 1.4f;
            recoilTime = reload * 2;
            coolantMultiplier = 0.8f;
            ammoUseEffect = Fx.casing3;
            range = 184.85f;
            inaccuracy = 3f;
            recoil = 5.2f;
            shake = 1.5f;
            size = 3;
            shootCone = 18f;
            shootSound = Fx.shootBig;

            scaledHealth = 145;
            coolant = consumeCoolant(1f);
        }};
    }
}
