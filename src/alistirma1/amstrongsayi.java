package alistirma1;

import java.util.Scanner;

public class amstrongsayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("üc basamakli bir sayi gir");

        int sayi=scan.nextInt();
        int bsmtpl=0;
        int ysayi=0;

        int a=sayi%10;
        bsmtpl+= a*a*a;
        ysayi=sayi/10;
        int b=ysayi%10;
        bsmtpl+=b*b*b;
        int c=ysayi/10;
        bsmtpl+=c*c*c;

        if (bsmtpl==sayi){
            System.out.println("sayi amstrong sayidir");
        }else System.out.println("sayi amstrong sayi değildir");



    }
}
