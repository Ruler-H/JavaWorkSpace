package Chapter_06;

public class _02_Parameter {
    public static void power(int num) {
        System.out.println(num + "의 2승은 " + (num * num));
    }

    public static void powerByExp(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(num + "의 " + exponent + "승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        power(2);
        power(3);

        powerByExp(2, 3);
        powerByExp(3, 3);
        powerByExp(10, 0);
    }
}
