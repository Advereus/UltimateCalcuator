package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button ButtonAddition;
    private Button ButtonSubtraction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonAddition = findViewById(R.id.AdditionButton);

        ButtonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openAdditionActivity();
            }
        });
        ButtonSubtraction = findViewById(R.id.SubtractionButton);

        ButtonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSubtractionActivity();
            }
        });


    }

    private void openAdditionActivity() {

        Intent intent = new Intent(MainActivity.this, AdditionActivity.class);
        startActivity(intent);
    }
    private void openSubtractionActivity() {

        Intent intent = new Intent(MainActivity.this, SubtractionActivity.class);
        startActivity(intent);
    }
}

