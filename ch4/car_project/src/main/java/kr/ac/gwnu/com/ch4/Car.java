package kr.ac.gwnu.com.ch4;

public class Car {
    private String name;
    private int speed;

    public Car() {
        this.name = null;
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

	public void start() {
        this.speed = 20;
	}

	public Object getSpeed() {
		return this.speed;
	}

	public void accelerate() {
        this.speed += 30;
	}

	public void stop() {
        this.speed = 0;
	}

    
}
