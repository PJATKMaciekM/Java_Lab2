package test;

import main.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Student_Test {
    private Student student;
    private Student student2;
    private Student student3;

    @Test
    void testStudent() {
        student = new Student();
        assertEquals("Unknown", student.getName());
    }
    @Test
    void testgetName() {
        student = new Student("Maciek", "Moroz", 32006, 5, 70);
        assertEquals("Maciek", student.getName());
    }
    @Test
    void testsetName() {
        student2 = new Student();
        student2.setName("Edward");
        assertEquals("Edward", student2.getName());
    }
    @Test
    void testgetSurname() {
        student3 = new Student("Maciek", "Moroz", 32006, 5, 70);
        assertEquals("Moroz", student3.getSurname());
    }
    @Test
    void testsetSurname() {
        student2 = new Student();
        student2.setSurname("Ompfing");
        assertEquals("Ompfing", student2.getSurname());
    }
    @Test
    void testgetIdx() {
        student = new Student("Maciek", "Moroz", 32006, 5, 70);
        assertEquals(32006, student.getIdx());
    }
    @Test
    void testsetIdx() {
        student2 = new Student();
        student2.setIdx(12345);
        assertEquals(12345, student2.getIdx());
    }
    @Test
    void testgetMark() {
        student = new Student("Maciek", "Moroz", 32006, 5, 70);
        assertEquals(5, student.getMark());
    }
    @Test
    void testsetMark() {
        student3 = new Student();
        student3.setMark(3);
        assertEquals(3, student3.getMark());
    }
    @Test
    void testgetAttendance() {
        student = new Student("Maciek", "Moroz", 32006, 5, 70.4f);
        assertEquals(70.4f, student.getAttendance());
    }
    @Test
    void testsetAttendance() {
        student2 = new Student();
        student2.setAttendance(20.3f);
        assertEquals(20.3f, student2.getAttendance());
    }
    @Test
    void testfailMark() {
        student = new Student("Maciek", "Moroz", 32006, 5, 70);
        student.failMark();
        assertEquals(5, student.getMark());
    }
    @Test
    void testfailMark2() {
        student3 = new Student();
        student3.setMark(4);
        student3.setAttendance(32.4f);
        student3.failMark();
        assertEquals(2, student3.getMark());
    }
}
