package Chapter_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 조건
        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메이카노 +1

        boolean ade = true;
        boolean juice = true;

        if (ade) {
            System.out.println("한라봉 에이드 +1");
        }else if (juice){
            System.out.println("망고 주소 +1");
        }else{
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        ade = false;
        juice = false;
        boolean ojuice = true;
        if (ade) {
            System.out.println("한라봉 에이드 +1");
        }else if (juice){
            System.out.println("망고 주소 +1");
        } else if (ojuice) {
            System.out.println("오렌지 주스 +1");
        } else{
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        ade = false;
        juice = false;
        ojuice = false;
        if (ade) {
            System.out.println("한라봉 에이드 +1");
        }else if (juice){
            System.out.println("망고 주소 +1");
        } else if (ojuice) {
            System.out.println("오렌지 주스 +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
