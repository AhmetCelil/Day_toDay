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
        EditText yas = findViewById(R.id.girilen_yas);
        EditText boy = findViewById(R.id.girilen_boy);
        EditText kilo = findViewById(R.id.girilen_kilo);

        RadioButton cinsiyet_erkek = findViewById(R.id.erkek_butonu);
        RadioButton cinsiyet_kadın = findViewById(R.id.kadın_butonu);

        RadioButton aktiviteDusuk = findViewById(R.id.düşük_düzey);
        RadioButton aktiviteOrta = findViewById(R.id.orta_düzey);
        RadioButton aktiviteNormal = findViewById(R.id.normal_düzey);
        RadioButton aktiviteAktif = findViewById(R.id.aktif_düzey);

        RadioButton hedefVermek = findViewById(R.id.kilo_vermek);
        RadioButton hedefAlmak = findViewById(R.id.kilo_almak);
        RadioButton hedefSabitKal = findViewById(R.id.sabit_kalmak);
        RadioButton hedefKas = findViewById(R.id.kas_kütlesi);

//yazilacak outputlar

         EditText kalori_bari = findViewById(R.id.kalori_bari);
         EditText protein_bari = findViewById(R.id.protein_bari);
         EditText karbonhidrat_bari = findViewById(R.id.karbonhidrat_bari);
         EditText yag_bari = findViewById(R.id.yag_bari);
         EditText su_bari = findViewById(R.id.su_bari);
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
                double KaloriMiktari = 0f;

                //kalori.setText(String.valueOf(yasDouble));
/*
                if(kiloAlmak == false && girilenErkek == false && dusuk == false){
                    KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.1;
                }
                if(kiloVermek == false && girilenErkek == false && dusuk == false){
                    KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) * 0.9;
                }*/

                if(girilenErkek == false){
                    if(dusuk == false){
                        if(kiloAlmak == false && girilenErkek == false && dusuk == false){
                            KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.1;
                        }
                        if(kiloVermek == false && girilenErkek == false && dusuk == false){
                            KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) * 0.9;
                        }
                        if(sabitKalmak == false){
                            KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                        }
                        if(kasYapmak == false){
                            KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.05;
                        }
                        //KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                    }
                    if(orta == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.3 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.1;
                        }
                        if(kiloVermek == false){
                            KaloriMiktari = 1.3 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) * 0.9;
                        }
                        if(sabitKalmak == false){
                            KaloriMiktari = 1.3 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                        }
                        if(kasYapmak == false){
                            KaloriMiktari = 1.3 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.05;
                        }
                        //KaloriMiktari = 1.3 * (66.5 +(13.75 * kiloDouble) + (5 * boyDouble) - (6.77* yasDouble));
                    }
                    if(normal == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.4 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.1;
                        }
                        if(kiloVermek == false){
                            KaloriMiktari = 1.4 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) * 0.9;
                        }
                        if(sabitKalmak == false){
                            KaloriMiktari = 1.4 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                        }
                        if(kasYapmak == false){
                            KaloriMiktari = 1.4 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.05;
                        }

                        //KaloriMiktari = 1.4 * (66.5 +(13.75 * kiloDouble) + (5 * boyDouble) - (6.77* yasDouble));
                    }
                    if(yuksek == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.5 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.1;
                        }
                        if(kiloVermek == false){
                            KaloriMiktari = 1.5 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) * 0.9;
                        }
                        if(sabitKalmak == false){
                            KaloriMiktari = 1.5 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                        }
                        if(kasYapmak == false){
                            KaloriMiktari = 1.5 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble)) *1.05;
                        }
                        //KaloriMiktari = (1.5 * ((66.5) + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77* yasDouble)));
                    }
                }
                if(girilenKadin == false){
                    if(dusuk == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.2 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *1.1;
                        }
                        if(kiloVermek == false){
                            KaloriMiktari = 1.2 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *0.9;
                        }
                        if(sabitKalmak == false){
                            KaloriMiktari = 1.2 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble));
                        }
                        if(kasYapmak == false){
                            KaloriMiktari = 1.2 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *1.05;
                        }
                        //KaloriMiktari = 1.2 * (66.5 + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77 * yasDouble));
                    }
                    if(orta == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.3 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *1.1;
                        }
                        if(kiloVermek == false){
                            KaloriMiktari = 1.3 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *0.9;
                        }
                        if(sabitKalmak == false){
                            KaloriMiktari = 1.3 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble));
                        }
                        if(kasYapmak == false){
                            KaloriMiktari = 1.2 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *1.05;
                        }
                        //KaloriMiktari = 1.3 * (66.5 +(13.75 * kiloDouble) + (5 * boyDouble) - (6.77* yasDouble));
                    }
                    if(normal == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.4 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *1.1;
                        }
                        if(kiloVermek == false){
                            KaloriMiktari = 1.4 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *0.9;
                        }
                        if(sabitKalmak == false){
                            KaloriMiktari = 1.4 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble));
                        }
                        if(kasYapmak == false){
                            KaloriMiktari = 1.4 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *1.05;
                        }

                        //KaloriMiktari = 1.4 * (66.5 +(13.75 * kiloDouble) + (5 * boyDouble) - (6.77* yasDouble));
                    }
                    if(yuksek == false){
                        if(kiloAlmak == false){
                            KaloriMiktari = 1.5 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *1.1;
                        }
                        if(kiloVermek == false){
                            KaloriMiktari = 1.5 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) * 0.9;
                        }
                        if(sabitKalmak == false){
                            KaloriMiktari = 1.5 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble));
                        }
                        if(kasYapmak == false){
                            KaloriMiktari = 1.5 * (655.1 + (9.56 * kiloDouble) + (1.85 * boyDouble) - (4.67 * yasDouble)) *1.05;
                        }
                        //KaloriMiktari = (1.5 * ((66.5) + (13.75 * kiloDouble) + (5 * boyDouble) - (6.77* yasDouble)));
                    }
                }

                double karbonhidratMiktari = KaloriMiktari * 0.055;
                double proteinMiktari = KaloriMiktari * 0.15 / 4.184;
                double yagMiktari = KaloriMiktari * 0.15 / 4.184;
                double suMiktari = kiloDouble * 0.033;

                suMiktari = Math.rint(suMiktari * 100) / 100;


                /*else if(girilenKadin){

                }*/
                //String girilenErkekStr = String.valueOf(girilenErkek);
                String kaloriStr = String.valueOf(Math.floor(KaloriMiktari));
                String karbonhidratStr = String.valueOf(Math.floor(karbonhidratMiktari));
                String proteinStr = String.valueOf(Math.floor(proteinMiktari));
                String yagStr = String.valueOf(Math.floor(yagMiktari));
                String suStr = String.valueOf(suMiktari);
                //String str = String.valueOf(Math.floor(kiloAlmak));

                su_bari.setText(suStr + " litre");
                yag_bari.setText(yagStr + " gram");
                protein_bari.setText(proteinStr+ " gram");
                karbonhidrat_bari.setText(karbonhidratStr + " gram");
                kalori_bari.setText(kaloriStr + " kalori");
                //yag.setText(girilenYas+ "  "+ girilenErkek);

                KaloriMiktari = 0;

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