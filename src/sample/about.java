package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class about {

    @FXML
    private JFXButton close;

    @FXML
    void close_click(ActionEvent event) {

        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

}
