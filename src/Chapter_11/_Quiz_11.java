package Chapter_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int time = 20;
        boolean sold = false;

        try {
            if (time < 20) {
                throw new timeOutException("상품 구매 가능 시간이 아닙니다.");
            } else if (sold) {
                throw new soldOutException("해당 상품은 매진되었습니다.");
            }else{
                System.out.println("상품 구매를 완료하였습니다.");
            }
        } catch (timeOutException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (soldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class timeOutException extends Exception {
    public timeOutException(String message) {
        super(message);
    }
}

class soldOutException extends Exception {
    public soldOutException(String message) {
        super(message);
    }
}
