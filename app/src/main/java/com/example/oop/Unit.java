package com.example.oop;

import android.widget.TextView;

public class Unit implements Printable, Runnable{

    private String name = "Nill";
    private int health = 100;

    public Unit(String name, int health){
        this.name = name;
        this.health = health;
    }

    public void printInfo(TextView textPlace){
        textPlace.append("Меня зовут "+getName()+" и я имею "+health+" hp.\n");
    }

    public final String getName() {
        return name;
    }

    public void letsGo(TextView textPlace){
        textPlace.append(getName() + " начал бежать\n");
    }


}
