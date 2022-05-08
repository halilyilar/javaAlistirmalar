package alistirma1;

import java.util.ArrayList;
import java.util.List;

public class uniqarray {
    public static void main(String[] args) {

       int arr[]={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (!list.contains(arr[i])) {
                list.add(arr[i]);

            }

        }
        System.out.println(list);

    }

}


