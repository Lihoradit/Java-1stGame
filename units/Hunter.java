package org.example.units;

public class Hunter extends Range {

    private int endurance;

    public Hunter(String name) {
        super(125, 1, 7, 27, new int[]{18,27},5, name);
        endurance=100;
    }
    @Override
    public String getInfo() {
        return String.format("Охотник"+super.getInfo());
    }
}
