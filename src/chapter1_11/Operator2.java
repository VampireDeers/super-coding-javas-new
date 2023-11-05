package chapter1_11;

public class Operator2 {

    public static void main(String[] args){
        // 비교 연산자

        int num1 = 10;
        int num2 = 20;

        boolean result = num1 > num2;
//        System.out.println(result);

        boolean b1 = true;

        System.out.println( b1 && result );
        System.out.println( b1 || result );
        System.out.println( ! ( b1 || result )  );
    }
}
