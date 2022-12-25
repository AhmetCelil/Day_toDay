package com.example.day_today2;

class OzelUye extends Musteri{
    String tcKimlikNo;


    public OzelUye(String isim, String soyIsim, String telefon, String email, String sifre, int ucret, String uyelikTipi) {
        super();
        this.tcKimlikNo = tcKimlikNo;
    }

    public OzelUye() {

    }

    @Override
    public int ucretBelirle(){
        System.out.println("ozel uye icin: " + ucret);
        return ucret;
    }
}

