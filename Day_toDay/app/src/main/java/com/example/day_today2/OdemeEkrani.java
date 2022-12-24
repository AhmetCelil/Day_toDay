package com.example.day_today2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OdemeEkrani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odeme);


        TextView ucretText = findViewById(R.id.ucretText);

        ucretText.setText("Ödenecek Tutar " + KayitEkrani.ucret);

    }
}
