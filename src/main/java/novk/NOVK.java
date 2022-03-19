package novk;

import arc.util.*;
import mindustry.gen.*;
import mindustry.mod.*;

import static mindustry.Vars.*;

@SuppressWarnings("unused")
public class NOVK extends Plugin {

    @Override
    public void registerClientCommands(CommandHandler handler) {
        handler.<Player>register("votekick", "<msg...>", "novk", (args, player) -> {
            Call.sendMessage("This sussy baka tried to votekick -> "+player.name);
        });
    }
}
