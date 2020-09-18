package report;

public class Mammal implements AnimalAble {
    private String name;

    public Mammal() {
        this.name = null;
    }

    public Mammal(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("달리기");
    }

    @Override
    public void walk() {
        System.out.println("걷기");
    }

    @Override
    public void sleep() {
        System.out.println("잠듦");
    }

    @Override
    public void AnimalType() {
        System.out.println("포유류");
    }

    public void AnimalName() {
        System.out.println(this.name);
    }
}
