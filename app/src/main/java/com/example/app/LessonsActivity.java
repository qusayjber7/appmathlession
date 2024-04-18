package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LessonsActivity extends AppCompatActivity {

    private ListView listViewLessons;
    private final String[] lessons = {"Lesson 1", "Lesson 2", "Lesson 3", "Lesson 4", "Lesson 5", "Lesson 6", "Lesson 7", "Lesson 8", "Lesson 9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        listViewLessons = findViewById(R.id.listViewLessons);
        int[] lessonImages = {R.drawable.lesson1, R.drawable.lesson2, R.drawable.lesson3, R.drawable.lesson4, R.drawable.lesson5, R.drawable.lesson6, R.drawable.lesson7, R.drawable.lesson8, R.drawable.lesson9};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lessons);
        listViewLessons.setAdapter(adapter);

        listViewLessons.setOnItemClickListener((parent, view, position, id) -> {
            int lessonNumber = position + 1;
            Intent intent = new Intent(this, LessonDetailActivity.class);
            intent.putExtra("lessonNumber", lessonNumber);
            startActivity(intent);
        });
    }
}
