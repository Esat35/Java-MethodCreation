package _07_Method_Creation.Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Soru_09 {
    /*
    Problem tanımı:
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method yazınız

     Test DAta :
    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("BİR CUMLE GIRINIZ : ");

        System.out.println(reverseWord(scan.nextLine()));

    }

    private static String reverseWord(String cumle) {
        String[] words = cumle.split(" ");
        String ters = "";

        for (int i = words.length - 1; i >= 1; i--) {
            ters += words[i] + " ";
        }
        ters += words[0];//en sonda bosluk kalmaması ıcın burası manuel eklendı.
        return ters;
    }


}
