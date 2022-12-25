package com.example.day_today2;

public class GoldUye extends Musteri{

    protected String gunSec;

    public GoldUye(String isim, String soyIsim, String telefon, String email, String sifre, String gunSec, int ucret, String uyelikTipi) {
        super();
        this.gunSec = gunSec;
    }

    @Override
    public int ucretBelirle(){
        System.out.println("gold üye için: " + ucret);
        return ucret;
    }
}
