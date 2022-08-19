package me.cyanade.base.util;

import lombok.Getter;

@Getter
public enum MessageUtil {

    PREFIX("&c&lBase &7⎟ &c"),
    LINE("&7&m---------------------");

    private final String string;

    MessageUtil(final String string) {
        this.string = string;
    }
}
