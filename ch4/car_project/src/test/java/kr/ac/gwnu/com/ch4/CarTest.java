package kr.ac.gwnu.com.ch4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CarTest {
    @Test
    public void testConstructor() {
        Car car = new Car("Sonata");
        assertNotNull(car);
    }

    @Test
    public void test_getName() {
        Car car = new Car("Sonata");
        assertEquals("Sonata", car.getName());
    }

    @Test
    public void test_start() {
        Car car = new Car("Sonata");
        car.start();
        assertEquals(20, car.getSpeed());
    }

    @Test
    public void test_accelerate() {
        Car car = new Car("Sonata");
        car.start();
        car.accelerate();
        assertEquals(50, car.getSpeed());
    }

    @Test
    public void test_stop() {
        Car car = new Car("Sonata");
        car.start();
        car.accelerate();
        car.stop();
        assertEquals(0, car.getSpeed());
    }
}
