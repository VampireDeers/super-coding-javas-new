package chapter1_14;

public class AvocadoSituation1 {

    public static void main(String[] args){
        // 장보기 전
        int milks = 0;
        int avocados = 0;
        boolean existedAvocade = false;


        // 우유르 구매
        milks = milks + 1;
        if (existedAvocade) {
            avocados = avocados + 6;
        }

        String comment = String.format("여보, 장보고 돌아왔어 %d 아보카도, %d 우유 가져왔어", avocados, milks);
        System.out.println(comment);
    }
}
