package test;

import main.Clock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Clock_Test {
    private Clock clock;
    private Clock clock2;

    @Test
    public void testClock() {
        clock = new Clock();
        assertEquals(12,clock.getHours());
    }
    @Test
    public void testClock2() {
        clock2 = new Clock(14,36,15);
        assertEquals(36,clock2.getMinutes());
    }
    @Test
    public void testClock3() {
        clock = new Clock(67281);
        assertEquals(18,clock.getHours());
    }
    @Test
    public void testsetHours() {
        clock2 = new Clock();
        clock2.setHours(4);
        assertEquals(4,clock2.getHours());
    }
    @Test
    public void testsetHours2() {
        clock2 = new Clock();
        Exception exception = assertThrows(RuntimeException.class, () -> clock2.setHours(44));
        String expectedMessage = "Invalid hours value. Must be between 0 and 23.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testsetMinutes() {
        clock = new Clock();
        clock.setMinutes(5);
        assertEquals(5,clock.getMinutes());
    }
    @Test
    public void testsetMinutes2() {
        clock2 = new Clock();
        Exception exception = assertThrows(RuntimeException.class, () -> clock2.setMinutes(414));
        String expectedMessage = "Invalid minutes value. Must be between 0 and 59.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testsetSeconds() {
        clock = new Clock();
        clock.setSeconds(57);
        assertEquals(57,clock.getSeconds());
    }
    @Test
    public void testsetSeconds2() {
        clock2 = new Clock();
        Exception exception = assertThrows(RuntimeException.class, () -> clock2.setSeconds(414));
        String expectedMessage = "Invalid seconds value. Must be between 0 and 59.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testtick() {
        clock = new Clock();
        clock.tick();
        assertEquals(1,clock.getSeconds());
    }
    @Test
    public void testtick2() {
        clock2 = new Clock(20,51,59);
        clock2.tick();
        assertEquals(0,clock2.getSeconds());
    }
    @Test
    public void testtick3() {
        clock = new Clock(23,59,59);
        clock.tick();
        assertEquals(0,clock.getHours());
    }
    @Test
    public void testtickDown() {
        clock = new Clock();
        clock.tickDown();
        assertEquals(11,clock.getHours());
    }
    @Test
    public void testtickDown2() {
        clock2 = new Clock(17,36,25);
        clock2.tickDown();
        assertEquals(24,clock2.getSeconds());
    }
    @Test
    public void testtickDown3() {
        clock2 = new Clock(17,36,0);
        clock2.tickDown();
        assertEquals(35,clock2.getMinutes());
    }
    @Test
    public void testtoString() {
        clock = new Clock(5,48,52);
        assertEquals("[05:48:52]",clock.toString());
    }
    @Test
    public void testtoString2() {
        clock2 = new Clock(23,24,12);
        assertEquals("[23:24:12]",clock2.toString());
    }


}
