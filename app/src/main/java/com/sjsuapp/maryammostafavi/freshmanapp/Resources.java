package com.example.samanthajaime.freshmanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;


public class ResourcesActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resources);

        setTitle("Resources For Students");
        setContentView(R.layout.resources);

        TextView text = (TextView) findViewById(R.id.textView4);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text1 = (TextView) findViewById(R.id.textView5);
        text1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text2 = (TextView) findViewById(R.id.textView6);
        text2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text3 = (TextView) findViewById(R.id.textView7);
        text3.setMovementMethod(LinkMovementMethod.getInstance());

    }

    //Button to go back to Main Page
    public void resources(View view)
    {
        startActivity(new Intent(ResourcesActivity.this, MainPage.class));
    }
}
