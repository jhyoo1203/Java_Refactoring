package kr.ac.gwnu.computer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MajorTest {
    Major computer;

    @Before
    public void setUp() {
        computer = new Major("컴퓨터 공학", 3);
    }

    @After
    public void tearDown() {
        computer = null;
    } 

    @Test
    public void test_constructor() {
        assertNotNull(computer);
        assertEquals("컴퓨터 공학", computer.getTitle());
        assertEquals(3, computer.getMaxStudent());
    }

    @Test
    public void test_add_1_student() {
        computer.add(new Student("0001", "홍길동"));
        assertEquals(1, computer.getNumberOfStudent());
    }

    @Test
    public void test_add_2_student() {
        computer.add(new Student("0001", "홍길동"));
        computer.add(new Student("0002", "이몽룡"));
        assertEquals(2, computer.getNumberOfStudent());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_add_4_student() {
        computer.add(new Student("0001", "홍길동"));
        computer.add(new Student("0002", "이몽룡"));
        computer.add(new Student("0003", "심청"));
        computer.add(new Student("0004", "변학도"));
    }

    @Test
    public void test_getStudentAt() {
        computer.add(new Student("0001", "홍길동"));
        computer.add(new Student("0002", "이몽룡"));
        computer.add(new Student("0003", "심청"));

        Student student = computer.getStudentAt(1);
        assertEquals("0001", student.getID());
        assertEquals("홍길동", student.getName());
        assertTrue(student.equals(new Student("0001", "홍길동")));
    }

    @Test
    public void test_iterator() {
        Iterator studentIterator = computer.iterator();
        assertNotNull(studentIterator);
    }
}