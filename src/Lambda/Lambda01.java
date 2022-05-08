package Lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35,
                20, 63, 21, 65, 44, 66, 64, 81, 38, 15));

        printElFounctainol(sayi);
        System.out.println();
        printElCiftYazdir(sayi);
        printElFounctainol1(sayi);
        System.out.println();
        printOtuzkucuk(sayi);
        System.out.println();
        printOtuzBuyuk(sayi);


    }

    public static void printElCiftYazdir(List<Integer> sayi) {

        sayi.stream().filter(t -> t % 2 == 0).forEach(Lambda01::yazdir);
        System.out.println();
    }

    public static void printElFounctainol(List<Integer> sayi) {
        sayi.stream().forEach(Lambda01::yazdir);
    }

    public static void yazdir(int a) {
        System.out.print(a + " ");

    }

    public static boolean ciftBul(int a) {

        return a % 2 == 0;

    }

    public static void printElFounctainol1(List<Integer> sayi) {
        sayi.stream().filter(Lambda01::ciftBul).forEach(Lambda01::yazdir);
    }
    public static void printOtuzkucuk (List<Integer> sayi) {
        sayi.stream().filter(t-> t % 2 == 0 && t < 34).forEach(Lambda01::yazdir);
    }
    public static void printOtuzBuyuk(List<Integer> sayi){
        sayi.stream().filter(t -> t % 2 == 0 || t>34).forEach(Lambda01::yazdir);
    }
}
