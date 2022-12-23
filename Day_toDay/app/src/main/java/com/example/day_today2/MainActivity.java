package com.example.day_today2;

import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);
        Button signUpButton = findViewById(R.id.signUpButton);
        EditText emailText = findViewById(R.id.mailText);
        EditText passwordText = findViewById(R.id.passwordText);

        Kullanici muhammed = new Kullanici("mami", "yalman", "zekikurt", "zekikurt@gmail.com","05356131057");




        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(emailText.getText().toString().trim().length() > 0 && passwordText.getText().toString().trim().length() > 0){
                    Toast.makeText(getApplicationContext(),"Giris Yapıldı",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Lütfen bilgilerinizi giriniz!",Toast.LENGTH_LONG).show();
                }
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , KayitEkrani.class));
                //startActivity(new Intent());
            }
        });

    }
}