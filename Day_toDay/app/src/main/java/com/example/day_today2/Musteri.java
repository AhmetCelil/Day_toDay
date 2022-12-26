package com.example.day_today2;

class Musteri extends Kullanici{
    protected int ucret;

    public Musteri(String isim, String soyIsim, String telefon, String email, String sifre) {
        super(isim, soyIsim, telefon, email, sifre, "platin");
    }

    public Musteri() {
        super();
    }
}
