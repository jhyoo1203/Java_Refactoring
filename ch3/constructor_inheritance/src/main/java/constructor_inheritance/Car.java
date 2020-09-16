package constructor_inheritance;

public class Car {
    protected String name;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
        this.name = null;
        System.out.println("자동차 생성");
    }
}
