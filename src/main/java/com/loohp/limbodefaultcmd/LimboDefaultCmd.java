package com.loohp.limbodefaultcmd;

import com.loohp.limbo.events.EventHandler;
import com.loohp.limbo.events.Listener;
import com.loohp.limbo.events.player.PlayerJoinEvent;
import com.loohp.limbo.plugins.LimboPlugin;
import net.md_5.bungee.api.ChatColor;

public class LimboDefaultCmd extends LimboPlugin implements Listener {


    @Override
    public void onEnable() {
        getServer().getEventsManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        String playername = event.getPlayer().getName();
        event.getPlayer().sendMessage("Hello and Welcome " + ChatColor.GREEN + playername);
    }



}
