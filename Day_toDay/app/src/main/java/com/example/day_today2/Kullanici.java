package com.example.day_today2;

public class Kullanici {
    String isim, soyIsim, telefon, email, sifre;
    protected static int kullaniciSayisi = 0;

    public Kullanici(String isim, String soyIsim, String telefon, String email, String sifre, String platin){
        setIsim(isim);
        setSoyIsim(soyIsim);
        setTelefon(telefon);
        setEmail(email);
        setSifre(email);
    }

    public Kullanici() {

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public static int getKullaniciSayisi() {
        return kullaniciSayisi;
    }

    public static void setKullaniciSayisi(int kullaniciSayisi) {
        Kullanici.kullaniciSayisi = kullaniciSayisi;
    }
}
