package startaLitt;

import java.util.ArrayList;

public class CardHand {
     public int totalsum;
    
    ArrayList<Card> myCards = new ArrayList<>();

    public void addCard(Card card){
        if (under21()){
            myCards.add(card);
        } else {
            throw new IllegalArgumentException("tapt");
        }
    }
    public Card getLastCard(){
        return myCards.get(-1);
    }

    public int getCardCount(){
        int sum = 0;
        for (Card card : myCards) {
            sum += card.getFace();
        }
        return sum;
    }

    public boolean under21(){
        int sum = 0;
        for (Card card : myCards) {
            sum += card.getFace();
        }
        return (sum > 21);
    }


















    }
