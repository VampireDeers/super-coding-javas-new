package chapter1_15;

public class WhileLoop2 {

    public static void main(String[] args){
        // 1~10까지 다 더하는 while loop
        int sum = 0;
        int num = 0; // 몇 번 돌렸는지 추적

        while ( num < 100 ){
            num++; // 이 식이 돌고 돌아서, 조건식 탈출할 수 있게
            sum += num;
        }

        String result = String.format("모든 수를 더한 값은 %d 입니다.", sum);
        System.out.println(result);
    }
}
