package alistirma1;

import java.util.Scanner;

public class asalMi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayi gir");

        int sayi = scan.nextInt();
        int sayac = 0;
        boolean snc=true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
                System.out.println(sayac);
            }if (sayac==0){
                snc=true;

        }else snc=false;
    }
        System.out.println(snc);


}


    }

























