package com.example.oop;

import android.widget.TextView;

public class Wizzard extends Unit implements Printable, Runnable{

    private int mana;

    public Wizzard(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    public void printInfo(TextView textPlace) {
        super.printInfo(textPlace);
        textPlace.append(getName() + " имеет " + mana + " очков маны.\n");
    }

    @Override
    public void letsGo(TextView textPlace) {
        mana -= 20;
        textPlace.append(getName() + " совершил телепортацию, остаток маны  = " + mana + "\n");
    }
}
