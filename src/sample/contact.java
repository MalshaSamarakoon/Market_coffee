package sample;

import com.jfoenix.controls.JFXButton;
import com.sun.javafx.application.HostServicesDelegate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class contact {

    @FXML
    private JFXButton close;

    @FXML
    private JFXButton twt;

    @FXML
    private JFXButton fb;

    @FXML
    private JFXButton inst;

    @FXML
    void close_click(ActionEvent event) {

        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    @FXML
    void fb_click (ActionEvent actionEvent) throws Exception {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("http://www.facebook.com"));

        } catch (IOException err) {

        }
    }

    @FXML
    void inst_click(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.instagram.com"));

        } catch (IOException | URISyntaxException err) {

        }
    }

    @FXML
    void twit_click(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("http://www.twitter.com"));

        } catch (IOException | URISyntaxException err) {

        }
    }

}

