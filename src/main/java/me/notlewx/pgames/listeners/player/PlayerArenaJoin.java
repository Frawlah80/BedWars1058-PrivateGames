package me.notlewx.pgames.listeners.player;

import com.andrei1058.bedwars.api.events.player.PlayerJoinArenaEvent;
import me.notlewx.pgames.db.MySQL;
import me.notlewx.pgames.db.SQLite;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerArenaJoin implements Listener {
    private static MySQL mySQL;
    private static SQLite sqLite;
    @EventHandler
    public static void onPlayerJoin(PlayerJoinArenaEvent e) {
        String path = e.getPlayer().getName();

    }
}
