package alistirma3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapEntry {
    public static void main(String[] args) {
        //aşağıdaki çıktıyı elde ediniz
        // Kiraz 100
        // İncir 200
        // Enginar 150
        // Üzüm 145
        // Nar 250

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Kiraz",100);
        map.put("incir",200);
        map.put("Enginar",150);
        map.put("Uzum",145);
        map.put("Nar",250);
        System.out.println(map.entrySet());

        for (Map.Entry<String,Integer> entryYeni : map.entrySet()) {

            System.out.println(entryYeni.getKey()+ " " + entryYeni.getValue());

        }

    }
}
