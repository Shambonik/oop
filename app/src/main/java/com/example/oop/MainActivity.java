package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView debugText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        debugText = (TextView) findViewById(R.id.debugText);
        Unit alexey = new Unit("Alexey Grigorievich", 200);
        alexey.printInfo(debugText);

        Robot Shwarzneager = new Robot("Arnold Shwartsniger", 1000, 400);
        Shwarzneager.printInfo(debugText);

        alexey.letsGo(debugText);
        Shwarzneager.letsGo(debugText);
    }
}
