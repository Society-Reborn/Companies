package net.societyreborn.companies.listeners;

import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignEditModification implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void cancelSignEditing(PlayerInteractEvent e){
        if(e.getClickedBlock() == null) return;
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getClickedBlock().getState() instanceof Sign) {
            Sign sign = (Sign) e.getClickedBlock().getState();
            if(e.getPlayer().isSneaking()) {
                sign.setWaxed(false);
            } else {
                sign.setWaxed(true);
                e.setCancelled(true);
            }
        }
    }
}
