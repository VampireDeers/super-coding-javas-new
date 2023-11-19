package chapter1_22;

public class Fish {

    // 속성
    String gender; // "Male", "Female"
    boolean havingPoison; // true: '독 있음', false: '독 없음'

    String startSpawningDate; // 산란 시작 기간 yyyyMMdd
    String endSpawningDate; // 산란 종료 기간 yyyyMMdd
    String leavingSea; // '동해', '서해' 등등

    // 행위
    void eat(String food) {
        System.out.printf("나, 물고기는 %s를 먹고있습니다.\n", food);
    }
    void swim(int meter){
        System.out.printf("나, 물고기는 %d meter를 헤엄칩니다.\n", meter);
    }
    void makeCrowd(Fish otherFish) {
        System.out.println("나는 다른 물고가와 무리 짔습니다.");
    }
    void sleep(){}
}
