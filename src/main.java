public class main {

    public static void main(String[] args) {

        Card[] cards = new Card[52];

        for (int i = 0; i < cards.length; i++) {

            Card placeHold = new Card( "notAssigned", 0);
            cards[i] = placeHold;

        }

        DeckOfCards d = new DeckOfCards(cards);

        for (int i = 0; i < 52; i++) {

            Card current = new Card();

            current = d.dealCard();

            System.out.println(current.toString());

        }

    }

}
