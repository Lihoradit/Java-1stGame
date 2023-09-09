package org.example.units;

public class Shaman extends BaseHero{

    private int totem;

    public Shaman(String name) {
        super(150, 1, 4, 0, new int[]{0,0},25,name);
        totem=5;
    }
}
