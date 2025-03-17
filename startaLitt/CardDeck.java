package startaLitt;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CardDeck{
   
    ArrayList<Card> cards = new ArrayList<>();


    public CardDeck(int n){
        if (n > 13  || n < 0){
            throw new IllegalArgumentException("N må være mellom 1 og 13");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0){
                    Card card = new Card('S', j+1);
                    cards.add(card);
                }
                if (i == 1){
                    Card card = new Card('H', j+1);
                    cards.add(card);
                }
                if (i == 2){
                    Card card = new Card('D', j+1);
                    cards.add(card);
                }
                if (i == 3){
                    Card card = new Card('C', j+1);
                    cards.add(card);
                }
        }
        }
    }

    public int getCardCount(){
        /* int x = 0;
        for (Card card : cards) {
            x++;
        } */
        return cards.size();
    }
    public Card getCard(int y){
        Card dette = cards.get(y);
        return dette;
    }
    public void shufflePerfectly(){
        ArrayList<Card> ny_liste1 = new ArrayList<>();
        ArrayList<Card> ny_liste2 = new ArrayList<>();
        ArrayList<Card> ny_liste3 = new ArrayList<>();

        for (int i = 0; i < cards.size(); i++) {
            if (i < (cards.size()/2)){
                ny_liste1.add(cards.get(i));
            }
            else{
                ny_liste2.add(cards.get(i));
            }
        }
        for (int i = 0; i < cards.size(); i++) {
            if (i % 2 == 0){
                ny_liste3.add(ny_liste1.get(0));
                ny_liste1.remove(0);
            }
            else{
                ny_liste3.add(ny_liste2.get(0));
                ny_liste2.remove(0);
            }
        }
        cards = ny_liste3;
    }

    public void deal(CardHand hand, int x){
        if (x > cards.size()){
            x = cards.size();
        }
        
        for (int i = 0; i < x; i++) {   
            hand.addCard(cards.getLast());
            cards.remove(cards.getLast());
        }
    }
    //oving 5:

    public boolean hasCard(Predicate<Card> pred){
        if (pred == null){
            throw new IllegalArgumentException("Kan ikkje verre null.");
        }
        for (Card card : cards) {
            if (pred.test(card)){
                return true;
            }
        }
        return false;
    }

    public int getCardCount(Predicate<Card> predicate){
        if (predicate == null){
            throw new IllegalArgumentException("Kan ikkje vere null.");
        }
        int i = 0;
        for (Card card : cards) {
            if (predicate.test(card)){
                i++;
            }
        }
        return i;
    }
    public List<Card> getCards(Predicate<Card> predicate){
        if (predicate == null){
            throw new IllegalArgumentException("Kan ikkje vere null.");
        }
        List<Card> svar = new ArrayList<Card>();
        for (Card card : cards) {
            if (predicate.test(card)){
                svar.add(card);
            }
        }
        return svar;
        
        }



     
    public static void main(String[] args) {
        CardDeck deck = new CardDeck(1);
        //Card kort = new Card('H', 13);
        Predicate<Card> predicate = c -> c.getFace() == 13 && c.getSuit() == 'H';
        Predicate<Card> predicateSuit = c -> c.getSuit() == 'H';

        System.out.println(deck.getCardCount());
        System.out.println(deck.hasCard(predicate));
        System.out.println(deck.getCardCount(predicate));
        System.out.println(deck.getCards(predicateSuit));
        System.out.println(deck);
    }
}
