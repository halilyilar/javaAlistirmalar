package alistirma1;

import java.util.Scanner;

public class aylarınGunSayisiSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("istediginiz ayı sayi  olarak giriniz ");
        int sayi = scan.nextInt();


        switch (sayi) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiginiz ay 31 gun");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiginiz ay 30 gun");
                break;
            case 2 :
                System.out.println("yil giriniz");
                int yil = scan.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("girdiğiniz ay 29");

                } else System.out.println("girdiginiz ay 28 gun");
                break;

            default :
                System.out.println("geçerli bir sayi giriniz");
        }
    }
}




