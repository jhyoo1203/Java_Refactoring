package wargame;

public abstract class AirForcePlane {

    public AirForcePlane() {

    }

    public void takeOff() {
        System.out.println("공군기 발진");
    }

    public void fly() {
        System.out.println("공군기 비행");
    }

    public abstract void attack();

    public void land() {
        System.out.println("공군기 착륙");
    }
}
