package org.example.units;

public class Warrior extends Melee{

    private int rage;

    public Warrior(String name) {
        super(200, 1, 3, 20, new int[]{10,20},20,name);
        rage=100;
    }

    @Override
    public String getInfo() {
        return String.format("Воин"+super.getInfo());
    }
}
