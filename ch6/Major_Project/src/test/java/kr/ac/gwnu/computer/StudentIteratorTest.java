package kr.ac.gwnu.computer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentIteratorTest {
    Major computer;
    @Before
    public void setUp() {
        computer = new Major("컴퓨터공학", 3);
    }

    @After
    public void tearDown() {
        computer = null;
    }

    @Test
    public void test_constructor() {
        assertNotNull(new StudentIterator(computer));
    }

    @Test
    public void test_hasNext_0_student() {
        Iterator<Student> comIter = computer.iterator();
        assertFalse("comIter.hasNext() is not false", comIter.hasNext());
    }

    @Test
    public void test_hasNext_1_student() {
        computer.add(new Student("0001", "홍길동"));
        Iterator<Student> comIter = computer.iterator();
        assertTrue(comIter.hasNext());
    }

    @Test
    public void test_next_1_student() {
        computer.add(new Student("0001", "홍길동"));
        Iterator<Student> comIter = computer.iterator();
        Student student = (Student)comIter.next();
        assertEquals("0001", student.getID());
    }
}
