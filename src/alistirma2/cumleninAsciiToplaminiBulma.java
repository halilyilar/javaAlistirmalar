package alistirma2;

import java.util.Scanner;

public class cumleninAsciiToplaminiBulma {
    public static void main(String[] args) {

        //Ascii toplamını bulan program

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String str=scan.nextLine();

         char [] dizi = new char[str.length()];

         str.getChars(0, str.length(), dizi, 0);
        System.out.println(dizi);
        System.out.println(dizi);
        /*java string getChars() yöntemi, verilen dizedeki
        karakterleri hedef karakter dizisine kopyalar.*/

            int toplam = 0;
            for (int i = 0; i < dizi.length; i++) {
                toplam = toplam + dizi[i];
            }
            System.out.println("Asci toplam : "+toplam);
        }
    }

