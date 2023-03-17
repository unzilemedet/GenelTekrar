package com.unzilemedet;

public class Runner_Diziler {
    public static void main(String[] args) {
        /*
        * ilk index -> 0
        * son index -> (boyut-1 ya da eleman sayısı -1)
        * */
        int[] sayi_dizisi = new int[5]; //{0,0,0,0,0} boyutu 5
        int[] sayi_dizisi1 = {0,1,2}; // boyutu 3

        //          index       önce   ->  {0,0,0,0,0}
        sayi_dizisi[3] = 123; //sonra  ->  {0,0,0,123,0}
        System.out.print("{");
        System.out.print(sayi_dizisi[0] + ",");
        System.out.print(sayi_dizisi[1] + ",");
        System.out.print(sayi_dizisi[2] + ",");
        System.out.print(sayi_dizisi[3] + ",");
        System.out.print(sayi_dizisi[4] );
        // System.out.println(sayi_dizisi[5] + ",");
        // System.out.println(sayi_dizisi[6] + ","); hata fırlatır
        System.out.println("}");
    }
}
