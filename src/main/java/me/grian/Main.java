package me.grian;

public class Main {
    public static void main(String[] args) {
        Npc npc = new Npc(1, true, "Zombie");
        Ore ore = new Ore(1, "Copper", 5.0);

        System.out.println(npc);
        System.out.println(ore);
    }
}