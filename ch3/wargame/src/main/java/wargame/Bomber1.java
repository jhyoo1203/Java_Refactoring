package wargame;

public class Bomber1 implements AirForcePlaneAble {
    private int bomb;

    public Bomber1() {
        this.bomb = 0;
    }

    public Bomber1(int bomb) {
        this.bomb = bomb;
    }

    @Override
    public void takeOff() {
        System.out.println("폭격기 발진");
    }

    @Override
    public void fly() {
        System.out.println("폭격기 비행");
    }

    @Override
    public void attack() {
        while (this.bomb != 0) {
            System.out.println("폭탄 투하");
            this.bomb--;
        }
    }

    @Override
    public void land() {
        System.out.println("폭격기 착륙");
    }

    @Override
    public void displayPlaneType() {
        System.out.println("폭격기");
    }
}
