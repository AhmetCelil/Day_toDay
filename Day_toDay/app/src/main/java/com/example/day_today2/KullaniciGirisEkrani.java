package com.example.day_today2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KullaniciGirisEkrani extends AppCompatActivity {

    Button kullaniciGirisButonu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_giris_ekrani2);

        kullaniciGirisButonu = findViewById(R.id.kullanici_uygulama_giris);

        kullaniciGirisButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KullaniciGirisEkrani.this , GenelBilgiler.class));
            }
        });

    }
}