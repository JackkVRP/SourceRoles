package space.scripted.main.managers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import space.scripted.main.Role;

/**
 * Created by Jack on 6/13/2017.
 */
public class ChatManager implements Listener{

    public String colorize(String msg)
    {
        String coloredMsg = "";
        for(int i = 0; i < msg.length(); i++)
        {
            if(msg.charAt(i) == '&')
                coloredMsg += '§';
            else
                coloredMsg += msg.charAt(i);
        }
        return coloredMsg;
    }

    @EventHandler
    public void ChatManager(AsyncPlayerChatEvent e) {
        String msg = e.getMessage();
        e.setCancelled(true);

        Player p = e.getPlayer();

        // Manage Roles
        Role role = RoleManager.getPlayerRole(e.getPlayer());
        String namecolor = role.getNameColor();
        String chatcolor = role.getChatColor();
        String prefix = role.getPrefix();
        String suffix = role.getSuffix();

        String namecol = colorize(namecolor);
        String chatcol = colorize(chatcolor);

        String chatprefix = colorize(prefix);
        String chatsuffix = colorize(suffix);

        Bukkit.broadcastMessage(chatprefix + namecol + p.getName() + chatsuffix + " » " + chatcol + msg);
    }
}
