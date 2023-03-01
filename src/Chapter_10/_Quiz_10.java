package Chapter_10;

import java.util.ArrayList;
import java.util.List;

public class _Quiz_10 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("챈들러", 50));
        customers.add(new Customer("레이첼", 42));
        customers.add(new Customer("모니카", 21));
        customers.add(new Customer("벤자민", 18));
        customers.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        System.out.println("---------------");
        customers.stream()
                .forEach(x ->
                {
                    if (x.getAge() >= 20) {
                        System.out.println(x.getName() + " 5000원");
                    } else {
                        System.out.println(x.getName() + " 무료");
                    }
                } );
    }
}

class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
