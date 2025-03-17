package startaLitt;

import java.util.Comparator;

public class Card implements Comparator<Card> {
    public char suit;
    public int face;
    public Comparable<Card> comparable;
    
    public Card(char suit, int face) {
        if (!checkValidCard(suit, face)){
            throw new IllegalArgumentException("Uglydig kort");
        }
        this.face = face;
        this.suit = suit;

    }
    
    public boolean checkValidCard(char suit, int face){
        if (suit != 'H' && suit != 'C' && suit != 'S' && suit != 'D' ){
            return false;
        }
        if (face < 1 || face > 13){
            return false;
        }
        return true;
    }

    public char getSuit() {
        return suit;
    }

    public int getFace() {
        return face;
    }

    @Override
    public String toString() {
        return String.valueOf(suit) + String.valueOf(face);
    }

    @SuppressWarnings("unused")
    private static final String[] SuitOrder = {
        "H", "D", "C", "S"
    };

    @Override
    public int compare(Card o1, Card o2) {
        o1.compare(o1, o2);
        
        //sammenlikner korttall først
        return Integer.compare(o1.getFace(), o2.getFace());
        
    }
    

    public static void main(String[] args) {
        Card card = new Card('S', 1);
        System.out.println(card);
    }

}
