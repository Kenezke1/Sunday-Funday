package com.codecool;

public enum Hero {
    GREENLANTERN("GREENLANTERN"),
    BATMAN("BATMAN"),
    SUPERMAN("SUPERMAN"),
    FLASH("FLASH"),
    SUBZERO("SUBZERO"),
    WONDERWOMAN("WONDERWOMAN"),
    CAPTAINAMERICA("CAPTAINAMERIKA"),
    BANE("BANE"),
    JOKER("JOKER"),
    DOOMSDAY("DOOMSDAY"),
    BLACKADAM("BLACKADAM"),
    SINESTRO("SINESTRO");
    private String name;
    Hero(String flash) {
        name = flash;
    }
    public static Hero fromString(String text) {
        for (Hero b : Hero.values()) {
            if (b.name.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
