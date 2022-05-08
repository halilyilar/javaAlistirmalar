package alistirma2;

import java.util.Arrays;

public class cümlearrayterstenyaz {
    public static void main(String[] args) {

       String str="Coding is greate.";
       String[]arr=str.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);

        }

    }

}











