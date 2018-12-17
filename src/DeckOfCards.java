public class DeckOfCards {

    private Card[] deck;

    private int quant;

    public DeckOfCards(Card[] deck1) {

        deck = deck1;

        quant = 52;

    }

    public Card dealCard() {

        Card c = new Card();

        int sRand = (int)(Math.random() * 4) + 1;

        if (sRand == 1) {

            c.setSuit("clubs");

        }

        if (sRand == 2) {

            c.setSuit("hearts");

        }

        if (sRand == 3) {

            c.setSuit("diamonds");

        }

        if (sRand == 4) {

            c.setSuit("spades");

        }

        c.setValue((int)(Math.random() * 13) + 1);

        for (int i = 0; i < deck.length; i++) {

            if (deck[i].equals(c)) {

                sRand = (int)(Math.random() * 4) + 1;

                if (sRand == 1) {

                    c.setSuit("clubs");

                }

                if (sRand == 2) {

                    c.setSuit("hearts");

                }

                if (sRand == 3) {

                    c.setSuit("diamonds");

                }

                if (sRand == 4) {

                    c.setSuit("spades");

                }

                c.setValue((int)(Math.random() * 52) + 1);

                i = 0;
            }

        }

        quant--;



        return c;
    }

    public int quantLeft() {

        return quant;

    }



}
