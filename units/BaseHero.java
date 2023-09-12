package org.example.units;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface {
    protected String name;
    protected int x, y;
    private int id;
    private float maxHp;
    private float hp;
    private int attack;
    private int def;
    int[] dmg;
    
    public BaseHero(float hp, int x, int y, int attack, int[] dmg, int def, String name) {
        this.hp = hp;
        this.x = x;
        this.y = y;
        this.attack = attack;
        this.dmg = dmg;
        this.def = def;
        this.name = name;
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
       return String.format("%n,Здоровье:%h",name, hp);
    }
}
