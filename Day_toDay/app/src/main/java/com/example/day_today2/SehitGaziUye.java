package com.example.day_today2;

public class SehitGaziUye extends OzelUye{
    public SehitGaziUye(String isim, String soyIsim, String telefon, String email, String sifre, String uyelikTipi) {
        super();
    }
    SehitGaziUye(){
        super();
    }


    @Override
    public int ucretBelirle(){
        System.out.println("gold üye için: " + ucret);
        return ucret;
    }
}
