package com.example.oop;

import android.widget.TextView;

public class NPC implements  Runnable, Printable{

    private int id = 0;
    private String state = "ожидает";

    public NPC(int id, String state){
        this.state = state;
        this.id = id;
    }

    @Override
    public void printInfo(TextView textView) {
        textView.append("NPC номер + " + id + " " + state + "\n");
    }

    @Override
    public void letsGo(TextView textView) {
        textView.append("NPC номер " + id + " начал хаотически перемещаться\n");
        state = "хаотически перемещается";
    }
}
