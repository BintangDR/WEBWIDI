package com.example.pblapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Tomato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);

        ImageButton arrowLeftButton = findViewById(R.id.arrow_left);
        arrowLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk kembali ke HomeActivity
                finish();
            }
        });

        // Generate random values for TextViews
        TextView txtKD = findViewById(R.id.txtKD);
        TextView txtSP = findViewById(R.id.txtSP);
        TextView txtLS = findViewById(R.id.txtLS);
        TextView txtLS1 = findViewById(R.id.txtLS1);
        TextView txtLS2 = findViewById(R.id.txtLS2);
        TextView txtHP = findViewById(R.id.txtHP);

        // Generate random values for Buttons
        Button buttonMS = findViewById(R.id.buttonMS);
        Button buttonSM = findViewById(R.id.buttonSM);
        Button buttonM = findViewById(R.id.buttonM);
        Button buttonTB = findViewById(R.id.buttonTB);
        Button buttonLsc = findViewById(R.id.buttonLsc);

        // Set random values for TextViews
        txtKD.setText(getRandomStatus("Matang Sempurna"));
        txtSP.setText(getRandomStatus("Setengah Matang"));
        txtLS.setText(getRandomStatus("Mentah"));
        txtLS1.setText(String.valueOf(new Random().nextInt(150)));  // Random total buah
        txtLS2.setText(getRandomLastScanned());
        txtHP.setText("Histori penyiraman");

        // Set random values for Buttons
        buttonMS.setText(String.valueOf(new Random().nextInt(10)));  // Random value for buttonMS
        buttonSM.setText(String.valueOf(new Random().nextInt(10)));  // Random value for buttonSM
        buttonM.setText(String.valueOf(new Random().nextInt(30)));  // Random value for buttonM
        buttonTB.setText(String.valueOf(new Random().nextInt(120)));  // Random value for buttonTB
        buttonLsc.setText(getRandomLastScanned());
    }

    // Helper method to generate random status
    private String getRandomStatus(String condition) {
        String[] statuses = {"2", "6", "23"};  // Example random values for buttons
        return condition + " " + statuses[new Random().nextInt(statuses.length)];
    }

    // Helper method to generate random last scanned date
    private String getRandomLastScanned() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());
        return sdf.format(new Date());
    }
}
