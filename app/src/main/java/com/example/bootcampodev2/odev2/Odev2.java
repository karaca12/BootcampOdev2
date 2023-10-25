package com.example.bootcampodev2.odev2;

public class Odev2 {
    public double soru1(double km){
        return km*0.621;
    }
    public double soru2(double kenar1,double kenar2){
        return kenar1*kenar2;
    }

    public int soru3(int sayi){
        int temp=1;
        if (sayi==0){
            return 1;
        }else if (sayi>1){
            for (int i=1;i<=sayi;i++){
                temp=i*temp;
            }
            return temp;
        }else {
            throw new RuntimeException("Bu sayının faktoriyeli alınamaz.");
        }
    }

    public int soru4(String kelime){
        int count=0;
        kelime=kelime.toLowerCase();
        for(int i=0;i<kelime.length();i++){
            if (kelime.charAt(i)=='e'){
                count++;
            }
        }
        return count;
    }

    public double soru5(int kenar){
        return ((kenar-2)*180)/kenar;
    }

    public double soru6(int gun){
        if(gun<18.75){
            return gun*320;
        }else {
            return 6000+((gun-18.75)*640);
        }
    }

    public double soru7(int dakika){
        int saat=dakika/60;
        return 40+(saat*10);
    }

}
