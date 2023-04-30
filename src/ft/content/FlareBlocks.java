package ft.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.content.StatusEffects;
import mindustry.content.Items;
import mindustry.content.Fx;
import mindustry.gen.Sounds;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static ft.content.FlareItems.flareItem;
import static ft.content.FlareItems.*;

public class FlareBlocks {
    public static ItemTurret reverence;
    public static GenericCrafter flareMaterializer;
    public static void load() {

        reverence = new ItemTurret("reverence") {{
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
                        shootEffect = Fx.shootBig;
                        despawnEffect = Fx.fire;
                        pierce = false;
                        incendAmount = 1;
                        incendSpread = 5f;
                        incendChance = 0.85f;
                        fragOnHit = true;
                        hittable = true;
                        hitEffect = new MultiEffect(Fx.hitBulletSmall, Fx.fireHit);
                        makeFire = true;
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
            shootSound = Sounds.shootBig;

            scaledHealth = 145;
            coolant = consumeCoolant(1f);

        }};

        flareMaterializer = new GenericCrafter("flare-materializer"){{
            requirements(Category.crafting, with(Items.copper, 200, Items.lead, 45, Items.titanium, 60, Items.graphite, 120, Items.silicon, 80, Items.thorium, 75));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(FlareItems.flareItem, 1);
            craftTime = 105f;
            size = 3;
            hasPower = true;
            hasLiquids =false;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffef99")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.109f;

            consumeItems(with(Items.silicon, 2, Items.thorium, 3));
            consumePower(7.3334f);
        }};
    }
}
