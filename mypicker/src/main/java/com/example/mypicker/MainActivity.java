package com.example.mypicker;


import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private ArrayList<String> cardItem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getCardData();
        PickerView pickerView = (PickerView) findViewById(R.id.picker_view);
        pickerView.setData(cardItem);
    }

    private void getCardData() {
        for (int i = 0; i < 5; i++) {
            cardItem.add("No.ABC12345 " + i);
        }
    }
}
