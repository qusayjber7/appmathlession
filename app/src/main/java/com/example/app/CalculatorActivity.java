package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    private EditText editText;
    private Button btnCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editText = findViewById(R.id.editText);
        btnCalculate = findViewById(R.id.btnCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
    }

    private void calculateResult() {
        String expression = editText.getText().toString();
        double result = 0;
        if (expression.contains("+")) {
            String[] numbers = expression.split("\\+");
            result = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
        } else if (expression.contains("-")) {
            String[] numbers = expression.split("-");
            result = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
        } else if (expression.contains("*")) {
            String[] numbers = expression.split("\\*");
            result = Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
        } else if (expression.contains("/")) {
            String[] numbers = expression.split("/");
            if (Double.parseDouble(numbers[1]) != 0) {
                result = Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
            } else {
                textViewResult.setText("Error: Division by zero");
                return;
            }
        } else {
            textViewResult.setText("Error: Invalid expression");
            return;
        }
        textViewResult.setText(String.valueOf(result));
    }

}
