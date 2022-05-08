package alistirma2;

import java.util.Arrays;

public class karekterKaldir {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran
		 java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 €32 €40 €2 €65 €4 ";

        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));

        int topDolar=0;
        int topEuro=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i].contains("$")){
                topDolar+= Integer.parseInt(arr[i].replace("$",""));
            }else{
                topEuro+= Integer.parseInt(arr[i].replace("€",""));
            }
        }
        System.out.println("toplam dolar tutari :"+topDolar);
        System.out.println("toplam euro tutari :"+topEuro);
    }
    }

