package alistirma3;

import java.util.HashMap;
import java.util.Map;

public class keyMap {
    public static void main(String[] args) {
        //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
        //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
        //5 tane ulke ismi yazdırıyoruz. (keyset())
        //5 tane ulke nufusunu yazdırıyoruz. (values())
        //nüfusların toplamını yazdırın.
        //kaç tane 50 milyondan fazla nüfuslu ülke var?
        // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

       HashMap<String, Integer> ulke = new HashMap<>();

        ulke.put("almanya", 130);
        ulke.put("turkiye", 85);
        ulke.put("suriye", 55);
        ulke.put("amerika", 150);
        ulke.put("norvec", 20);

        System.out.println(ulke);
        System.out.println(ulke.keySet());
        System.out.println(ulke.values());

        int tpl=0;

        for (Integer w : ulke.values())

        tpl+=w;

        System.out.println("ulke nufus toplam :" + tpl);

        int sayac=0;

        for (Integer w :ulke.values()) {

            if (w>50){

                sayac++;
            }

        }
        System.out.println("nufusu 50 ml dan buyuk ulke sayisi : " + sayac);

        System.out.println(ulke.entrySet());

        for (Map.Entry<String, Integer>  siralar : ulke.entrySet()) {
            System.out.println(siralar);
        }
        for (String ulkesira : ulke.keySet()) {
            System.out.println(ulkesira);

        }
        for (Integer nufussira : ulke.values()) {
            System.out.println(nufussira);

        }



    }
}
