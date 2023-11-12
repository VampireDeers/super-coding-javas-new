package chapter1_15;

public class ForLoop {

    public static void main(String[] args){

        // 1~10까지 다 더하기
        int sum = 0;
        int i = 0;

        for (; i <= 10; ++i){
            sum += i;
        }

        System.out.printf("모두 더한 값은 %d 입니다.\n", sum);
    }
}
