package me.notlewx.pgames.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PrivateGameDisableEvent extends Event implements Cancellable {
    public static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private boolean cancelled;

    public PrivateGameDisableEvent(Player p) {
        this.player = p;
    }

    public Player getPlayer() {
        return player;
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    public boolean isCancelled() {
        return cancelled;
    }
    public HandlerList getHandlers() {
        return HANDLERS;
    }
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
