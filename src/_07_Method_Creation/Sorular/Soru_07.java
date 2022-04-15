package _07_Method_Creation.Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_07 {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
        System.out.print("bır cumle gırınız : ");
        String cumle = scan.nextLine();
        karakterler(cumle);

    }

    private static void karakterler(String cumle) {
        String[] arr=cumle.split("");
        List<String> karakterler = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!karakterler.contains(arr[i])){
                karakterler.add(arr[i]);
            }
        }

        System.out.println("girilen cumledekı karakterler : "+karakterler);
    }


}
