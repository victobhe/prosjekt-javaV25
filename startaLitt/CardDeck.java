package startaLitt;

import java.util.ArrayList;

public class CardDeck{
   
    ArrayList<Card> cards = new ArrayList<>();


    public CardDeck(){
        int n = 13;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
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
                if (card != null){
                    cards.add(card);
                }
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
        
    public static void main(String[] args) {
   
    }
}
