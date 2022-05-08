package alistirma1;

import java.util.Scanner;

public class HackerLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumlae gir");
        String str = scan.nextLine().toLowerCase();

        hackerdili(str);

    }

    private static void hackerdili(String str) {

        String arr[] = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {

            arr[i] = str.substring(i, i + 1);
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            if (arr[i].contains("s")) {
                arr[i] = "5";

            }
            if (arr[i].contains("a")) {
                arr[i] = "4";

            }
            if (arr[i].contains("i")) {
                arr[i] = "1";
            }
            if (arr[i].contains("o")) {
                arr[i] = "0";
            }if (arr[i].contains("e")){
                arr[i]="3";


        }
            System.out.print(arr[i]);

    }
}}



