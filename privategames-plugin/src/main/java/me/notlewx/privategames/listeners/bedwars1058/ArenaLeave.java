package me.notlewx.privategames.listeners.bedwars1058;

import com.andrei1058.bedwars.api.events.player.PlayerLeaveArenaEvent;
import me.notlewx.privategames.api.arena.IPrivateArena;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import static me.notlewx.privategames.PrivateGames.api;

public class ArenaLeave implements Listener {
    @EventHandler
    public void onArenaLeave(PlayerLeaveArenaEvent e) {
        if (!api.getPrivateArenaUtil().isArenaPrivate(e.getArena().getWorldName())) return;
        if (e.getArena().getPlayers().size() <= 1) {
            IPrivateArena arena = api.getPrivateArenaUtil().getPrivateArenaByIdentifier(e.getArena().getWorldName());
            arena.destroyData();
            api.getBedWars1058API().getArenaUtil().getArenas().add(e.getArena());
        }
        e.getPlayer().setHealth(20);
        e.getPlayer().setHealthScale(20);
        e.getPlayer().setMaxHealth(20);
    }
}
