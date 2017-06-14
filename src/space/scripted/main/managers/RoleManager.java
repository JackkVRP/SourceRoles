package space.scripted.main.managers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import space.scripted.main.Main;
import space.scripted.main.Role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by Jack on 6/13/2017.
 */
public class   RoleManager {
    static HashMap<Role, UUID> rolemap = new HashMap<Role, UUID>();
    static List<Role> roles = new ArrayList<Role>();

    static Main plugin;

    public void InitRole(Player p) {

    }

    public void createRole(String name, String prefix, String suffix, ChatColor namecolor, ChatColor chatcolor, List<String> perms) {
        Role role = new Role();
        role.setName(name);
        role.setPrefix(prefix);
        role.setSuffix(suffix);
        role.setChatColor(chatcolor);
        role.setNameColor(namecolor);
        role.setPerms(perms);

        roles.add(role);
    }

    public static Role getRole(String rolename) {
        for(Role r : roles) {
            if(r.getName() == rolename) {
                return r;
            }
        }
        return null;
    }

    public static Role getPlayerRole(Player p) {
        String role = plugin.getConfig().getString("users." + p.getUniqueId() + ".role");
        for(Role r : roles) {
            if(r.getName() == role) {
                return r;
            }
        }
        return null;
    }

}
