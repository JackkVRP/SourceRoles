package space.scripted.main;

import org.bukkit.ChatColor;

import java.util.List;

/**
 * Created by Jack on 6/13/2017.
 */
public class Role {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public org.bukkit.ChatColor getNameColor() {
        return NameColor;
    }

    public void setNameColor(org.bukkit.ChatColor nameColor) {
        NameColor = nameColor;
    }

    public org.bukkit.ChatColor getChatColor() {
        return ChatColor;
    }

    public void setChatColor(org.bukkit.ChatColor chatColor) {
        ChatColor = chatColor;
    }

    public List<String> getPerms() {
        return perms;
    }

    public void setPerms(List<String> perms) {
        this.perms = perms;
    }

    public String prefix;
    public String suffix;
    public ChatColor NameColor;
    public ChatColor ChatColor;
    public List<String> perms;

}
