package com.example.univer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;




public class lection_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lection_activity);

        GridLayout layout = findViewById(R.id.grid);

        for (int i = 1; i <= 15; i++) {
            Button button = new Button(this);
            button.setText("Ma'ruza "+i);

            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            button.setTextColor(getResources().getColor(R.color.white));
            params.height = GridLayout.LayoutParams.WRAP_CONTENT;
            params.leftMargin = 18;
            params.rightMargin = 17;
            params.topMargin = 25;

           // params.setGravity(Gravity.FILL_HORIZONTAL);
            params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);

            button.setBackgroundResource(R.drawable.button_style);



            // Добавляем кнопку в GridLayout
            layout.addView(button, params);
        }
    }

}