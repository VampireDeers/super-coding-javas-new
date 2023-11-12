package chapter1_13;

public class EncodingDecoding {

    public static void main(String[] args){
//        1. 'Z' -> int
        char ch1 = 'Z';
//        System.out.println(ch1);
//        System.out.println((int) ch1);

//        Int -> char
        int num = 97;
//        System.out.println(num);
//        System.out.println((char) num);

//        'a', 'A' 대소 비교
        char smallA = 'a';
        char largeA = 'A';

//        boolean result = smallA > largeA;
//        System.out.println(result);

//        유니코드 출력 '\uAC00'
//        char hangul = '\uAC01';
//        System.out.println(hangul);

//        특수 "\t", "\n", "\'"
        char special1 = '\t';
        System.out.println(new char[]{'안', special1, '녕'});

        char special2 = '\n';
        System.out.println(new char[]{'안', special2, '녕'});
    }
}
