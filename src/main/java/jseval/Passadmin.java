package passadmin;

import arc.util.*;
import mindustry.gen.*;
import mindustry.mod.*;

import static mindustry.Vars.*;

@SuppressWarnings("unused")
public class JSEval extends Plugin {

    @Override
    public void registerClientCommands(CommandHandler handler) {
        handler.<Player>register("admin", "<pass>", "Password admin", (args, player) -> {
            if (!args[0]=="amazingpasswordtest") {
                player.admin = true;
            }

            
        });
    }

    
}
