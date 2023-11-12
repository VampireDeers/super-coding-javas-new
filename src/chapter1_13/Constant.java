package chapter1_13;

public class Constant {

    public static void main(String[] args){
        int myInt = 5; // 변수 myInt <- 5를 대입
        final int MY_INT = 5; // 상수 MY_INT 를 정의 한거

        myInt = 10;
        System.out.println(myInt);
        System.out.println(MY_INT);

        final double MY_DOUBLE;
        MY_DOUBLE = 10.5;

        // 가독성읊 키우고자함.

    }
}
