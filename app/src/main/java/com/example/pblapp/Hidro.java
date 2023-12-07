package com.example.pblapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Hidro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidro);

        ImageButton arrowLeftButton = findViewById(R.id.arrow_left);
        arrowLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk kembali ke HomeActivity
                Intent intent = new Intent(Hidro.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Optional, untuk menutup activity saat ini dari stack
            }
        });

        // Generate random values for TextViews
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView5 = findViewById(R.id.textView5);

        // Generate random values for Buttons
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        // Set random values for TextViews
        textView3.setText(getRandomCondition());
        textView5.setText(getRandomLastScanned());

        // Set random values for Buttons
        button1.setText(getRandomStatus());
        button2.setText(getRandomStatus());
        button3.setText(getRandomLastScanned());
    }

    // Helper method to generate random condition
    private String getRandomCondition() {
        String[] conditions = {"Normal", "Abnormal"};
        return conditions[new Random().nextInt(conditions.length)];
    }

    // Helper method to generate random status
    private String getRandomStatus() {
        String[] statuses = {"Mati", "Hidup"};
        return statuses[new Random().nextInt(statuses.length)];
    }

    // Helper method to generate random last scanned date
    private String getRandomLastScanned() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());
        return sdf.format(new Date());
    }
}
