package chapter1_14;

public class AvocadoSituation2 {

    public static void main(String[] args){
        // 장보기 전
        int milks = 0;
        int avocados = 0;
        boolean existedAvocade = true;


        // 우유르 구매
        if (existedAvocade) {
            milks = milks + 6;
        }
        else {
            milks = milks + 1;
        }

        String comment = String.format("여보, 장보고 돌아왔어 %d 아보카도, %d 우유 가져왔어", avocados, milks);
        System.out.println(comment);
    }
}
