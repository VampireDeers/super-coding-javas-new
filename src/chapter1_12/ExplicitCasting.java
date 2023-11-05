package chapter1_12;

public class ExplicitCasting {

    public static void main(String[] args){
        // 1. 더 정밀한 타입 -> 덜 정밀한 타입
        float myFloat = 5.55f;
        int myInt = (int) myFloat;
        System.out.println(myInt);

        // 2. Size 큰 -> size 작은, byte 127
        int myInt2 = 130;
        byte myByte = (byte) myInt2;

        System.out.println(myByte);

        // 3. 연산
        double myDouble1 = 5.5;
        double myDouble2 = 3.7;

        int result = (int) myDouble1 + (int) myDouble2;
        System.out.println(result);
    }
}
