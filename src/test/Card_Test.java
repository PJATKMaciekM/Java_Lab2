package test;

import main.Card;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Card_Test {
    private Card card;
    private Card card2;
    private Card card3;
    @Test
    void testCard() {
        card = new Card();
        card.setSuit(Card.Suit.CLUBS);
        assertEquals(card.getSuit(), Card.Suit.CLUBS);
    }
    @Test
    void testGetSuit() {
        card = new Card(Card.Suit.HEARTS, 7);
        assertEquals(card.getSuit(), Card.Suit.HEARTS);
    }
    @Test
    void testSetSuit() {
        card = new Card(Card.Suit.HEARTS, 7);
        card.setSuit(Card.Suit.SPADES);
        assertEquals(card.getSuit(), Card.Suit.SPADES);
    }
    @Test
    void testGetValue() {
        card = new Card(Card.Suit.CLUBS, 5);
        assertEquals(5, card.getValue());
    }
    @Test
    void testSetValue() {
        card = new Card(Card.Suit.SPADES, 9);
        card.setValue(5);
        assertEquals(5, card.getValue());
    }
    @Test
    void testgetRank(){
        card = new Card(Card.Suit.DIAMONDS, "Queen");
        assertEquals("Queen", card.getRank());
    }
    @Test
    void testsetRank(){
        card = new Card(Card.Suit.DIAMONDS, "King");
        card.setRank("Ace");
        assertEquals("Ace", card.getRank());
    }
    @Test
    void testgetRankValue(){
        card = new Card(Card.Suit.DIAMONDS, "King");
        assertEquals(13, card.getRankValue());
    }
    @Test
    void testsetRankValue2(){
        card3= new Card(Card.Suit.SPADES, "Jack");
        assertEquals(11, card3.getRankValue());
    }
    @Test
    void testComparison(){
        card = new Card(Card.Suit.CLUBS, 5);
        card2 = new Card(Card.Suit.DIAMONDS, 9);
        assertEquals("Karta druga przebija pierwszą!", card.announceCompare(card,card2));
    }
    @Test
    void testComparison2(){
        card2 = new Card(Card.Suit.DIAMONDS, 5);
        card3 = new Card(Card.Suit.SPADES, "Jack");
        assertEquals("Karta druga przebija pierwszą!", card2.announceCompare(card2,card3));
    }
    @Test
    void testCompare3(){
        card = new Card(Card.Suit.HEARTS, "Ace");
        card2 = new Card(Card.Suit.CLUBS, "King");
        assertEquals("Karta pierwsza przebija drugą!", card.announceCompare(card,card2));
    }
    @Test
    void testCompare4(){
        card = new Card(Card.Suit.HEARTS, "Jack");
        card3 = new Card(Card.Suit.CLUBS, "Jack");
        assertEquals("Karty są sobie równe!", card.announceCompare(card,card3));
    }
}
