<<<<<<< HEAD
package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField txtGetal1;
    public TextField txtGetal2;
    public Label lblResultaat;

    public void plus_clicked(MouseEvent mouseEvent) {
        try {
            int kaas = Integer.parseInt(txtGetal1.getText()) + Integer.parseInt(txtGetal2.getText());
            lblResultaat.setText(String.valueOf(kaas));
        }
        catch (Exception e)
        {
            lblResultaat.setText("probeer onpnieuw en vul getal in");
        }
    }


}
=======
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
>>>>>>> branchKevdc
