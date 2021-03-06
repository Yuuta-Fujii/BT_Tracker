package com.example.bttracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {

    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        // get the ID of the EditText on the layout
        userInput = (EditText)findViewById(R.id.LoginputDate);
    }

    public void confirmBT(View view) {
        Intent toConfirm=new Intent(this, ConfirmActivity.class);
        // append user input to the toConfirm Intent
        // the 2nd argument means: get user input from the EditText View,
        // and convert the text to a string
        toConfirm.putExtra("BT_data", userInput.getText().toString());
        // start ConfirmActivity
        startActivity(toConfirm);
    }
}
