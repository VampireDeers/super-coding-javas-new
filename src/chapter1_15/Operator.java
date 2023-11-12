package chapter1_15;

public class Operator {
    public static void main(String[] args){

        // +=, *=
        int myInt = 5;
        // myInt = myInt * 10;
        myInt *= 10;
//        System.out.println(myInt);

        // 단항 연산자 ++ ,--
        int myInt2 = 10;
        System.out.println(myInt2);

        // -- 앞쪽에 적었을 때
        System.out.println( --myInt2 ); // 9
        System.out.println(myInt2); // 9

        // -- 뒤쪽에 적었을 때,
        System.out.println( myInt2-- ); // 9
        System.out.println( myInt2 ); // 8
    }
}
