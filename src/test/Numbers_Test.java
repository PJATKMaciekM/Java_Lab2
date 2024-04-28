package test;

import main.Numbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class Numbers_Test {
    private Numbers numbers;


    @Test
    void test_get_A() {
        numbers = new Numbers();
        assertEquals(0, numbers.getA());
    }
    @Test
    void test_set_B() {
        numbers = new Numbers();
        numbers.setB(6);
        assertEquals(6, numbers.getB());
    }
    @Test
    void test_sum() {
        numbers = new Numbers(5,2,9);
        assertEquals(16, numbers.sum());
    }
    @Test
    void test_average() {
        numbers = new Numbers(4,2,3);
        assertEquals(3, numbers.average());
    }
    @Test
    void test_max() {
        numbers = new Numbers(4,10,321);
        assertEquals(321, numbers.max());
    }
    @Test
    void test_min() {
        numbers = new Numbers(4,-10,21);
        assertEquals(-10, numbers.min());
    }
    @Test
    void test_geometric() {
        numbers = new Numbers(5,5,5);
        assertEquals(5, numbers.geometric());
    }

}
