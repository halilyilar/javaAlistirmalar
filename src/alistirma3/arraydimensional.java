package alistirma3;

public class arraydimensional {
    public static void main(String[] args) {

        int[][] array = {{12, 3, 6}, {121, 34}, {144, 6, 76, 98}};
        System.out.println(maxbul(array));
    }

    public static int maxbul(int array[][]) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];

                }

            }


        }return max;
    }
}