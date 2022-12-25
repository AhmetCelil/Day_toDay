package com.example.day_today2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class KayitEkrani extends AppCompatActivity {

   // public static String ucret;
    public static Musteri kayitEdilenKullanici = new Musteri();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_kayit);

        Button odemeButton = findViewById(R.id.odemeIslemButton);

        EditText isimText = findViewById(R.id.isimText);
        EditText soyisimText = findViewById(R.id.soyisimText);
        EditText emailText = findViewById(R.id.emailText);
        EditText telefonText = findViewById(R.id.telefonText);
        EditText sifreText = findViewById(R.id.passwordText);

        RadioButton platinRadio = findViewById(R.id.platinRadio);
        RadioButton goldRadio = findViewById(R.id.goldRadio);
        RadioButton ozelRadio = findViewById(R.id.ozelRadio);

        TextView tckimlikLabel = findViewById(R.id.tckimlikLabel);
        EditText tckimlikText = findViewById(R.id.tckimlikText);

        tckimlikLabel.setVisibility(View.INVISIBLE);
        tckimlikText.setVisibility(View.INVISIBLE);

        ozelRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tckimlikLabel.setVisibility(View.VISIBLE);
                tckimlikText.setVisibility(View.VISIBLE);
            }
        });

        platinRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tckimlikLabel.setVisibility(View.INVISIBLE);
                tckimlikText.setVisibility(View.INVISIBLE);
            }
        });

        goldRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tckimlikLabel.setVisibility(View.INVISIBLE);
                tckimlikText.setVisibility(View.INVISIBLE);
            }
        });

        odemeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isimText.getText().toString().trim().length() > 0 && soyisimText.getText().toString().trim().length() > 0 && emailText.getText().toString().trim().length() > 0 && telefonText.getText().toString().trim().length() > 0) {

                    if (platinRadio.isChecked()) {
                        kayitEdilenKullanici = new PlatinUye(isimText.getText().toString(), soyisimText.getText().toString(), telefonText.getText().toString(), emailText.getText().toString(), sifreText.getText().toString(), "ayberk", 1500, "platin uye");
                        startActivity(new Intent(KayitEkrani.this, OdemeEkrani.class));
                    } else if (goldRadio.isChecked()) {
                       // ucret = "1000";
                        kayitEdilenKullanici = new GoldUye(isimText.getText().toString(), soyisimText.getText().toString(), telefonText.getText().toString(), emailText.getText().toString(), sifreText.getText().toString(), "hafta içi", 1000, "gold uye");
                        startActivity(new Intent(KayitEkrani.this, OdemeEkrani.class));

                    } else if (ozelRadio.isChecked() && tckimlikText.getText().toString().trim().length() == 11) {
                        //ucret = "Ücretsiz";
                        kayitEdilenKullanici = new OzelUye(isimText.getText().toString(), soyisimText.getText().toString(), telefonText.getText().toString(), emailText.getText().toString(), sifreText.getText().toString(), 0 , "ozel uye");
                        startActivity(new Intent(KayitEkrani.this, OdemeEkrani.class));

                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Lütfen bilgilerinizi giriniz!", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
