package startaLitt;

public class Card {
    public char suit;
    public String face;
    public int value;
    public Comparable<Card> comparable;
    
    public Card(char suit, int face) {
        if (!checkValidCard(suit, face)){
            throw new IllegalArgumentException("Ugyldig kort");
        }
        this.suit = suit;
        if (face >= 2 && face <= 10) {
            this.face = Integer.toString(face);
            this.value = face;
        } else if (face >= 11 && face <= 13) {
            this.value = 10;
        }
        switch (face) {
            case 1:
                this.face = "A";
                this.value = 11;
                break;
            case 11:
                this.face = "J";
                break;
            case 12:
                this.face = "Q";
                break;
            case 13:
                this.face = "K";
                break;
            default:
                break;
        }

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

    public String getFace() {
        return face;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(suit) + String.valueOf(face);
    }
}
