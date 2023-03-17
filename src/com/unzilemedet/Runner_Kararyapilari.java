package com.unzilemedet;

public class Runner_Kararyapilari {
    public static void main(String[] args) {
        if(true){
            System.out.println("Koşul doğru");
        }

        int s1=10, s2=5;
        //hangi sayı büyük ise onu ekrana yazdır.
        if(s1>s2){
            System.out.println("Büyük sayı : " + s1);
        }else{
            System.out.println("Büyük sayı : " + s2);
        }


        boolean durum = false ;
        if(durum){
            System.out.println("Durum true");
        }else{
            System.out.println("Durum false");
        }


        s1 = -5 ;
        s2 = -1 ;
        int s3 =-22;

        if(s1>s2 && s1>s3)
            System.out.println("Büyük sayı :" + s1);
        else if (s2>s1 && s2>s3)
            System.out.println("Büyük sayı :" + s2);
        else
            System.out.println("Büyük sayı :" + s3);


    }
}















