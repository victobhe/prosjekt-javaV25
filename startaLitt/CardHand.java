package startaLitt;

import java.util.ArrayList;

public class CardHand {
    public int PengePung;
    public int CardHandSum;
    
    ArrayList<Card> myCards = new ArrayList<>();

    public void addCard(Card card){
        if (under21()){
            myCards.add(card);
        }
    }
    public Card getLastCard(){
        return myCards.get(-1);
    }

    public int getSumCard(){
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
