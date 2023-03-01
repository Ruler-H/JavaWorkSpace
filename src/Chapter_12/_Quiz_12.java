package Chapter_12;

public class _Quiz_12 {
    public static void main(String[] args) {
//        Product product1 = new Product();
//        Product product2 = new Product();

        Runnable packaging_a = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            }
            System.out.println("-- A 상품 준비 완료 --");
        };

        Runnable packaging_b = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println("-- B 상품 준비 완료 --");
        };

        Thread packagingThread_a = new Thread(packaging_a);
        Thread packagingThread_b = new Thread(packaging_b);

        packagingThread_a.start();
        packagingThread_b.start();

        try {
            packagingThread_a.join();
            packagingThread_b.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable packaging_set = () -> {
            System.out.println("== 세트 상품 포장 시작 ==");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println("== 세트 상품 포장 완료 ==");
        };

        Thread threadSet = new Thread(packaging_set);
        threadSet.start();



    }
}

//class Product implements Runnable{
//
//    @Override
//    public void run() {
//
//    }
//}


