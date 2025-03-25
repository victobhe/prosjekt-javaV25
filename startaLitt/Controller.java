package startaLitt;

import java.lang.classfile.Label;

import javax.swing.plaf.SliderUI;

public class Controller {
    
    //Knapper og div
    @FXML
    private Button Hit;
    
    @FXML
    private Button Stand;  
    
    @FXML
    private Label operator;

    @FXML
    private Label totalSum;

    @FXML
    private SliderUI bett;



    private int playerScore = 0;
    private int dealerScore = 0;
    private double penger = 100;
    
    CardDeck deck = new CardDeck();
    CardHand player = new CardHand();
    Dealer dealer = new Dealer(player);

    
    @FXML
    public void handleHit(){
        Card kort = deck.deal();
        player.addCard(kort);
        playerScore += kort.getValue();
    }

    @FXML
    public void handleStand(){
        //dealer.play();
    }

    public boolean didPlayerWin(){
        if (playerScore > 21){
            return false;
        }
        if (dealerScore < 22 && dealerScore > playerScore){
            return false;
        }
        return true;
    }
    @FXML
    public void updatePenger(){
        if (didPlayerWin()){
            penger *= 2;
            operator.setText("Hello");
        }else{
            penger -= bett;
        }
    }


}
