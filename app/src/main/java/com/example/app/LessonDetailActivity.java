package com.example.app;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class LessonDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_detail);
        int lessonNumber = getIntent().getIntExtra("lessonNumber", 1);
        setTitle("Lesson " + lessonNumber);
        TextView textViewDetails = findViewById(R.id.textViewDetails);
        textViewDetails.setText("This is the detail for Lesson " + lessonNumber);
    }
}
