package org.example.units;

public class Warlock extends Range{

    private int mana;

    public Warlock(String name) {
        super(100, 1, 4, 35, new int[]{20,35},0,name);
        mana=100;
    }
    @Override
    public String getInfo() {
        return String.format("Чернокнижник"+super.getInfo());
    }
}
