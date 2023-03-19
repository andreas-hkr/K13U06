public class Main {
    public static void main(String[] args) {
        // - Skapa en klass som kan representera ett kort från en kortlek
        // - Använd konstanter för att representera färg
        //     KLÖVER (CLUB) = 0            RUTER (DIAMOND) = 1
        //     HJÄRTER (HEART)  = 2         SPADER (SPADES) = 3
        //
        // Skapa två objekt (Spader Dam och Klöver 7)

        Card card1 = new Card();
        card1.suit = Card.SPADES;
        card1.rank = 12;

        Card card2 = new Card();
        card2.suit = Card.CLUBS;
        card2.rank = 7;

    }
}

class Card {
    static final int CLUBS = 0;
    static final int DIAMONDS = 1;
    static final int HEARTS = 2;
    static final int SPADES = 3;

    int suit;
    int rank;
}