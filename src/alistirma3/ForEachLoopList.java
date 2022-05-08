package alistirma3;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopList {
    public static void main(String[] args) {

        List<Integer> lines = new ArrayList<>();
        lines.add(2);
        lines.add(6);
        lines.add(8);
        lines.add(12);
        lines.add(9);
        List<Integer> list = new ArrayList<>();
        int sonuc=0;
        for (Integer each : lines) {
            list.add(each*each);
            sonuc+=each*each;

        }
        System.out.println("kareleri alinan yeni elemanlar : " + list);
        System.out.println("Kareler Toplami : " + sonuc);
        }
       }

