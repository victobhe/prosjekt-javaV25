package startaLitt;

import java.lang.classfile.Label;

import javafx.scene.control.Button;

public class Controller {
    
    //Knapper og div
    @FXML
    private Button Hit;
    
    @FXML
    private Button Stand;  
    
    @FXML
    private Label pengePung;

    @FXML
    private Label totalSum;



    private int playerScore = 0;
    private int dealerScore = 0;
    
    

    public void handleHit(){
        playerScore += addCard();
    }


}
