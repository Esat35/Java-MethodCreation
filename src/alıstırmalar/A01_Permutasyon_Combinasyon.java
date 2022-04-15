package alıstırmalar;

import java.util.Scanner;

public class A01_Permutasyon_Combinasyon {
   static Scanner scan=new Scanner(System.in);
    /*  1.Soru:
      Problem Tanımı
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

        System.out.print("1.Permutasyon bulma \n2.Combinasyan bulma\nyapmak istediginiz işlemi seciniz : ");

        int secim=scan.nextInt();

       switch(secim){
           case 1:
               permutasyonBul();

               break;

               case 2:
                  combinasyonBul();
                   break;

           default:
               System.out.println("hatalı secım!!");
       }




    }

    private static void combinasyonBul() {
        System.out.println("Combinasyon bulmak için 2 sayı gırınız :");
        System.out.print("n : ");
        int n =scan.nextInt();
        System.out.print("r : ");
        int  r =scan.nextInt();

        long combinasyon=faktoriyelBul(n)/(faktoriyelBul(n-r)*faktoriyelBul(r));
        System.out.println("C("+n+","+r+")= "+combinasyon);
    }

    private static void permutasyonBul() {

        System.out.println("permutasyon bulmak için 2 sayı gırınız :");
        System.out.print("n : ");
        int n =scan.nextInt();
        System.out.print("r : ");
        int r =scan.nextInt();

        long permütasyon=faktoriyelBul(n)/faktoriyelBul(n-r);
        System.out.println("P("+n+","+r+")= "+permütasyon);
    }

    private static long faktoriyelBul(int n) {
        long carpım=1;

        for (int i = 1; i <=n ; i++) {
            carpım*=i;
        }


       return carpım;
    }


}
