package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find buttons by their IDs and set onClick listeners
        findViewById(R.id.btnLessons).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLessonsActivity();
            }
        });

        findViewById(R.id.btnCalculator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalculatorActivity();
            }
        });
    }

    // Method to open the Calculator activity
    public void openCalculatorActivity() {
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }

    // Method to open the Lessons activity
    public void openLessonsActivity() {
        Intent intent = new Intent(this, LessonsActivity.class);
        startActivity(intent);
    }
}
