package _07_Method_Creation.Sorular;

import java.util.InputMismatchException;
import java.util.Scanner;

public class soru_05 {

         /*
            Problem Tanımı :
            Kullanıcıdan alınan  bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
            Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
            ORNEK:
            INPUT     : 6  28  1 2 4 7 14 =28
            OUTPUT : 1,2,3
                          1+2+3 = 6 = 6 (Mükemmel)
            */
    public static void main(String[] args) {

        mukemmelSayıBul();

    }

    private static void mukemmelSayıBul() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gırınız : ");
        try {
            int sayı = scan.nextInt();
            int toplam=0;
            for (int i = 1; i <sayı ; i++) {
                if (sayı%i==0){
                    toplam +=i;
                }
            }

            if (toplam==sayı){
                System.out.println("girilen sayı mukemmel sayı");
            }else{
                System.out.println("gırılen sayı mukemmel degıl");
            }
        } catch (InputMismatchException e) {

            System.out.println("yanlış deger gırdınız. gırdıgınız deger bır tam sayı olmalı");
            mukemmelSayıBul();
        }
    }


}
