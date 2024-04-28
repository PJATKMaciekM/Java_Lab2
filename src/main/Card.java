package main;

public class Card {
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
    private Suit suit;
    private int value;
    private String[] ranks = {"Jack", "Queen", "King", "Ace"};
    private String rank;
    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }
    public Card(Suit suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.value = this.getRankValue();
    }
    public Card(){}
    public Suit getSuit() {
        return suit;
    }
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public int getRankValue() {
        for (int i = 0; i < ranks.length; i++){
            if (ranks[i].equals(rank)){
                return i+11;
            }
        }
        return 0;
    }
    private int Compare(Card card, Card otherCard){
        if(card.getValue() > otherCard.getValue()){
            return 1;
        } else if (card.getValue() < otherCard.getValue()) {
            return 2;
        }else{
            return 0;
        }
    }
    public String announceCompare(Card card, Card otherCard){
        return switch (Compare(card, otherCard)) {
            case 1 -> "Karta pierwsza przebija drugą!";
            case 2 -> "Karta druga przebija pierwszą!";
            case 0 -> "Karty są sobie równe!";
            default -> "Error!";
        };

    }
}
