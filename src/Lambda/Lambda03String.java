package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Lambda03String {
    public static void main(String[] args) {



        java.util.List<String> menu=new ArrayList<>(Arrays.asList("kusleme","adana","trilece",
                "havucdilim","buryan","yaglama","kokarec","arabAsi","guvec","trilece","trilece","trilece"));



        //task 1
        // buyuk harf alfabetik siralı tek yazdir.

        menu.stream().map(String::toUpperCase).sorted().distinct().forEach(t -> System.out.print(t+" "));
        System.out.println();

        //task2
        // list elemanlarinin karakter sayisini ters sirali olarak

        menu.stream().map(t-> t.length()).sorted(Comparator.reverseOrder()).distinct(). forEach(Lambda01::yazdir);
        System.out.println();

        //task3
        //karakter sayisina göre kucukten buyuge sirala

        menu.stream().sorted(Comparator.comparing(String::length)).forEach(t -> System.out.print(t+" "));
        System.out.println();

        //task4
        //elemanlari sonharfine göre ters sıralı print et

        menu.stream().sorted(Comparator.comparing(t-> t.toString(). charAt(t.toString().length()-1)).
                reversed()).forEach(t-> System.out.print(t+" "));
        System.out.println();

        // Task : listin elemanlarinin karakterlerinin cift sayili
        // karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz..

        menu.
                stream().
                filter(t -> t.length() % 2 == 0).
                map(t -> t.length() * t.length()).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.println(t+ " "));

        //elemanlari 7 ve 7 den kucuk olma durumunu kontrol ediniz

        boolean kontrol = menu.stream().allMatch(t -> t.length() <= 7);
        if (kontrol) {
            System.out.println("list elemanları 7 ve daha az harften olusuyor");
        } else System.out.println("list elemanları 7 harften  buyuk");
        //cincix code
        System.out.println("cincix code");
        System.out.println(menu.
                stream().
                allMatch(t -> t.length() <= 7) ? "list elemanları 7 ve daha az harften olusuyor" : "list elemanları 7 harften  buyuk");
    }
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.





}

