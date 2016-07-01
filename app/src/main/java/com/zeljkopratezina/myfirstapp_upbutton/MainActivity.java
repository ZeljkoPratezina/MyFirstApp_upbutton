package com.zeljkopratezina.myfirstapp_upbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openA(View view) {
        //This will open Acitivity A from Main Activity
startActivity(new Intent(this, ActivityA.class));
    }
}
