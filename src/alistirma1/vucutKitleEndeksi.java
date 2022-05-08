package alistirma1;

import java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("kilo giriniz");
        double sayi=scan.nextDouble();
        System.out.println("boy giriniz");
        double sayi2=scan.nextDouble();

        double snc=(sayi/ (sayi2/100*sayi2/100));

        System.out.println("Vucut Kitle Endeksiniz : " + snc);

        if (snc<=20) {
            System.out.println("zayıfsın");
        }else if (20<snc && snc<=25){
            System.out.println("normalsin");
        }else if (25<snc && snc <=30){
            System.out.println("kilolusun");
        }else {
            System.out.println("obessin");
        }
    }
}
