package net.monzabi.lunaris;

import lombok.Getter;
import lombok.experimental.Accessors;
import net.minecraft.server.MinecraftServer;
import net.monzabi.lunairs.LunarisAPI;
import net.monzabi.lunaris.command.LunarisCommand;
import net.monzabi.lunaris.handle.LunarisHandler;
import org.bukkit.command.SimpleCommandMap;

@Getter
@Accessors(fluent = true)
public class Lunaris {

    @Getter
    private static Lunaris lunaris;
    private LunarisHandler lunarisHandler;

    public Lunaris() {
        lunaris = this;

        this.registerCommand();
        this.initializeHandler();

    }

    private void registerCommand() {
        final SimpleCommandMap commandMap = MinecraftServer.getServer().server.getCommandMap();

        if (commandMap.getCommand("lunaris") == null) {
            commandMap.register("lunaris", "lunaris", new LunarisCommand(""));
        }
    }

    private void initializeHandler() {
        this.lunarisHandler = new LunarisHandler();
    }

}
