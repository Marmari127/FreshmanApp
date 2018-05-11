package com.example.samanthajaime.freshmanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

//This class includes all the java code for the main menu buttons to go onto
//new pages
public class MainPage extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        setTitle("SJSU Freshman App");
        setContentView(R.layout.activity_main_page);
    }

        //Button for tips
        public void tips(View view)
        {
            startActivity(new Intent(MainPage.this,Tips.class));
        }

        //Button for Maps
        public void maps(View view)
        {
            startActivity(new Intent(MainPage.this, Map.class));
        }

        //Button for ResourcesActivity
        public void resources(View view)
        {
            startActivity(new Intent(MainPage.this, ResourcesActivity.class));
        }

        //Button for Student Life
        public void studentlife(View view)
        {
            startActivity(new Intent(MainPage.this, Student.class));
        }

}
