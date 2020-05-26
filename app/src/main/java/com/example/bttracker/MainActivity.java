package com.example.bttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToLogActivity(View view) {
        Intent toLog = new Internet(this, LogActivity.class);
        startActivity(toLog);
    }

    public void goTONormalActivity(View view) {
        Intent toNormal = new Intent(this,NormalActivity.class);
        startActivity(toNormal);
    }

    public void goToMechanismActivity(View view) {
     Intent toMechanism = new Intent(this,MechanismActivity.class);
     startActivity(toMechanism);
    }
}
