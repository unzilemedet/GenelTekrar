package com.unzilemedet;

public class Runner_Operatorler {
    public static void main(String[] args) {
        /*
        * işlem =>      + , - , * , / , %
        * arttırım/eksiltim  =>  ++   --
        * işlemsel atama =>     += , -=  , *= , /= , %=
        * < , > , >= , <= , ==  , !=
        * ||  ,  &&
        * */

        int s1 = 10 , s2 = 4 , sonuc ;
        sonuc = s1 + s2 ;
        sonuc = s1 - s2 ;
        sonuc = s1 * s2 ;
        sonuc = s1 / s2 ;
        sonuc = s1 % s2 ;

      //  sonuc = s1++ ; //++ sonda ise artma işlemi sonraki kullanımda olur
        System.out.println("Sonuç.....: " + sonuc); // 10 yazdırır ekrana
        System.out.println("s1........: " + s1);    // 11 yazdırır ekrana


        sonuc = ++s2 ; //++ önde  ise önce  arttırım sonra atama yapılır
        System.out.println("Sonuç.....: " + sonuc); // 11 yazdırır ekrana
        System.out.println("s1........: " + s1);    // 11 yazdırır ekrana


        sonuc = 100 ;
        s1 = 15 ;
        // sonuc değerine s1 i eklemek istiyorum
        // sonuc = 100 + 15 ;
        sonuc = sonuc + s1; //100 -->115
        sonuc += s1 ; // 115-->130
        System.out.println(sonuc);


        String dbKullaniciAdi= "Admin";
        String girisKullaniciAdi = "Admin";
        boolean durum = dbKullaniciAdi == girisKullaniciAdi; // true ya da false değerini verir
        System.out.println(durum); // true


        String dbSifre = "12345";
        String girisSifre = "1234";
        durum = dbKullaniciAdi == girisKullaniciAdi && dbSifre==girisSifre ; // tru,false
        System.out.println(durum);  //false

    }
}
