package test;

import main.MyDate;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertThat;


import static org.junit.jupiter.api.Assertions.*;
public class MyDate_Test {
    private MyDate myDate;
    private MyDate myDate2;

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void testConstructor() {
        myDate = new MyDate(2024,04,28);
        assertEquals(2024,myDate.getYear());
    }
    @Test
    public void MyDate_Test() {
        myDate = new MyDate(2024,05,30);
        assertEquals(30, myDate.getDay());
    }
    @Test
    public void testsetYear() {
        myDate2 = new MyDate(2000, 1, 5);
        myDate2.setYear(1995);
        assertEquals(1995, myDate2.getYear());
    }
    @Test
    public void testsetYear1() {
        myDate2 = new MyDate(2024,10,25);
        Exception exception = assertThrows(RuntimeException.class, () -> myDate2.setYear(2067));
        String expectedMessage = "Year out of scope";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

    }
    @Test
    public void testsetMonth() {
        myDate = new MyDate(2049, 7, 12);
        myDate.setMonth(12);
        assertEquals(12, myDate.getMonth());
    }
    @Test
    public void testsetMonth1() {
        myDate2 = new MyDate(2049, 7, 12);
        Exception exception = assertThrows(RuntimeException.class, () -> myDate2.setMonth(13));
        String expectedMessage = "Month out of scope";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testsetDay() {
        myDate = new MyDate(2018, 9, 27);
        myDate.setDay(28);
        assertEquals(28, myDate.getDay());
    }
    @Test
    public void testsetDay1() {
        myDate2 = new MyDate(2018, 9, 27);
        Exception exception = assertThrows(RuntimeException.class, () -> myDate2.setDay(0));
        String expectedMessage = "Day out of scope";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
     public void testsetDay2() {
        myDate2 = new MyDate(2018, 2, 27);
        Exception exception = assertThrows(RuntimeException.class, () -> myDate2.setDay(29));
        String expectedMessage = "Day out of scope";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
     public void testsetDay3() {
        myDate2 = new MyDate(2024, 2, 27);
        myDate2.setDay(29);
        assertEquals(29, myDate2.getDay());
    }
    @Test
    public void testdisplayDate(){
        myDate = new MyDate(2024, 2, 27);
        assertEquals("27/2/2024", myDate.displayDate());
    }
    @Test
    public void testdisplayDate1(){
        myDate = new MyDate(2024, 2, 27);
        myDate.setDay(29);
        myDate.setMonth(12);
        myDate.setYear(1995);
        assertEquals("29/12/1995", myDate.displayDate());
    }



}
