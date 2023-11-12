package chapter1_17;

import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args){
        // 정수 타입 array
        int[] intArr1 = new int[]{1,2,3,4,5};
        int[] intArr2 = {1,2,3,4,5};

        System.out.println(Arrays.toString(intArr1));
        System.out.println(Arrays.toString(intArr2));

        int[] intArr3 = new int[10];
        System.out.println(Arrays.toString(intArr3));

        // float
        float[] floatArr = {1.5f, 2.5f, 3.5f};
        float[] floatArr2 = new float[20];

        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(floatArr2));

        // boolean

        // Strings
        String[] stringArr = new String[10];
        String[] stringArr2 = {"ABC", "Hello", "World"};
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(stringArr2));
    }
}
