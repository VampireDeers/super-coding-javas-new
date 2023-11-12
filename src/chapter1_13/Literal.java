package chapter1_13;

public class Literal {

    public static void main(String[] args){
        int num = 0b1010;
        System.out.println(num);

        int num2 = 0xCA0; // 12 * 16^2 + 10 * 16 = ?
        System.out.println(num2);

        double myDouble = 5.22E5; // 5.22 * 10^5;
        System.out.println(myDouble);

        double myDouble2 = 2.55E-3;
        System.out.println(myDouble2);

        String str = null;
        System.out.println(str);
    }
}
