package org.example.units;

public class Rogue extends BaseHero{

    private int endurance;

    public Rogue(String name) {
        super(100, 1, 2, 25, new int[]{15,25},2,name);
        endurance=100;
    }
}
