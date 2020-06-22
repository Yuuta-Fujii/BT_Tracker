package com.example.bttracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }

    public void normalToHome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
