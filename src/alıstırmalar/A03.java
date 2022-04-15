package alıstırmalar;

import java.util.Arrays;
import java.util.Scanner;

public class A03 {
   /*   3.Soru:

            Interview sorusu...
            Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
            (Büyük harf-küçük harf ayrımına dikkat ediniz)
            Test data:
            Input = AAABBCDD
            output = A3B2C1D2
                    */

    public static void main(String[] args) {

        harfFrankasınıBul();






    }

    private static void harfFrankasınıBul() {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin gırınız : ");
        String str= scan.nextLine();
        str=str.replaceAll("\\W","");
        String arr[]=str.split("");

        String frekans="";
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i].equals(arr[j])){
                    count++;
                    i++;//  trick
                }

            }
            frekans+=arr[i]+count+" ";
        }
        System.out.println(frekans);
    }


}
