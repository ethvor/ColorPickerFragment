package com.example.colorpicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnMessageSendListener {

    FragmentManager fg;
    ColorsViewModel colorsModel; // view model custom class defined in java file


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            fg = getSupportFragmentManager(); //get fragment manager
            FragmentTransaction trans = fg.beginTransaction(); //begin fragment transaction
            ColorPickFragment cf = new ColorPickFragment(); //add
            ColorListFragment cl = new ColorListFragment();
            trans.add(R.id.colorFragment, cf, "colorFrag");
            trans.add(R.id.listFragment, cl, "listFrag");
            trans.commit(); //
        }



    }

    @Override
    public void onMessageSend(String message) {

    }
}