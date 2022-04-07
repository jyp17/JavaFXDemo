package application;

import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class FXMLController implements Initializable {
    private static int count = 0;

    @FXML
    Button myButton;

    @FXML
    Label myLabel;

    @FXML
    protected void incrementCountButtonAction(ActionEvent event) {
        count++;
        myLabel.setText(String.valueOf(count));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myButton.setText("Count");
        myLabel.setText("0");
    }

}
