package _07_Method_Creation.Sorular;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_04 {
     /*
        Problem Tanımı :
        kullanıcıdan 5 elemanlı bir dizi oluşturup tek
        elemanları 0 ile çift elemanları 1 değiştirip yazdıran bir method yazınız.

        13457-->00100
        */

    public static void main(String[] args) {
cevir();


    }

    private static void cevir() {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[5];
        int adet=0;
        while (adet<5){
            System.out.print("Array'ın "+adet+". indexdekı elemanı gırınız  :");
            arr[adet]=scan.nextInt();
            adet++;
        }

        System.out.println("Array'in ilk hali : "+Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0){
                arr[i]=1;
            }else arr[i]=0;
        }

        System.out.println("Array'in son halı : "+Arrays.toString(arr));
    }


}
