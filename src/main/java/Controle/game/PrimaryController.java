package Controle.game;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
	@FXML
	private TextField txtPseudo;
	
	
    @FXML
    private void jouer() throws IOException {  	
    	String pseudo = txtPseudo.getText();
    	App.setPseudo(pseudo);
    	App.setRoot("secondary");
    }
    
    
}
