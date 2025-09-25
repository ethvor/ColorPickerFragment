package com.example.colorpicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnMessageSendListener {

    FragmentManager fg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            fg = getSupportFragmentManager(); //get fragment manager
            FragmentTransaction trans = fg.beginTransaction(); //begin fragment transaction
            ColorPickFragment cf = new ColorPickFragment(); //add
            trans.add(R.id.colorFragment, cf, "colorFrag");
            trans.commit(); //
        }



    }

    @Override
    public void onMessageSend(String message) {

    }
}