package com.example.colorpicker;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class ColorViewModel extends ViewModel {
    private MutableLiveData<LinkedList<String>> colorsLL; //object attached to activity.


    public ColorViewModel(){
        colorsLL = new MutableLiveData<>();
        LinkedList<String> l = new LinkedList();
        colorsLL.setValue(l);
    }

    public MutableLiveData<LinkedList<String>> getColors(){
        return colorsLL;
    }

    public void setColors(LinkedList<String> l){
        colorsLL.setValue(l);
    }
    public void addColor(String c){

        LinkedList<String> l = getColors().getValue();
        l.add(c);
        Log.i("COLORS", l.toString());
        colorsLL.setValue(l);
    }


}
