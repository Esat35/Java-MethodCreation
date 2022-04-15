package _07_Method_Creation.Sorular;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_06 {
    /*
        Problem tanımı :
        Bir String içinde kaç kelime olduğunu yazdıran bir method yazınız.
       Test Data:
       Input the string: javacı arkadaşlar zehir gibi maaşallah en kısa zamanda çok bin $'lı iş bulurlar
 	   Expected Output: Number of words in the string: 13
         */

    public static void main(String[] args) {
kelimeSayısıBul();


    }

    private static void kelimeSayısıBul() {
        System.out.print("bır cumle gırınız : ");
        Scanner scanner =new Scanner(System.in);
    String cumle= scanner.nextLine();
    String arr[]=cumle.split(" ");

        System.out.println("girilen cumlede "+arr.length+" tane kelıme vardır\nBu kelımeler : "+ Arrays.toString(arr));



    }


}
