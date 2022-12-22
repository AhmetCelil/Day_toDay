package com.example.day_today2;

import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    Button kayitButonu, girisButonu;
    Button adminGirisButonu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kullanici muhammed = new Kullanici("mami", "yalman", "zekikurt", "zekikurt@gmail.com","05356131057");



        girisButonu = findViewById(R.id.ana_giris_yap);
        kayitButonu = findViewById(R.id.kayıt_ol);
        //VİEWBİNDİNG ÖĞREN

        final EditText isim = findViewById(R.id.isim);
        final EditText soyIsim= findViewById(R.id.soyisim);
        final EditText kullaniciAdi = findViewById(R.id.kullanıcı_adi);
        final EditText mail = findViewById(R.id.mail);
        final EditText telNo = findViewById(R.id.tel_no);
        final EditText kullaniciKodu = findViewById(R.id.kullanıcı_kodu);

        girisButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this , KullaniciGirisEkrani.class));

               /* String girilenAd = isim.getText().toString();
                String girilenSoyIsim = soyIsim.getText().toString();
                String girilenKullaniciAdi = kullaniciAdi.getText().toString();
                String girilenMail = mail.getText().toString();
                String girilenTelNo = telNo.getText().toString();
                String girilenKullaniciKodu = kullaniciKodu.getText().toString();
                kullaniciKodu.setText("girilen degerler, " + girilenAd + girilenSoyIsim);
                */
            }
        });


        adminGirisButonu = findViewById(R.id.admin_girisi);


        kayitButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , GenelBilgiler.class));
            }
        });

        adminGirisButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , AdminEkarani.class));
            }
        });

    }
}