package Chapter_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        // 다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 만약에 인사법이 바뀌면?
        System.out.println("환영합니다. 냐코입니다.");
        System.out.println("환영합니다. 냐코입니다.");
        System.out.println("환영합니다. 냐코입니다.");
        // 매장 이름이 바뀌면?
        // 냐코 -> 코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        for (int i = 0; i < 10; i++) {
//            System.out.println("어서오세요. 냐코입니다." + i);
//            System.out.println("환영합니다. 냐코입니다." + i);
            System.out.println("환영합니다. 코나입니다." + i);
        }

        // 짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자 출력
        for (int i = 5; i > 0; i -= 1) {
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지의 합
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            num += i;
            System.out.println("현재까지 총합은 " + num + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + num);
    }
}
