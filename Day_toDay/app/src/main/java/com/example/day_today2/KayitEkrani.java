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

    public static String ucret;
    public static Kullanici kayitEdilenKullanici = new Kullanici();


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
                        ucret = "1500";
                        kayitEdilenKullanici = new Kullanici(isimText.getText().toString(), soyisimText.getText().toString(), telefonText.getText().toString(), emailText.getText().toString(), sifreText.getText().toString(), "platin");
                        startActivity(new Intent(KayitEkrani.this, OdemeEkrani.class));
                    } else if (goldRadio.isChecked()) {
                        ucret = "1000";
                        kayitEdilenKullanici = new Kullanici(isimText.getText().toString(), soyisimText.getText().toString(), telefonText.getText().toString(), emailText.getText().toString(), sifreText.getText().toString(), "gold");
                        startActivity(new Intent(KayitEkrani.this, OdemeEkrani.class));
                    } else if (ozelRadio.isChecked() && tckimlikText.getText().toString().trim().length() > 0) {
                        ucret = "Ücretsiz";
                        kayitEdilenKullanici = new Kullanici(isimText.getText().toString(), soyisimText.getText().toString(), telefonText.getText().toString(), emailText.getText().toString(), sifreText.getText().toString(), "ozel");
                        startActivity(new Intent(KayitEkrani.this, OdemeEkrani.class));
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Lütfen bilgilerinizi giriniz!", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
