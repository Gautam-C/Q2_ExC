public class Card {

    private String suit;
    private int value;

    public Card(String suit1, int value1) {

        suit = suit1;
        value = value1;

    }

    public Card() {

        suit = "stupid";
        value = 26;

    }

    public String getSuit() {

        return suit;

    }

    public int getValue() {

        return value;

    }

    public void setValue(int newVal) {

        value = newVal;

    }

    public void setSuit(String newSuit) {

        suit = newSuit;

    }

    public String toString() {

        return "Suit : " + suit + " | Value : " + value;

    }

    public boolean equals(Card c) {

        return (c.getValue() == getValue()) && (getSuit().equals(c.getSuit()));

    }

}
