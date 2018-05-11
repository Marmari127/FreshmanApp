package com.example.samanthajaime.freshmanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_life);

        setTitle("Student Life");
        setContentView(R.layout.activity_student_life);
    }

    //Button to go back to Main Page
    public void studentlife(View view)
    {
        startActivity(new Intent(Student.this, MainPage.class));
    }
}
