package me.cyanade.base.util;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public final class ColorUtil {

    public String translateString(final String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public ArrayList<String> translateArray(List<String> message) {
        ArrayList<String> list = new ArrayList<>();
        for (String string : message) {
            list.add(translateString(string));
        }
        return list;
    }
}