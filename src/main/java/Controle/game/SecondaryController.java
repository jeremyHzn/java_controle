package Controle.game;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    private void switchToSecondary() throws IOException {
    	System.out.println(App.getPseudo());
    	String pseudo = App.getPseudo();
    	Label label = new Label(pseudo);
    	
    }
    
}
