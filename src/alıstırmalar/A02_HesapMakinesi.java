package alıstırmalar;

import java.util.Scanner;

public class A02_HesapMakinesi {
    /*   2.Soru:
          Problem Tanımı :
           Basit 4 işlem yapan bir hesap makinesi kodlayınız....
           Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
           Kullanicidan iki sayi girmesini isteyiniz.
           Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
         */
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.print("Toplama için + \nÇıkarma için - \nÇarpma için * \nBölme için / \ntuşlayınız : ");
        char secim = scan.next().charAt(0);

        switch (secim) {
            case '+':
                toplamaYap();
                break;
            case '-':
                cıkarmaYap();
                break;
            case '*':
                carpmaYap();
                break;
            case '/':
                bolmeYap();
                break;
            default:
                System.out.println("Hatalı giriş!!");


        }


    }

    private static void bolmeYap() {
        System.out.print("Bölme işlemi için 2 sayı gırınız : ");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
        double bolum=sayı1/sayı2;
        System.out.println(sayı1+" / "+sayı2+" = "+bolum);
    }

    private static void carpmaYap() {
        System.out.print("Çarpma işlemi için 2 sayı gırınız : ");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
        int carpım=sayı1*sayı2;
        System.out.println(sayı1+" * "+sayı2+" = "+carpım);
    }

    private static void cıkarmaYap() {
        System.out.print("Çıkrma işlemi için 2 sayı gırınız : ");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
        int fark=sayı1-sayı2;
        System.out.println(sayı1+" - "+sayı2+" = "+fark);
    }

    private static void toplamaYap() {
        System.out.print("Toplamak işlemi için 2 sayı gırınız : ");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
        int toplam=sayı1+sayı2;
        System.out.println(sayı1+" + "+sayı2+" = "+toplam);
    }
}
