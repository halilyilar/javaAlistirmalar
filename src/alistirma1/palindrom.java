package alistirma1;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {

       // 1.yol
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String klm=scan.nextLine();

        StringBuilder obstr = new StringBuilder(klm);
        String tersstr=obstr.reverse().toString();
        System.out.println(tersstr);
        if (klm.equalsIgnoreCase(tersstr)){
           System.out.println("palındromdur");
        }else System.out.println("degildir");


        }
    }









