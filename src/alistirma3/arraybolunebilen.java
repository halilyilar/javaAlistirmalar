package alistirma3;

import java.util.Arrays;
import java.util.Scanner;

public class arraybolunebilen {
    public static void main(String[] args) {
       // int[] array ={ 12, -11, 7, 23,34,42,67,98 };
       int arr[]=new int[8];
       int sayac=0;

        for (int i = 0; i <arr.length; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println( i + "elemanı  giriniz");
            arr[i]=scan.nextInt();

            if (arr[i]%3==0 ){
                sayac++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sayac);

    }
}
