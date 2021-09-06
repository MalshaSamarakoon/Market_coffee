package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private JFXTextField uname;

    @FXML
    private JFXPasswordField pword;

    @FXML
    private JFXButton login;

    @FXML
    private Label output;

    @FXML
    private JFXButton close;


    @FXML
    void close_click(ActionEvent event) {


            Stage stage = (Stage) close.getScene().getWindow();
            stage.close();
        }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    @FXML
    void log_click(ActionEvent event)  {/*
        String name = uname.getText();
         String pw = pword.getText();

        if (uname.equals("") && pword.equals("")){
            output.setText("abs");

        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/superpos", "root", "");
                pst = con.prepareStatement("select * from login where user_name=? and p_word=?");

                pst.setString(1,name);
                pst.setString(1,pw);

                rs=pst.executeQuery();

                if(rs.next()){
                    output.setText("success");
                }
                else{
                    output.setText("fail");

                }

            }catch (ClassNotFoundException ex){
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,null,ex);

            }catch(SQLException ex){
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,null,ex);
            }
        }



        }*/


        if (!uname.getText().toString().trim().equals("") && !pword.getText().toString().trim().equals("")) {
            if (!uname.getText().toString().trim().equals("abc") && !pword.getText().toString().trim().equals("abc")) {
                output.setText("Incorrect Credentials");
            }
            else {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("market.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.initStyle(StageStyle.TRANSPARENT);
                    stage.setScene(new Scene(root1));
                    stage.setTitle("Market");
                    stage.show();
                }
                catch (Exception e){
                    output.setText("Market Can not be loaded!!");
                }

            }
        }
        else { output.setText("Enter Usename and Password");

        }
    /*        if(uname.getText().isEmpty()==false && pword.getText().isEmpty()==false) {
                output.setText(" Welcome to Ambrosia!!");
                validateLogin();
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("market.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.initStyle(StageStyle.TRANSPARENT);
                    stage.setScene(new Scene(root1));
                    stage.setTitle("Market");
                    stage.show();
                }

                catch (Exception e){
                    output.setText("Market Can not be loaded!!");
                }
            }*/
        }
        private void validateLogin() {
            DatabaseConnection connectNow = new DatabaseConnection();
            Connection connectDB = connectNow.getConnection();

            String verifyLogin = "SELECT count(1) FROM login WHERE uname =  '" + uname.getText() + "' AND pword = ' " + pword.getText() + "'";

            try {
                Statement statement = connectDB.createStatement();
                ResultSet queryResult = statement.executeQuery(verifyLogin);

                while (queryResult.next()) {

                    if (queryResult.getInt(1) == 1) {

                     output.setText("Welcome to Ambrosia");

                    } else {

                        output.setText("Market Can not be loaded!!");

                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }
        }



    @FXML
    void initialize() {
        assert uname != null : "fx:id=\"uname\" was not injected: check your FXML file 'sample.fxml'.";
        assert pword != null : "fx:id=\"pword\" was not injected: check your FXML file 'sample.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'sample.fxml'.";

    }}



