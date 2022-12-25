package com.example.day_today2;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class OdemeEkrani extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odeme);

        TextView ucretText = findViewById(R.id.ucretText);
        Button odemeTamamlaButon = findViewById(R.id.odemeTamamlaButton);

        ucretText.setText("Ödenecek Tutar " + KayitEkrani.ucret);

        FirebaseFirestore firestore = FirebaseFirestore.getInstance();


        Map<String, Object> user = new HashMap<>();

        odemeTamamlaButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.put("isim", KayitEkrani.kayitEdilenKullanici.isim);
                user.put("soyisim", KayitEkrani.kayitEdilenKullanici.soyIsim);
                user.put("telefon", KayitEkrani.kayitEdilenKullanici.telefon);
                user.put("email", KayitEkrani.kayitEdilenKullanici.email);
                user.put("sifre", KayitEkrani.kayitEdilenKullanici.sifre);
                user.put("uyelikTipi", KayitEkrani.kayitEdilenKullanici.uyelikTipi);


                firestore.collection("users").add(user).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(getApplicationContext(), "Kaydınız Oluşturulmuştur, Giriş Yapabilirsiniz", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(OdemeEkrani.this, MainActivity.class));
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), "Sunucu Hatası, Daha Sonra Tekrar Deneyin", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(OdemeEkrani.this, MainActivity.class));
                    }
                });
            }
        });


    }
}
