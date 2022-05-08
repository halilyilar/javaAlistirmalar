package Lambda;

import java.util.*;

public class Lambda02Integer {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 22, 16, 3,
                15, 27, 17, 8, 25, 13, 2, 7, -9, 11));

        sayi.stream().filter(Lambda01::ciftBul).map(t-> t*t).forEach(Lambda01::yazdir);
        System.out.println();

        sayi.stream().filter(t-> t%2!=0).map(t-> t*t*t+1 ).forEach(Lambda01::yazdir);
        System.out.println();

        sayi.stream().filter(Lambda01::ciftBul).map(Math::sqrt).
                forEach(t-> System.out.print(t+ " - "));
        System.out.println();

        Optional<Integer> maxsayi=sayi.stream().reduce(Math::max);
        System.out.println(maxsayi);

        System.out.println(sayi.stream().filter(Lambda01::ciftBul).map(t -> t * t).reduce(Math::max));

        int tpl=sayi.stream().reduce(0,(a,b)-> a+b);// listedeki tum elemanları toplama
        System.out.println(tpl);
        System.out.println(sayi.stream().reduce(Integer::sum));

        System.out.println(sayi.stream().filter(Lambda01::ciftBul).
                reduce(Math::multiplyExact));//Listedeki cift elemanlari çarpma

        // listteki 5 ten buyuk tek sayiyi bul

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(12, 5, 6, 7, 45, -5, 21,65,-14,78));

        System.out.println(sayilar.
                stream().filter(t -> t % 2 != 0 && t > 5).reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b));

        sayilar.stream().filter(Lambda01::ciftBul).map(t -> t * t).sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.print(t+" "));

       Optional<Integer> enbyk= sayi.stream().filter(Lambda01::ciftBul).map(t-> t*t).reduce(Math::max);
        System.out.println(enbyk);


    }
}
