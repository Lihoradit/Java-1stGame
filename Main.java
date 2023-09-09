package org.example;

import org.example.units.BaseHero;
import org.example.units.Support;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> hero=new ArrayList<>();
        hero.add(new Support("Иван"));

    }
}