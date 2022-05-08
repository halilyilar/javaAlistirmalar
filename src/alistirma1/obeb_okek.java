package alistirma1;

import java.util.Scanner;

public class obeb_okek {
    public static void main(String[] args) {
       /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
        LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        Input :30 40
        Beklenen Cikti:
                */
        // 30 ve 40 icin GCD = 10

        //30 ve 40 icin LCM = 120

        Scanner scan = new Scanner(System.in);
        System.out.println("iki tam sayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int obeb = 0;
        int okek;

        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                obeb = i;
            }
        }
        okek = a * b / obeb;
        System.out.println("girdiginiz sayinin obeb i : " + obeb);
        System.out.println("girdiginiz sayinin okek i : " + okek);
    }
}
