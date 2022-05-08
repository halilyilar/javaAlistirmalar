package alistirma1;

import java.util.ArrayList;
import java.util.List;

public class stringkarakterkaldırtopla {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("$12");
        list.add("$23");
        list.add("$34");
        System.out.println(list);

        System.out.println(getsum(list));

    }

    private static int getsum(List<String> list) {
        int toplam = 0;
        for (String each : list) {
            String str = each.replaceAll("\\D", "");
            System.out.print(str + " ");

            toplam += Integer.parseInt(str);


        }
        System.out.println();
        return toplam;

    }
}