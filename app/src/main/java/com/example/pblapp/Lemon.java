package com.example.pblapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Lemon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lemon);

        // Generate random values for TextViews
        TextView txtKD = findViewById(R.id.txtKD);
        TextView txtSP = findViewById(R.id.txtSP);
        TextView txtLS1 = findViewById(R.id.txtLS1);
        TextView txtLS2 = findViewById(R.id.txtLS2);

        // Generate random values for Buttons
        Button buttonMS = findViewById(R.id.buttonMS);
        Button buttonSM = findViewById(R.id.buttonSM);
        Button buttonTB = findViewById(R.id.buttonTB);
        Button buttonLsc = findViewById(R.id.buttonLsc);

        // Set random values for TextViews
        txtKD.setText(getRandomQuality());
        txtSP.setText(getRandomQuality());
        txtLS1.setText(getRandomTotalFruits());
        txtLS2.setText(getRandomLastScanned());

        // Set random values for Buttons
        buttonMS.setText(String.valueOf(getRandomCount()));
        buttonSM.setText(String.valueOf(getRandomCount()));
        buttonTB.setText(String.valueOf(getRandomCount()));
        buttonLsc.setText(getRandomLastScanned());
    }

    // Helper method to generate random quality
    private String getRandomQuality() {
        String[] qualities = {"Kualitas baik", "Kualitas buruk"};
        return qualities[new Random().nextInt(qualities.length)];
    }

    // Helper method to generate random count
    private int getRandomCount() {
        return new Random().nextInt(10) + 1; // Generates a random number between 1 and 10
    }

    // Helper method to generate random total fruits
    private String getRandomTotalFruits() {
        return String.valueOf(new Random().nextInt(100) + 1); // Generates a random number between 1 and 100
    }

    // Helper method to generate random last scanned date
    private String getRandomLastScanned() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());
        return sdf.format(new Date());
    }
}
