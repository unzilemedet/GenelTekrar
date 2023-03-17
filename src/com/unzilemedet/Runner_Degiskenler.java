package com.unzilemedet;

public class Runner_Degiskenler {
    public static void main(String[] args) {

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;

        // önemli
        l = b ; // l ye b yi atayabilirim long byte ı kapsar çünkü
        // s = i;  shorta int i atayamam short 16 bit iken int 32 bittir
        //Bunun için cast işlemi yapmalıyız.
        //integer olan değeri shorta uyarlayalım.
        s = (short)i; // cast -> eğer int değeri atandığı değerin sınırlarını aşıyor iseilgili datatype sınırlarını daraltır.

        //dilin default değerleri-> tamsayı için (int) ondalıklı için (double)
        double d = 1221.12121212;
        float f =1122.22121f;

        char karakter ='A';
        karakter = 64;

        System.out.println(karakter); // A karakterinin sembolü olan @ işaretini yazdırır ekrana
        System.out.println((int)karakter); //integer olarak 64  yazdırır ekrana

        String ifade = "günaydın herkese"; //references Data Type

        boolean durum = true; // false



    }
}
