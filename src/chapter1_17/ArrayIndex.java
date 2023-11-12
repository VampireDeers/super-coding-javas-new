package chapter1_17;

import java.util.Arrays;

public class ArrayIndex {

    public static void main(String[] args){
        // index {90, 87, 88, 75, 99, 65}

        int[] studentScores = {90, 87, 88, 75, 99, 65};
        int score1 = studentScores[4];
        System.out.println(score1);

        // 저장
        studentScores[5] = 75;
        System.out.println(Arrays.toString(studentScores));

        // Error
        int score6 = studentScores[6]; // Error
        System.out.println(score6);
    }
}
