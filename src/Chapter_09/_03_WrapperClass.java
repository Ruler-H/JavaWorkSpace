package Chapter_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클래스
        // 기본 : int, double, float, char

        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';

        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("c = " + c);

        System.out.println("-------------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());
    }
}
