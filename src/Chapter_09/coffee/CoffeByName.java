package Chapter_09.coffee;

public class CoffeByName {
    public Object name;

    public CoffeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
