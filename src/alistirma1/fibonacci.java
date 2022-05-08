package alistirma1;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi=scan.nextInt();

        int num1=0;
        int num2=1;
        int num3;

        System.out.println(sayi);

        for (int i = 0 ; i <=sayi; i++) {
            System.out.print(num1 + " , " );

            num3=num1+num2;
            num1=num2;
            num2=num3;



        }





    }
}
