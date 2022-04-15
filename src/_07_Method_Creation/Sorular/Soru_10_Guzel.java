package _07_Method_Creation.Sorular;

import java.util.Scanner;

public class Soru_10_Guzel {
    /*
        Problem Tanımı :
        EvenOddNums isminde bir method oluşturun.
        Bu yöntem String olan bir parametreyi kabul etsin.
        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        Sayıların her basamağındaki rakam çiftse toplayın, tekse çıkartın.
        toplam sonucu yazdırın.
        İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.

        For example :
        String =  "6678421312"
        6+6-7+8+4+2-1-3-1+2
        sonuç 16 olmalı
     */

    public static void main(String[] args) {

        toplaCıkar();

    }

    private static void toplaCıkar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("10 haneli bir sayı gırınız : ");
        String sayı = scan.nextLine();
        int sonuc = 0;


        int rakam = 0;
        try {
            for (int i = 0; i < sayı.length(); i++) {
                rakam = Integer.parseInt(sayı.substring(i, i + 1));
                if (rakam % 2 == 0) {
                    sonuc += rakam;
                } else {
                    sonuc -= rakam;
                }
            }
            System.out.println("sonuc : " + sonuc);
        } catch (NumberFormatException e) {
            System.out.println("dum degerler sayı olmalı. yenıden deneyınız ");
            toplaCıkar();
        }

    }

}





