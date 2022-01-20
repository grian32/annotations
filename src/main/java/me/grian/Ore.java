package me.grian;

import me.grian.ToString.ToString;

@ToString
public class Ore {
    private int miningRequired;
    private String name;
    private double experienceRewarded;

    Ore(int miningRequired, String name, double experienceRewarded) {
        this.miningRequired = miningRequired;
        this.name = name;
        this.experienceRewarded = experienceRewarded;
    }
}