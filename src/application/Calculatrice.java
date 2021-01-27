package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculatrice {

    @FXML
    private Label lblReponse;

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private Button btnValider;

    @FXML
    void afficher() {	
    	int num1 = Integer.parseInt(txtNum1.getText());
    	int num2 = Integer.parseInt(txtNum2.getText());
    	lblReponse.setText(""+(num1+num2));
    }
}

