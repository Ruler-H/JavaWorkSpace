package Chapter_06;

public class _05_Overloading {

    public static int getPower(int num) {
        int result = num * num;
        return result;
    }

    public static int getPower(String strNumber) {
        int num = Integer.parseInt(strNumber);
        int result = num * num;
        return result;
    }

    public static int getPower(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3, 3));
    }
}
