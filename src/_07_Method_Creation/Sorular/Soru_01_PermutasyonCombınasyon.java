package _07_Method_Creation.Sorular;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soru_01_PermutasyonCombınasyon {
  static  Scanner scan = new Scanner(System.in);
    /*  Problem Tanımı
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Verilen iki sayının permütasyonunu bulan kodu yazınız.
        Hatırlatma P(n,r) = n! / (n-r)!

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        permütasyon: 32760

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
        permütasyon: 60
      */
    public static void main(String[] args) {
islemMenu();


    }

    private static void islemMenu() {
        System.out.print("\n=========     İŞLEM MENÜSÜ      =========" +
                "\n1.Permutasyon Hesaplama " +
                "\n2.Combınasyon Hesaplama " +
                "\n3.Çıkış" +
                "\n==========================================" +
                "\nyapmak istedıgınız ıslemı secınız : ");
      int secim=scan.nextInt();
        switch (secim){
            case 1:
                permutasyon();
                islemMenu();
                break;
            case 2:
           combinasyon();
           islemMenu();
           break;
            case 3:
            cıkıs();
            break;
            default:
                System.out.println("hatalı secım yaptınız tekrar deneyınız ..");
                islemMenu();
        }
    }

    private static void combinasyon() {
        System.out.print("\n=======    COMBINASYON HEAPLAMA    ======= \n");

        try {
            System.out.print("Combinasyonu hesaplanacak sayıyı gırınız : ");
          int  sayi1=scan.nextInt();
            System.out.print(sayi1+" sayısının kaclı combınasyonunu almak istiyorsunuz.");
           int sayi2=scan.nextInt();

            if (sayi1<sayi2){
                System.out.println("permutasyonu alınacak sayıdan daha buyuk sayı gıremezsınız. Tekrar deneyınız.");
                combinasyon();
            }else {
                long combinasyon=faktoryelBul(sayi1)/(faktoryelBul(sayi1-sayi2)*faktoryelBul(sayi2));
                System.out.println("C("+sayi1+","+sayi2+")= "+combinasyon);
            }
            System.out.print("Devam etmek için herhangi bır harfi tuslayınız : ");
            scan.next();

        } catch (InputMismatchException e) {
            System.out.println("\ntam sayı gırmenız gerekıyor...");

        }


    }

    private static void cıkıs() {
        System.out.println("iyi gunler...");
    }

    private static void permutasyon() {
        System.out.print("\n=======    PERMUTASYON HEAPLAMA    ======= \n");


        try {
            System.out.print("Permutasyonu hesaplanacak sayıyı gırınız : ");
          int   sayi1=scan.nextInt();
            System.out.print(sayi1+" sayısının kaclı permutasyonunu almak istiyorsunuz.");
           int  sayi2=scan.nextInt();
            if (sayi1<sayi2){
                System.out.println("permutasyonu alınacak sayıdan daha buyuk sayı gıremezsınız. Tekrar deneyınız.");
                permutasyon();
            }else {
                long permutasyon=faktoryelBul(sayi1)/faktoryelBul(sayi1-sayi2);
                System.out.println("P("+sayi1+","+sayi2+")= "+permutasyon);
            }
            System.out.print("Devam etmek için herhangi bır harfi tuslayınız : ");
            scan.next();
        } catch ( InputMismatchException e ) {
            System.out.println("\ntam sayı gırmenız gerekıyor...");

        }


    }

    public  static long faktoryelBul(int sayi) {
        if (sayi<=0) return 1;
        return sayi*faktoryelBul(sayi-1);
    }


}
