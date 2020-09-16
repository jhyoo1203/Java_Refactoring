package wargame;

public class Fighter1 implements AirForcePlaneAble {
    private int missile;

    public Fighter1() {
        this.missile = 0;
    }

    public Fighter1(int missile) {
        this.missile = missile;
    }

    @Override
    public void takeOff() {
        System.out.println("전투기 발진");
    }

    @Override
    public void fly() {
        System.out.println("전투기 비행");
    }

    @Override
    public void attack() {
        while (this.missile != 0) {
            System.out.println("미사일 발사");
            this.missile--;
        }
    }

    @Override
    public void land() {
        System.out.println("전투기 착륙");
    }

    @Override
    public void displayPlaneType() {
        System.out.println("전투기");
    }
}
