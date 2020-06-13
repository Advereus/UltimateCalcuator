package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;



public class SubtractionActivity extends AppCompatActivity {

    private Button BackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);

        BackButton = findViewById(R.id.backButton);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v) {

                openMainActivity();
            }
        });

        final TextView finalAnswer = findViewById(R.id.finalAnswer);
        final EditText firstSubtractionValue = findViewById(R.id.firstSubtractionValue);
        final EditText secondSubtractionValue = findViewById(R.id.secondSubtractionValue);
        final Button calculateButton = findViewById(R.id.calculateButton);


        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstValue = Double.parseDouble(firstSubtractionValue.getText().toString());
                double secondValue = Double.parseDouble(secondSubtractionValue.getText().toString());

                double finalValue = firstValue + secondValue;
                String finalValueText = "" + finalValue;
                finalAnswer.setText(finalValueText);


            }
        };
        calculateButton.setOnClickListener(calculatorListener);


    }

    private void openMainActivity() {

        Intent intent = new Intent(SubtractionActivity.this, MainActivity.class);
        startActivity(intent);

    }
}
