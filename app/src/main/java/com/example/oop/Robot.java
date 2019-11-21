package com.example.oop;

import android.widget.TextView;

public class Robot extends Unit implements Printable, Runnable{

    private int energy = 200;

    public Robot(String name, int health, int energy) {
        super(name, health);
        this.energy = energy;
    }

    @Override
    public void printInfo(TextView textPlace) {
        super.printInfo(textPlace);
        textPlace.append(this.getName() + " имеет " + energy + " энергии\n");
    }

    @Override
    public void letsGo(TextView textPlace) {
        super.letsGo(textPlace);
        energy--;
        textPlace.append("Энергия " + this.getName() + " уменьшилась до " + energy + "\n");
    }
}
