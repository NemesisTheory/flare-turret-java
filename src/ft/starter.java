package ft;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import ft.content.FlareLiquids;
import ft.content.FlareStatus;
import ft.content.FlareItems;
import ft.content.FlareBlocks;

public class starter extends Mod{

    public starter(){
        Log.info("Loaded  constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("hi");
                dialog.cont.add("trauma").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("flare-turret-java-trauma")).pad(20f).row();
                dialog.cont.button("ok", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        FlareStatus.load();
        FlareItems.load();
        FlareLiquids.load();
        FlareBlocks.load();
        Log.info("Loading content.");
    }

}
