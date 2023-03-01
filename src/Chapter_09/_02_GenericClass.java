package Chapter_09;

import Chapter_09.coffee.*;
import Chapter_09.user.User;
import Chapter_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeByNickname c2 = new CoffeByNickname("유재석");
        c2.ready();

        System.out.println("------------------------");

        CoffeByName c3 = new CoffeByName(34);
        c3.ready();

        CoffeByName c4 = new CoffeByName("박명수");
        c4.ready();

        int c3Name = (int) c3.name;
        System.out.println("c3Name = " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("c4Name = " + c4Name);

        System.out.println("----------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("c5Name = " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6name = c6.name;
        System.out.println("c6name = " + c6name);

        System.out.println("---------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("서장훈"));
        c8.ready();

//        CoffeeByUser<T> tCoffeeByUser = new CoffeeByUser<>(new BlackBox());

        System.out.println("----------------------");
        orderCoffee("김영철", "카페 라떼");
        orderCoffee(36);

        orderCoffee("김희철", "아메리카노");
        orderCoffee(37, "라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println("커피 준비 완료 : " + name + "님, " + coffee);
    }
}

class BlackBox {

}
