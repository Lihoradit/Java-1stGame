package org.example.units;

public class Rogue extends Melee{

    private int endurance;

    public Rogue(String name) {
        super(100, 1, 2, 25, new int[]{15,25},2,name);
        endurance=100;
    }

    @Override
    public String getInfo() {
        return String.format("Разбойник"+super.getInfo());
    }
}
