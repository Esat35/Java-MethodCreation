package alıstırmalar;

import java.util.Scanner;

public class A05_MukemmelSayi {
    /*   5.Soru:

                Problem Tanımı :
                Kullanıcıdan alınan  bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
                Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
                ORNEK:
                INPUT     : 6
                OUTPUT : 1,2,3
                              1+2+3 = 6 = 6 (Mükemmel)
                */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı gırınız : ");
        int sayı=scan.nextInt();

        int toplam=0;

        for (int i = 1; i <sayı ; i++) {
            if (sayı%i==0){
                System.out.print(i+",");
                toplam +=i;
            }

        }

        if (toplam==sayı){
            System.out.print("toplamları "+toplam+" = "+sayı+" oldugu için "+sayı+" sayısı mukemmel sayı.");
        }else  {
            System.out.print("toplamları "+toplam+" != "+sayı+" oldugu için "+sayı+" sayısı mukemmel sayı degil!");
        }

    }
}
