package com.example.day_today2;

class Musteri extends Kullanici{

    protected int ucret;
    protected String uyelikTipi;
    protected static int kullaniciSayisi = 0;

    public Musteri(String isim, String soyIsim, String telefon, String email, String sifre, int ucret, String uyelikTipi) {
        super(isim, soyIsim, telefon, email, sifre);
        this.ucret = ucret;
        this.uyelikTipi = uyelikTipi;
        kullaniciSayisi++;
        System.out.println(kullaniciSayisi);
    }

    public Musteri() {
        super();
    }

    public int ucretBelirle(){
        return ucret;
    }
}
