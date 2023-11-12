package chapter1_16;

public class EndlessLoop {
    public static void main(String[] args) {
        // Tip: 분 단위로 하면 계산할 예정.
        final int WAKE_UP_TIME = 8 * 60; // 8시 기상
        final int END_DAY = 24 * 60; // 24시 하루종료

        // 11시에 loop 탈출할 수 있게 도와준다.

        int now = WAKE_UP_TIME;

        System.out.println("아 공부하기 싫다, 30분 부터 해야지.");

        while (now < END_DAY) {
            now++;
            int hour = now / 60;

            if (now % 60 == 0) {
                System.out.printf("지금 시간은 %d 정각이네!\n", hour);
            }

            if (now == 11 * 60){ // 11시 일 때,
                // break;
                break;
            }

            if (now % 60 == 34) {
                System.out.println("헐 34분이잖아");
                System.out.println("그럼 그냥 정각되면 해야겠다.");
            }
            if (now % 60 == 8) {
                System.out.println("미친 08분이네");
                System.out.println("아.. 공부하기 싫다 30분부터 해야지");
            }
        }
    }
}
