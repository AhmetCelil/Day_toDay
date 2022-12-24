package com.example.day_today2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class KayitEkrani extends AppCompatActivity {

    public static String ucret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_kayit);

        Button odemeButton = findViewById(R.id.odemeIslemButton);
        EditText isimText = findViewById(R.id.isimText);
        EditText soyisimText = findViewById(R.id.soyisimText);
        EditText emailText = findViewById(R.id.emailText);
        EditText telefonText = findViewById(R.id.telefonText);

        RadioButton platinRadio = findViewById(R.id.platinRadio);
        RadioButton goldRadio = findViewById(R.id.goldRadio);
        RadioButton ozelRadio = findViewById(R.id.ozelRadio);

        TextView tckimlikLabel = findViewById(R.id.tckimlikLabel);
        EditText tckimlikText = findViewById(R.id.tckimlikText);


        if (ozelRadio.isChecked()) {
            tckimlikLabel.setVisibility(View.VISIBLE);
            tckimlikText.setVisibility(View.VISIBLE);
        } else {
            tckimlikLabel.setVisibility(View.INVISIBLE);
            tckimlikText.setVisibility(View.INVISIBLE);
        }

        ozelRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tckimlikLabel.setVisibility(View.VISIBLE);
                tckimlikText.setVisibility(View.VISIBLE);
            }
        });

        odemeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isimText.getText().toString().trim().length() > 0 && soyisimText.getText().toString().trim().length() > 0 && emailText.getText().toString().trim().length() > 0 && telefonText.getText().toString().trim().length() > 0) {

                    if (platinRadio.isChecked()) {
                        ucret = "1500";
                        startActivity(new Intent(KayitEkrani.this, OdemeEkrani.class));
                    } else if (goldRadio.isChecked()) {
                        ucret = "1000";
                        startActivity(new Intent(KayitEkrani.this, OdemeEkrani.class));
                    } else if (ozelRadio.isChecked()) {
                        ucret = "Ücretsiz";

                    } else {

                    }


                }


            }
        });


    }
}
