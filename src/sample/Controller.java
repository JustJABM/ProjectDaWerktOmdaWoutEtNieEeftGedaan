package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField txtGetal1;
    public TextField txtGetal2;
    public Label lblResultaat;
    public Button deelknop;

    public void delen(ActionEvent actionEvent) {
        double eerste, tweede;
        try{
            eerste = Double.parseDouble(txtGetal1.getText());
            tweede = Double.parseDouble(txtGetal2.getText());
            double resultaat = eerste/tweede;
            lblResultaat.setText(String.valueOf(resultaat));
        }catch(Exception e){
            lblResultaat.setText("Geef getallen in.");
        }
    }
}
