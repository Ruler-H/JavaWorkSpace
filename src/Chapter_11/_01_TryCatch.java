package Chapter_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류의 종류 : 컴파일 오류, 런타임 오류
        // int i = "문자열"; -> 컴파일 오류
//        int[] arr = new int[3];
//        arr[5] = 100;

        // 런타임 오류의 종류 : 에러 error, 예외 exception

        try {
            System.out.println(3 / 0);

//            int[] arr = new int[3];
//            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("문제가 발생했습니다 : " + e);
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}

class s {
    public void methodA() {
        this.methodA();
    }
}
