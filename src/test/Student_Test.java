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
        student3 = new Student("Maciek", "Moroz", 32006, 5, 70);
        assertEquals("Maciek", student3.getName());
    }
    @Test
    void testsetName() {
        student2 = new Student();
        student2.setName("Edward");
        assertEquals("Edward", student2.getName());
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
    @Test
    void testfailMark3() {
        student2 = new Student("Maciek", "Moroz", 32006, 5, 49.5f);
        assertEquals(2, student2.getMark());
    }
}
