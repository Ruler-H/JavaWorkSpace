package Chapter_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> arrayList = new ArrayList<String>();

        // 데이터 추가
        arrayList.add("유재석");
        arrayList.add("조세호");
        arrayList.add("김종국");
        arrayList.add("박명수");
        arrayList.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));

        System.out.println("-----------------------");

        // 삭제 (박명수 이사)
        System.out.println("신청 수 : " + arrayList.size());
        arrayList.remove("박명수");
        System.out.println("신청 수 : " + arrayList.size());
        System.out.println(arrayList.get(3));

        System.out.println("-----------------------");

        System.out.println("남은 학생 수 (제외 전) : " + arrayList.size());
        arrayList.remove(arrayList.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + arrayList.size());

        System.out.println("-----------------------");

        // 순회
        for (String s : arrayList) {
            System.out.println("s = " + s);
        }

        System.out.println("-----------------------");

        // 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + arrayList.get(0));
        arrayList.set(0, "이수근");
        System.out.println("수강권 양도 후 : " + arrayList.get(0));

        System.out.println("-----------------------");

        // 확인
        System.out.println(arrayList.indexOf("김종국"));
        // 선착순 5명 내에 포함됐는가?
        if (arrayList.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("-----------------------");

        // 전체 삭제
        arrayList.clear();
        if (arrayList.isEmpty()) {
            System.out.println("학생 수 : " + arrayList.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-----------------------");


        // 다음 학기에 새로 공부 시작
        arrayList.add("유재석");
        arrayList.add("조세호");
        arrayList.add("김종국");
        arrayList.add("박명수");
        arrayList.add("강호동");

        // 정렬
        Collections.sort(arrayList);
        for (String s : arrayList) {
            System.out.println("s = " + s);
        }
    }
}
