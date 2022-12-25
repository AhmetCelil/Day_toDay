package com.example.day_today2;

public class PlatinUye extends Musteri {
    String egitmenSec;

    public PlatinUye(String isim, String soyIsim, String telefon, String email, String sifre, String egitmenSec, int ucret, String uyelikTipi) {
        super();
        this.egitmenSec = egitmenSec;
    }

    public void setEgitmenSec(String egitmenSec) {
        this.egitmenSec = egitmenSec;
    }

    @Override
    public int ucretBelirle(){
        System.out.println("gold üye için: " + ucret);
        return ucret;
    }
}
