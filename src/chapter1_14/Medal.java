package chapter1_14;

public class Medal {

    public static void main(String[] args){
        // 검증
        // 1. 1등인 A는 올림픽 금메달을 얻는다.
        // 2. 4등인 B는 아무것도 얻을 수 없다.

        int myRank = 4;
        String medal;

        switch (myRank) {
            case 1:
                /// 실행문
                medal = "금메달";
                break;
            case 2:
                medal = "은메달";
                break;
            case 3:
                medal = "동메달";
                break;
            default:
                medal = "메달없음";
        }
        String result = String.format("선수님의 메달은 %s 입니다.", medal);
        System.out.println(result);
    }
}
