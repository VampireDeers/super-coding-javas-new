package chapter1_13;

public class StringFormat {

    public static void main(String[] args){
        // String 생성
        String str1 = "Happy";
        String str2 = String.valueOf(123);

//        System.out.println(str1);
//        System.out.println(str2);

        // String 2
        String result;

        result = String.format("문자 서식: %s, %S", str1, str1);
        System.out.println(result);

        int myInt = 10;
        result = String.format("정수서식: %d, %05d", myInt, myInt);
        System.out.println(result);

        float myFloat = 12.565234f;
        result = String.format("실수 서식: %f, %.1f, %.2f", myFloat, myFloat, myFloat);
        System.out.println(result);
    }

}
