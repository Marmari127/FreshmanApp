package com.sjsuapp.maryammostafavi.freshmanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resources extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Resources);
       
       TextView text1 = (TextView) findViewById(R.id.textView1);
       text1.setMovementMethod(LinkMovementMethod.getInstance());
       TextView text2 = (TextView) findViewById(R.id.textView2);
       text2.setMovementMethod(LinkMovementMethod.getInstance());
       TextView text3 = (TextView) findViewById(R.id.textView3);
       text3.setMovementMethod(LinkMovementMethod.getInstance());
       TextView text4 = (TextView) findViewById(R.id.textView4);
       text4.setMovementMethod(LinkMovementMethod.getInstance());


      

    }

}
