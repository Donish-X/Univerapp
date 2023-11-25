package com.example.univer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lection_button = (Button) findViewById(R.id.lection_btn);
        Button seminar_button = (Button) findViewById(R.id.seminar_btn);
        Button practice_button = (Button) findViewById(R.id.practice_btn);
        Button about_button = (Button) findViewById(R.id.about_btn);

        lection_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, lection_activity.class);
                startActivity(intent);
            }
        });

        seminar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, seminar_activity.class);
                startActivity(intent);
            }
        });

        practice_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, practice_activity.class);
                startActivity(intent);
            }
        });

        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, about.class);
                startActivity(intent);
            }
        });
    }
}