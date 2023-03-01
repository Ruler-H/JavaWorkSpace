package Chapter_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("map.size() = " + map.size());
        System.out.println("---------------------------");

        // 데이터 조회
        System.out.println("유재석 포인트 = " + map.get("유재석"));
        System.out.println("박명수 포인트 = " + map.get("박명수"));
        System.out.println("---------------------------");

        // 데이터 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }
        System.out.println("---------------------------");

        // 데이터 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("---------------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 순 = " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("---------------------------");

        // 다시 고객들이 생김
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        // Key 확인 - 데이터 순회
        for (String s : map.keySet()) {
            System.out.println("s = " + s);
        }

        System.out.println("---------------------------");

        // Value 확인
        for (Integer value : map.values()) {
            System.out.println("value = " + value);
        }

        System.out.println("---------------------------");

        // Key-Value 함께 확인
        for (String s : map.keySet()) {
            System.out.println("고객이름 = " + s + ", 포인트 = " + map.get(s));
        }

        System.out.println("---------------------------");

        // 맵 : 중복 X, 순서 X
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);
        for (String s : map.keySet()) {
            System.out.println("고객이름 = " + s + ", 포인트 = " + map.get(s));
        }
        System.out.println("---------------------------");
    }
}
