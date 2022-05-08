package alistirma2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_terstenYzadirma {
    public static void main(String[] args) {

        List <Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <100 ; i++) {
            if (i%2==0){
                list.add(i);
            }
        }
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);


    }
}

