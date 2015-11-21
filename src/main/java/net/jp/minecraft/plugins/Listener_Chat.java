package net.jp.minecraft.plugins;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.UUID;

/**
 * TeisyokuPlugin2
 *
 * @auther syokkendesuyo
 */
public class Listener_Chat implements Listener{
    @EventHandler
    public void PlayerChat(AsyncPlayerChatEvent event)
    {
        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();
        try {
            String NickName = TeisyokuPlugin2.getInstance().NickConfig.getString(uuid + ".nick");
            String ID = TeisyokuPlugin2.getInstance().NickConfig.getString(uuid + "id");
            String sender = event.getPlayer().getName().toString();

            String Name = player.getDisplayName();
            if(NickName == null){
                Name = sender;
                player.setDisplayName(Name);
            }else{
                Name = ChatColor.AQUA + "" + NickName + " " + ChatColor.RESET + sender;
                player.setDisplayName(Name);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}