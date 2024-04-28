package test;

import main.Invoice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Invoice_Test {
    private Invoice invoice;
    private Invoice invoice2;

    @Test
    public void testConstructor() {
        invoice = new Invoice("12","Ser",15, 5.99d);
        assertEquals("Ser", invoice.getProduct_description());
    }
    @Test
    public void testgetPricePerItem() {
        invoice = new Invoice("12","Ser",15, 5.99d);
        assertEquals(5.99d, invoice.getPricePerItem());
    }
    @Test
    public void testsetPricePerItem() {
        invoice2 = new Invoice();
        invoice2.setPricePerItem(4.18d);
        assertEquals(4.18d, invoice2.getPricePerItem());
    }
    @Test
    public void testsetPricePerItem2() {
        invoice2 = new Invoice();
        Exception exception = assertThrows(RuntimeException.class, () -> invoice2.setPricePerItem(-6.52d));
        String expectedMessage = "Price per item must be non-negative. Setting to 0.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testsetQuantity() {
        invoice = new Invoice("12","Ser",15, 5.99d);
        invoice.setQuantity(5);
        assertEquals(5, invoice.getQuantity());
    }
    @Test
    public void testsetQuantity2() {
        invoice2 = new Invoice();
        Exception exception = assertThrows(RuntimeException.class, () -> invoice2.setQuantity(-81));
        String expectedMessage = "Quantity must be non-negative. Setting to 0.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testAmount(){
        invoice = new Invoice("12","Ser",15, 5.99d);
        assertEquals("89.85", invoice.Amount());
    }
    @Test
    public void testAmount2() {
        invoice2 = new Invoice();
        invoice2.setQuantity(0);
        invoice2.setPricePerItem(51.9d);
        assertEquals("0", invoice2.Amount());
    }
    @Test
    public void testAmount3() {
        invoice = new Invoice();
        invoice.setQuantity(71);
        invoice.setPricePerItem(0);
        assertEquals("0", invoice.Amount());
    }
}
