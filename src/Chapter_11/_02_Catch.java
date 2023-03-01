package Chapter_11;

public class _02_Catch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류의 종류 : 컴파일 오류, 런타임 오류
        // int i = "문자열"; -> 컴파일 오류
//        int[] arr = new int[3];
//        arr[5] = 100;

        // 런타임 오류의 종류 : 에러 error, 예외 exception

        try {
//            System.out.println(3 / 0);

            int[] arr = new int[3];
            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);

//            String s = null;
//            System.out.println(s.toLowerCase());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("무언가 에러가 났습니다.");
//            System.out.println("잘못 계산 했습니다");
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("인데스 설정을 잘못했습니다.");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형변환 입니다.");
        } catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리가 됩니다.");
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
