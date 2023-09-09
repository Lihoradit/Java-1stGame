package org.example.units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero {
    protected String name;
    protected int x, y;
    private int id;
    private  float maxHp;
    private float hp;
    private int attack;
    private int def;
    int[] dmg;

    public BaseHero(float hp, int x, int y, int attack, int[] dmg,int def, String name){
        this.hp=hp;
        this.x=x;
        this.y=y;
        this.attack=attack;
        this.dmg=dmg;
        this.def=def;
        this.name=getName();
    }
    public String getnfo(){

        return String.format("maxHp:%d, id:%b, name:%n",this.maxHp, this.id,this.name);
    }
    protected String getName(){
        ArrayList <String> name= new ArrayList();
        name.add("Витя");
        name.add("Бербуль");
        name.add("Курпа");
        name.add("Булыжник");
        name.add("Балбес");
        name.add("Вертухай");
        name.add("Абу-бандит");
        name.add("Шалопай");
        name.add("Лиственник");
        name.add("Ерёма");
        name.add("Тихон");
        int r= new Random().nextInt(name.size());
        return name.get(r);
    }


}
