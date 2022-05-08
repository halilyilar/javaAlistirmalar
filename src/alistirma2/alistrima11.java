package alistirma2;

import java.util.Arrays;

public class alistrima11 {
    public static void main(String[] args) {
         /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran
		 java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 &32 &40 &2 &65 &4 ";

        System.out.println(str.length());

        System.out.println(str);

           /* int dolar=0;
            int euro=0;

        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i). ){
                dolar+=Integer.parseInt(str.replace("$", ""));
            }else{
                euro+=Integer.valueOf(str.replace("&",""));
            }

        }
        System.out.println("dolar toplam = " + dolar);
        System.out.println("euro toplam = " + euro);*/

    }
}
