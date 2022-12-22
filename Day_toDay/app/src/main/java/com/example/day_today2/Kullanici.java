package com.example.day_today2;

public class Kullanici {
    String isim, soyIsim, kullaniciAdi, mail, telefon;
    // protected static int kullaniciSayisi = 0;

    Kullanici(String isim, String soyIsim, String kullaniciAdi, String mail, String telefon){
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.kullaniciAdi = kullaniciAdi;
        this.mail = mail;
        this.telefon = telefon;

        //kullaniciSayisi += 1;
        //System.out.println(isim);
    }

    public Kullanici() {
    }
}
