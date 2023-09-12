package org.example;

import org.example.units.*;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> hero=new ArrayList<>();
        int i=0;
        for (int j = 0; j < 10; j++) {
            

            switch(new Random().nextInt(6)){
                case 0:
                    hero.add(new Support(getName()));
                    break;
                case 1:
                    hero.add(new Hunter(getName()));
                    break;
                case 2:
                    hero.add(new Rogue(getName()));
                    break;
                case 3:
                    hero.add(new Shaman(getName()));
                    break;
                case 4:
                    hero.add(new Warlock(getName()));
                    break;
                case 5:
                    hero.add(new Warrior(getName()));
                    break;
                default:
                    hero.add(new Support(getName()));
                    break;
            }
        }
        hero.forEach((n)-> System.out.println(n.getInfo()));
    }
    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}