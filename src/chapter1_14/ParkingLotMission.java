package chapter1_14;

public class ParkingLotMission {

    public static void main(String[] args){
        // 검증
        // 1. . 4시간 주차장 이용, 3만 5천원 결제한 백화점 이용객 A는 최종 2시간 결제한다.
        //	2. 6시간 주차장 이용, 22만원 결제한 백화점 이용객 B는 최종 1시간 결제한다.

        int useMoney = 220_000;
        int parkingTime = 6;

        if (useMoney >= 200_000){
            parkingTime = parkingTime - 5;
        }
        else if (useMoney >= 100_000) {
            parkingTime = parkingTime - 4;
        }
        else if (useMoney >= 50_000) {
            parkingTime = parkingTime - 3;
        }
        else if (useMoney >= 30_000) {
            parkingTime = parkingTime - 2;
        }
        else if (useMoney >= 10_000){
            parkingTime = parkingTime - 1;
        }
        else {
            parkingTime = parkingTime;
        }

        String result = String.format("고객님 %d 원를 사용했기 때문에, %d 시간 결제하셔야합니다.", useMoney, parkingTime);
        System.out.println(result);
    }
}
