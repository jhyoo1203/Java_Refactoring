package constructor_inheritance;

public class SportCar extends Car {
    protected String name;

    public SportCar() {
        this.name = null;
    }

    public SportCar(String name) {
        this.name = name;
    }

}
