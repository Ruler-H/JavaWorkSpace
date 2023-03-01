package Chapter_05;

public class _Quize_05 {
    public static void main(String[] args) {
        int size = 250;
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + (size + (i * 5)) + " (재고 있음)");
        }

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int i : sizeArray) {
            System.out.println("사이즈 " + i + " (재고 있음)");
        }
    }
}
