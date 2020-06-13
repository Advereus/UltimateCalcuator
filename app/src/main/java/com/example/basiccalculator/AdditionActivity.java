package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;



public class AdditionActivity extends AppCompatActivity {

    private Button BackButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        BackButton = findViewById(R.id.backButton);

        BackButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View v) {

                openMainActivity();
            }
        });

        final TextView finalAnswer = findViewById(R.id.finalAnswer);
        final EditText firstAdditionValue = findViewById(R.id.firstAdditionValue);
        final EditText secondAdditionValue = findViewById(R.id.secondAdditionValue);
        final Button calculateButton = findViewById(R.id.calculateButton);


        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstValue = Double.parseDouble(firstAdditionValue.getText().toString());
                double secondValue = Double.parseDouble(secondAdditionValue.getText().toString());

                double finalValue = firstValue + secondValue;
                String finalValueText = "" + finalValue;
                finalAnswer.setText(finalValueText);


            }
        };
        calculateButton.setOnClickListener(calculatorListener);


        }
    }

    private void openMainActivity() {

        Intent intent = new Intent(AdditionActivity.this, MainActivity.class);
        startActivity(intent);

    }

}
