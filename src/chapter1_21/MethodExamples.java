package chapter1_21;

public class MethodExamples {

    public static void main(String[] args){
        // 일반적인 입력값, 출력값도 있는 경우
            // char -> int
            // 두 정수를 더해서 4 곱하기
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode);

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(10, 5);
        System.out.println(result);

        // 인자값도 없고, 출력값도 없는거.
            // "Hi" 출력
        printHi();

        // 인자값이 있는데, 출력값은 없는거.
        // "함수 안에서 %인자 실행합니다."
        printHello("world");

        // 인자값이 없을 수 있다, 출력값은 있음.
            // "두 정수를 더해서 4 곱하기" + "를 출력합니다."
        String resultStr = sayHello();
        System.out.println(resultStr);
    }

    static int toUnicode(char ch) { return (int) ch;}

    static int sumAndMultiplyFour(int a, int b){
        return (a+b) * 4;
    }

    static void printHi(){
        System.out.println("Hi");
    }

    static void printHello(String str){
        System.out.printf("함수 안에서 실행합니다. %s\n", str);
    }
    static String sayHello(){
        int sums = sumAndMultiplyFour(4,5);
        return sums + "를 출력합니다.";
    }
}
