package Chapter_13;

import java.util.Arrays;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf("");

        System.out.println("--------- 정수 ---------");
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 2 3
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n", 1234); // __1234
        System.out.printf("%06d%n", 1234); // 001234 (6자리의 공간 확보 후 1234 출력하는데 빈 공간은 0으로 채움)
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234 (항상 기호 표시)
        System.out.printf("%,15d%n", 1002003000); // __1,002,003,000 (세자리마다 콤마로 구분)
        System.out.printf("%-6d%n", 1234); // 1234__ (6자리의 공간을 확보하고 나서 왼쪽 정렬 1234 출력)


        System.out.println("--------- 실수 ---------");
        System.out.printf("%f%n", Math.PI); // 3.141593
        System.out.printf("%.2f%n", Math.PI); // 3.14 - 소수점 둘째자리까지 출력(소수점 세째자리에서 반올림)
        System.out.printf("%6.2f%n", Math.PI); // __3.14 - 6자리 공간을 확보하고 나서 출력
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__ - 6자리 공간을 확보하고 나서 왼쪽 정렬하여 출력
        System.out.printf("%06.2f%n", Math.PI); // 003.14 - 6자리 공간 확보 후 빈 공간은 0으로 채워서 출력
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14 - 6자리 공간 확보 후 +-기호를 표시하여 출력

        System.out.println("--------- 문자열 ---------");
        System.out.printf("%s%n", "Java"); // Java - 일반 출력
        System.out.printf("%6s%n", "Java"); // __Java - 6자리 공간 확보 후 오른쪽 정렬하여 출력
        System.out.printf("%-6s%n", "Java"); // Java__ - 6자리 공간 확보 후 왼쪽 정렬하여 출력
        System.out.printf("%6.2s%n", "Java"); // ____Ja - 6자리 공간 확보 후 문자열 중 앞 두글자만 오른쪽 정렬하여 출력
        System.out.printf("%-6.2s%n", "Java"); // Ja____ - 6자리 공간 확보 후 문자열 중 앞 두글자만 왼쪽 정렬하여 출력

        System.out.println("--------- 응용1 ---------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0); // 강백호 90 80 85.0
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0); // 서태웅 100 100 100.0
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5); // 채치수 95 100 97.5

        System.out.println("--------- 응용2 ---------");
        System.out.println("이름      영어   수학   평균"); // 공백이 각각 6-3-3으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "치수", 95, 100, 97.5);

        System.out.println("--------- 참고 ---------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
    }
}
