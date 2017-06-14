package space.scripted.main;

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

    public String getNameColor() {
        return NameColor;
    }

    public void setNameColor(String nameColor) {
        nameColor = nameColor;
    }

    public String getChatColor() {
        return ChatColor;
    }

    public void setChatColor(String chatColor) {
        chatColor  = chatColor;
    }

    public List<String> getPerms() {
        return perms;
    }

    public void setPerms(List<String> perms) {
        this.perms = perms;
    }

    public String prefix;
    public String suffix;
    public String NameColor;
    public String ChatColor;
    public List<String> perms;

}
