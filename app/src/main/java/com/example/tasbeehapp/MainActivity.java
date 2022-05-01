package com.example.tasbeehapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearAll(View view) {

        EditText counterPanel = findViewById(R.id.counterPanel);
        counterPanel.setText("0");
    }

    public void incrementCounter(View view)
    {
        EditText  counterPanel = findViewById(R.id.counterPanel);
        int count = Integer.parseInt(String.valueOf(counterPanel.getText()));
        count += 1;
        counterPanel.setText(String.valueOf(count));
    }
}