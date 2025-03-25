package startaLitt;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    ArrayList<Card> cards = new ArrayList<>();


    public CardDeck(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card card = null;
                switch (i) {
                    case 0:
                        card = new Card('S', j+1);
                        break;
                    case 1:
                        card = new Card('H', j+1);
                        break;
                    case 2:
                        card = new Card('D', j+1);
                        break;
                    case 3:
                        card = new Card('C', j+1);
                        break;
                    default:
                        break;
                }
                cards.add(card);
        }
        }
    }

    public int getCardCount(){
        return cards.size();
    }

    public Card getCard(int y){
        Card dette = cards.get(y);
        return dette;
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public Card deal(){
        return cards.remove(0);
    }

    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        System.out.println(deck);
        deck.shuffleDeck();
        System.out.println(deck);
    }
}
