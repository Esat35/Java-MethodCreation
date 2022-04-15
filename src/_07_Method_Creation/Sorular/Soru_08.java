package _07_Method_Creation.Sorular;

import java.util.Arrays;

public class Soru_08 {
    /*
        Problem Tanımı :
        int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        verilen Array icinde
        --> kac tane sayi oldugunu return eden  methodu yazdiriniz
        --> kac tane tek sayi oldugunu return eden methodu yazdiriniz
        --> kac tane cift sayi oldugunu return eden methodu yazdiriniz
        -->en buyuk sayi
        -->en kucuk sayi
        */
    public static void main(String[] args) {
        int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        System.out.println("Arraydekı sayı adedı : "+arrydeKacSayıVar(array));
        System.out.println("Arraydekı tek sayı adedi : "+tekSayıSaysıBul(array));
        System.out.println("Arraydekı cift sayı adedi : "+cıftSayıSaysıBul(array));
        System.out.println("Arraydekı enbuyuk eleman : "+buyukSayıBul(array));
        System.out.println("Arraydekı en kucuk eleman : "+kucukSayıBul(array));

    }

    private static int kucukSayıBul(int[][] array) {
        int enkucuk = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]<enkucuk){
                    enkucuk=array[i][j];
                }
            }
        }
        return enkucuk;
    }

    private static int  buyukSayıBul(int[][] array) {
        int enbuyuk=array[0][0];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j] > enbuyuk){
                    enbuyuk=array[i][j];
                }
            }
        }
        return enbuyuk;
    }

    private static int cıftSayıSaysıBul(int[][] array) {
        int teksayıSayısı=0;
        for (int i = 0; i <array.length ; i++) {

            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]%2==0){
                    teksayıSayısı++;
                }
            }
        }
        return teksayıSayısı;
    }

    private static int  tekSayıSaysıBul(int[][] array) {
        int teksayıSayısı=0;
        for (int i = 0; i <array.length ; i++) {

            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]%2!=0){
                    teksayıSayısı++;
                }
            }
        }
        return teksayıSayısı;
    }

    private static int arrydeKacSayıVar(int[][] array) {
        int toplam=0;
        for (int i = 0; i <array.length;  i++) {
            toplam+=array[i].length;
        }

        return toplam;
    }


}
