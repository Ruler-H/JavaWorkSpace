package Chapter_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제너릭스
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

//        printIntArray(iArray);
//        printDoubleArray(dArray);
//        printStringArray(sArray);

        System.out.println("-------------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }


    // T : Type
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print("t = " + t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String i : sArray) {
            System.out.print("i = " + i + ", ");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] dArray) {
        for (double i : dArray) {
            System.out.print("i = " + i + ", ");
        }
        System.out.println();
    }

    private static void printIntArray(int[] iArray) {
        for (int i : iArray) {
            System.out.print("i = " + i + ", ");
        }
        System.out.println();
    }
}
