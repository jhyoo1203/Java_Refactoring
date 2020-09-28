package kr.ac.gwnu.com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalendarTest {
    @Test
    public void test_constructor() {
        Calendar calendar = new Calendar();
        assertNotNull(calendar);
    }

    @Test
    public void test_askDay_20200922() {
        Calendar calendar = new Calendar();
        assertEquals("화요일", calendar.askDay(2020, 9, 22));
    }

    @Test
    public void test_askDay_20200921() {
        Calendar calendar = new Calendar();
        assertEquals("월요일", calendar.askDay(2020, 9, 21));
    }

    @Test
    public void test_askDay_20200205() {
        Calendar calendar = new Calendar();
        assertEquals("수요일", calendar.askDay(2020, 02, 05));
    }

    @Test
    public void test_askDay_20200301() {
        Calendar calendar = new Calendar();
        assertEquals("일요일", calendar.askDay(2020, 03, 01));
    }
}
