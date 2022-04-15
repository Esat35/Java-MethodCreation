package alıstırmalar;

import java.util.Arrays;
import java.util.Scanner;

public class A04 {
    /*   4.Soru:

             Problem Tanımı :
             kullanıcıdan 5 elemanlı bir dizi oluşturup tek
             elemanları 0 ile çift elemanları 1 değiştirip yazdıran bir method yazınız.
             */
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Sayiyi giriniz = ");
            arr[i] = scan.nextInt();

        }
        System.out.println("dizinin ilk hali : "+ Arrays.toString(arr));
      arr=  teke0Cifte1Ata(arr);
        System.out.println("dizinin son hali : "+Arrays.toString(arr));


    }

    private static int[] teke0Cifte1Ata(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==1){
                arr[i] = 0;
            }else {
                arr[i]=1;
            }
        }
     return arr;
    }
}