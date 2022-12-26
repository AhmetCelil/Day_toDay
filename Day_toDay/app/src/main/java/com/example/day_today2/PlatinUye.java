package com.example.day_today2;

public class PlatinUye extends Musteri {
    String egitmenSec;

    public PlatinUye(String isim, String soyIsim, String telefon, String email, String sifre, String egitmenSec) {
        super();
        this.egitmenSec = egitmenSec;
    }

    public void setEgitmenSec(String egitmenSec) {
        this.egitmenSec = egitmenSec;
    }
}
