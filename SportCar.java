package oop;

public class SportCar extends Car {
    private String color;
    public SportCar(String name, String color) {
        super(name);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 50;
        System.out.println("스포츠카 가속!");
        System.out.println("속도 : " + this.speed);
    }

    public void turboCharge() {
        this.speed = this.speed + 70;
        System.out.println("터보!");
        System.out.println("속도 : " + this.speed);
    }
}