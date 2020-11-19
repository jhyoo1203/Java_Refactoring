package kr.ac.gwnu.computer;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class StudentTest {
    Student student = new Student("0001", "홍길동");
    @Test
    public void test_constructor() {
        assertNotNull(student);
    }
}
