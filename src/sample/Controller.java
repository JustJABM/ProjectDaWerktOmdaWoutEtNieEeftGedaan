package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField txtGetal1;
    public TextField txtGetal2;
    public Label lblResultaat;

    public void plus_clicked(MouseEvent mouseEvent) {
        int kaas = Integer.parseInt(txtGetal1.getText()) + Integer.parseInt(txtGetal2.getText());
        lblResultaat.setText(String.valueOf(kaas));
    }
}
