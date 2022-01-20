package me.grian;

import me.grian.ToString.ToString;

@ToString
public class Npc {
    private int level;
    private boolean hostileByDefault;
    public String name;

    Npc(int level, boolean hostileByDefault, String name) {
        this.level = level;
        this.hostileByDefault = hostileByDefault;
        this.name = name;
    }

    @Override
    public String toString() {
        return "me.grian.Npc(level=" + level + ", hostileByDefault=" + hostileByDefault + ", name=" + name + ")";
    }
}