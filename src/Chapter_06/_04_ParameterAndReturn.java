package Chapter_06;

public class _04_ParameterAndReturn {
//    public static void power(int num) {
//        System.out.println(num + "의 2승은 " + (num * num));
//    }

    public static int getPower(int num) {
        int result = num * num;
        return result;
    }

//    public static void powerByExp(int num, int exponent) {
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= num;
//        }
//        System.out.println(num + "의 " + exponent + "승은 " + result);
//    }

    public static int getPowerExp(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 함께 있는 메소드
        int power = getPower(2);
        System.out.println("power = " + power);

        int powerExp = getPowerExp(3, 3);
        System.out.println("powerExp = " + powerExp);

        System.out.println(getPowerExp(2, 4));

    }
}
