package chapter1_18.practice;

import java.util.Arrays;

public class TwoDimensionArray {

    public static void main(String[] args){
        // 2d array 초기화 - 1
        int[][] arr = new int[2][4];
        String[][] arrStr = new String[4][2];

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arrStr));

        // 2d array 초기화 - 2\
        int[][] arr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.deepToString(arr2));

        // 2d Array indexing read
        int myInt = arr2[0][2]; // 3
        int myInt2 = arr2[2][2]; // 11

        System.out.println(myInt);
        System.out.println(myInt2);

        // 2d Array indexing update
        arr2[0][3] = 13;
        System.out.println(Arrays.deepToString(arr2));
    }
}
