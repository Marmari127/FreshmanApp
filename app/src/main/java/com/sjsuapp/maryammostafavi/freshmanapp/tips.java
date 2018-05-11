package com.example.samanthajaime.freshmanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class Tips extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips);

        setTitle("Tips");
        setContentView(R.layout.tips);
    }

    //Button to go back to Main Page
    public void back(View view)
    {
        startActivity(new Intent(Tips.this,MainPage.class));
    }

}

