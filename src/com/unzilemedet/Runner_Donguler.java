package com.unzilemedet;

import java.util.Scanner;

public class Runner_Donguler {
    public static void main(String[] args) {

        for(int i = 0 ; i<10 ; i++){
            System.out.println(" UNZILE ");
        }

        int sayac=0;
        while(sayac<10){
            System.out.println("MEDET");
            sayac ++ ;
        }

        Scanner scanner = new Scanner(System.in);
        int secim = 1 ;
        //seçim değeri 0 değilse dönmeye devam et
        // secim  != 0
        // secim = 0 => sıfır , sıfır a eşit değil midir ? --->false
        while(secim != 0){
            System.out.print("Çıkmak için 0 ı seçiniz ...:");
            secim =  scanner.nextInt();
        }
        System.out.println("Program Bitti");

        secim = 0;
        do{
            System.out.print("Do...While çıkmak için O ı seçiniz...:");
            secim = scanner.nextInt();
        }while(secim !=0);
        System.out.println("Program bitti");



    }
}
