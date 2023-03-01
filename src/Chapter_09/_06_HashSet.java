package Chapter_09;

import java.sql.SQLOutput;
import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        HashSet<String> set = new HashSet<>();

        // 데이터 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 상품 수 : " + set.size());

        for (String s : set) {
            System.out.println("s = " + s);
        }

        System.out.println("-------------------------");

        // 데이터 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }

        System.out.println("-------------------------");

        // 데이터 삭제
        System.out.println("총 상품 수 (구매 전) : " + set.size());
        set.remove("삼겹살");
        System.out.println("총 상품 수 (구매 후) : " + set.size());

        System.out.println("-------------------------");

        // 데이터 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }

        System.out.println("-------------------------");

        // 세트 : 중복 허용 X, 순서 보장 X
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (Integer integer : intSet) {
            System.out.println("integer = " + integer);
        }
    }
}
