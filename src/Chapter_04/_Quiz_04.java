package Chapter_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        String car = "penalty";
        int hour = 10;
        int fee = hour * 4000;
        if (fee > 30000) {
            fee = 30000;
        }
        if (car == "penalty") {
            fee /= 2;
        }
        System.out.println("주차 요금은 " + fee + "원 입니다.");

        System.out.println("---------- 문제 풀이 -------");

        hour = 5;
        boolean isSmallCar = false;
        boolean withDisabledPerson = false;

        fee = hour * 4000;

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2;
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");

    }
}
