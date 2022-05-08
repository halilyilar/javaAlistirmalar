package alistirma2;

import java.util.Scanner;

public class uslusayi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int a =scan.nextInt();
        System.out.println("bir sayi giriniz");
        int b =scan.nextInt();

        int snc=1;

        while (b!=0){
            snc*=a;
            b--;
            }
        System.out.println(snc);
        }
    }





