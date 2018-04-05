package com.sjsuapp.maryammostafavi.freshmanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {

    TextView textView;
    Button tipsButton;
    Button mapsButoon;
    Button resourcesButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        textView = (TextView) findViewById(R.id.textView);

        tipsButton = findViewById(R.id.tips_button);
        tipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               setContentView(R.layout.tips);

            }
        });

        mapsButoon = findViewById(R.id.maps_button);
        mapsButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_maps);
            }
        });
        resourcesButton = findViewById(R.id.resources_button);
        resourcesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.resources);
            }
        });

    }

}
