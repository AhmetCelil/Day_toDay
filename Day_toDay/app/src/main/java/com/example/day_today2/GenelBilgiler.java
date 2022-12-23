package com.example.day_today2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class GenelBilgiler extends AppCompatActivity {
    Button hesapla, idmanGör;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genel_bilgiler);
        hesapla = findViewById(R.id.besin_hesapla);



// alınacak inputlar
        final EditText yas = findViewById(R.id.girilen_yas);
        final EditText boy = findViewById(R.id.girilen_boy);
        final EditText kilo = findViewById(R.id.girilen_kilo);

        final RadioButton cinsiyet_erkek = findViewById(R.id.erkek_butonu);
        final RadioButton cinsiyet_kadın = findViewById(R.id.kadın_butonu);

        final RadioButton aktiviteDusuk = findViewById(R.id.düşük_düzey);
        final RadioButton aktiviteOrta = findViewById(R.id.orta_düzey);
        final RadioButton aktiviteNormal = findViewById(R.id.normal_düzey);
        final RadioButton aktiviteAktif = findViewById(R.id.aktif_düzey);

        final RadioButton hedefVermek = findViewById(R.id.kilo_vermek);
        final RadioButton hedefAlmak = findViewById(R.id.kilo_almak);
        final RadioButton hedefSabitKal = findViewById(R.id.sabit_kalmak);
        final RadioButton hedefKas = findViewById(R.id.kas_kütlesi);

//yazilacak outputlar

        final EditText kalori_bari = findViewById(R.id.kalori_bari);
        final EditText protein_bari = findViewById(R.id.protein_bari);
        final EditText karbonhidrat_bari = findViewById(R.id.karbonhidrat_bari);
        final EditText yag_bari = findViewById(R.id.yag_bari);
        final EditText su_bari = findViewById(R.id.su_bari);
/*
        final EditText protein = findViewById(R.id.protein_bari);
        final EditText karbonhidrat = findViewById(R.id.karbonhidrat_bari);
        final EditText su = findViewById(R.id.su_bari);
        final EditText yag = findViewById(R.id.yag_bari);
*/

        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String girilenYas = yas.getText().toString();
                String girilenBoy = boy.getText().toString();
                String girilenKilo = kilo.getText().toString();

                boolean girilenErkek = Boolean.parseBoolean(cinsiyet_erkek.getText().toString());
                boolean girilenKadin = Boolean.parseBoolean(cinsiyet_kadın.getText().toString());

                boolean dusuk = Boolean.parseBoolean(aktiviteDusuk.getText().toString());
                boolean orta = Boolean.parseBoolean(aktiviteOrta.getText().toString());
                boolean normal = Boolean.parseBoolean(aktiviteNormal.getText().toString());
                boolean yuksek = Boolean.parseBoolean(aktiviteAktif.getText().toString());

                boolean kiloAlmak = Boolean.parseBoolean(hedefAlmak.getText().toString());
                boolean kiloVermek = Boolean.parseBoolean(hedefVermek.getText().toString());
                boolean sabitKalmak = Boolean.parseBoolean(hedefSabitKal.getText().toString());
                boolean kasYapmak = Boolean.parseBoolean(hedefKas.getText().toString());

                double yasDouble = Double.parseDouble(girilenYas);
                double boyDouble = Double.parseDouble(girilenBoy);
                double kiloDouble = Double.parseDouble(girilenKilo);
                double KaloriMiktari = 0;

                //kalori.setText(String.valueOf(yasDouble));

                if(girilenErkek == false){
                    if(dusuk == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.1;
                        }else if(kiloVermek == false){
                            KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) * 0.9;
                        }else if(sabitKalmak == false){
                            KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                        }else if(kasYapmak == false){
                            KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.05;
                        }
                        //KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                    }
                    if(orta == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.3 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.1;
                        }else if(kiloVermek == false){
                            KaloriMiktari = 1.3 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) * 0.9;
                        }else if(sabitKalmak == false){
                            KaloriMiktari = 1.3 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                        }else if(kasYapmak == false){
                            KaloriMiktari = 1.3 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.05;
                        }
                        //KaloriMiktari = 1.3 * (66.5 +(13.75 * kiloDouble) + (5 * boyDouble) - (6.77* yasDouble));
                    }
                    if(normal == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.4 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.1;
                        }else if(kiloVermek == false){
                            KaloriMiktari = 1.4 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) * 0.9;
                        }else if(sabitKalmak == false){
                            KaloriMiktari = 1.4 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                        }else if(kasYapmak == false){
                            KaloriMiktari = 1.4 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.05;
                        }

                        //KaloriMiktari = 1.4 * (66.5 +(13.75 * kiloDouble) + (5 * boyDouble) - (6.77* yasDouble));
                    }
                    if(yuksek == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.5 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.1;
                        }else if(kiloVermek == false){
                            KaloriMiktari = 1.5 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) * 0.9;
                        }else if(sabitKalmak == false){
                            KaloriMiktari = 1.5 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                        }else if(kasYapmak == false){
                            KaloriMiktari = 1.5 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.05;
                        }
                        //KaloriMiktari = (1.5 * ((66.5) + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77* yasDouble)));
                    }
                }

                double karbonhidratMiktarı = KaloriMiktari * 0.055;

                
                /*else if(girilenKadin){

                }*/
                //String girilenErkekStr = String.valueOf(girilenErkek);
                String kaloriStr = String.valueOf(KaloriMiktari);
                String karbonhidratStr = String.valueOf(karbonhidratMiktarı);

                karbonhidrat_bari.setText(karbonhidratStr);
                kalori_bari.setText(kaloriStr);
                //yag.setText(girilenYas+ "  "+ girilenErkek);

            }
        });

        idmanGör = findViewById(R.id.idman_gor_butonu);
        idmanGör.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GenelBilgiler.this , KullaniciIdmanGor.class));
            }
        });
        //System.out.println(1.5 * ((66.5) + (13.75 * 2) + (5 * 2) - (6.77* 2)));
    }


}