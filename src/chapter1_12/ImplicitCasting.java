package chapter1_12;

public class ImplicitCasting {

    public static void main(String[] args){
        // 자동 형변환 1
        // 덜 정밀한 -> 더 정밀하게

//        int myInt = 10;
//        float myFloat = myInt;

//        System.out.println(myFloat);

        // size 작은 -> size 큰 타입

        int myInt2 = 20;
        long myLong = myInt2;
//        int myInt3 = myLong;

        System.out.println(myLong);


        /// 연산 때 Casting
        int myInt = 10;
        float myFloat = 2.5f;

        float result = myInt + myFloat;
        System.out.println(result);

        long myLong2 = 20L;

        long result2 = myLong2 - myInt;
        System.out.println(result2);

        // 실수하기 쉬운 것
        int num1 = 10;
        float num2 = 3.0f;

        float result3 = num1 / num2;
        System.out.println(result3);
    }
}
