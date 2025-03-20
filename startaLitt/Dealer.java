package startaLitt;

import java.util.ArrayList;

public class Dealer extends CardHand{
    public int totalsum;
    public int mustBeat;
    
    ArrayList<Card> myCards = new ArrayList<>();

    public Dealer(CardHand motspiller){
        this.mustBeat = motspiller.getSumCard();
    }
    
    public void addCard(Card card){
        myCards.add(card);
        totalsum += card.getFace();
    }

    //Tror at denne blir viktig når man skal implementere enkeltkort som skal dukke opp på skjermen.
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
    //dealer er alltid nødt til å slå summen til motspiller, men dersom det er flere spillere skal dealer stå på x>17 og hitte på x<17
    //returnerer true om man skal hitte
    public boolean standOrHit() {
        if (totalsum < mustBeat){
            return true;
        }
        return false;
    }

    public boolean under21(){
        return getSumCard() > 21;
    }
    
    /* public boolean Play(){
        while (standOrHit()) {
            

        }
    } */

}