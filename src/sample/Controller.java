package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField txtGetal1;
    public TextField txtGetal2;
    public Label lblResultaat;

    public void click_btnMaal(MouseEvent mouseEvent) {

        try {
            int getal1 = Integer.parseInt(txtGetal1.getText());
            int getal2 = Integer.parseInt(txtGetal2.getText());

            lblResultaat.setText(String.valueOf(getal1*getal2));
        }
        catch (Exception e) {
            lblResultaat.setText(String.valueOf(e));
        }
    }

}
