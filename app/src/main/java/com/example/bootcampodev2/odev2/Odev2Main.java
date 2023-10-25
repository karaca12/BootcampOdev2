package com.example.bootcampodev2.odev2;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 odev=new Odev2();
        System.out.println("35km "+odev.soru1(35)+" mile eşittir.");
        System.out.println("Kenarları 6.3 ve 8.7 olan bir diktörtgenin alanı "+odev.soru2(6.3,8.7)+"'dır(dir).");
        System.out.println("8! = "+odev.soru3(8));
        System.out.println("'İletilebilmek' kelimesinde "+odev.soru4("İletilebilmek")+" tane 'e' harfi vardır.");
        System.out.println("Kenar sayısı 13 olan bir çokgenin tek bir iç açısı "+odev.soru5(13)+"'dır(dir).");
        System.out.println("25 gün çalışan biri "+odev.soru6(25)+"₺ kazanır.");
        System.out.println("330 dakika otoparkta kalan bir araç için ödenmesi gereken bedel: "+odev.soru7(330));
    }
}
