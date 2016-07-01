package com.zeljkopratezina.myfirstapp_upbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        // To enable Home
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
    public void openB(View view) {
        //This will open Acitivity B from Activity A
        startActivity(new Intent(this, ActivityB.class));
    }
}
