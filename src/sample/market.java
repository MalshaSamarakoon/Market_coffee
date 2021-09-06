package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class market {

    @FXML
    private Label diss;

    @FXML
    private Label disv;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField item;

    @FXML
    private TextField quantity;


    @FXML
    private Button reciept;

    @FXML
    private JFXButton americano;

    @FXML
    private JFXButton espresso;

    @FXML
    private JFXButton black;

    @FXML
    private JFXButton cappuccino;

    @FXML
    private JFXButton irish;

    @FXML
    private JFXButton aulait;

    @FXML
    private JFXButton mocha;

    @FXML
    private JFXButton cortado;

    @FXML
    private JFXButton ice;

    @FXML
    private Label item1;

    @FXML
    private Label item2;

    @FXML
    private Label item3;

    @FXML
    private Label item4;

    @FXML
    private Label item5;

    @FXML
    private Label item6;

    @FXML
    private Label item7;

    @FXML
    private Label item8;

    @FXML
    private Label item9;

    @FXML
    private TextField qua2;

    @FXML
    private TextField qua3;

    @FXML
    private TextField qua4;

    @FXML
    private TextField qua5;

    @FXML
    private TextField qua6;

    @FXML
    private TextField qua7;

    @FXML
    private TextField qua8;

    @FXML
    private TextField qua9;

    @FXML
    private Label p1;

    @FXML
    private Label p2;

    @FXML
    private Label p3;

    @FXML
    private Label p4;

    @FXML
    private Label p5;

    @FXML
    private Label p6;

    @FXML
    private Label p7;

    @FXML
    private Label p8;

    @FXML
    private Label p9;
    @FXML
    private TextField qua;

    @FXML
    private Label totalCost;

    @FXML
    private Label tax;

    @FXML
    private Label subTotal;
    @FXML
    private Label subTotal1;

    @FXML
    private Label service;

    @FXML
    private JFXButton newr;

    @FXML
    private JFXButton contact;

    @FXML
    private JFXButton about;

    @FXML
    private MenuButton menu;


    @FXML
    private JFXButton close;

    @FXML
    private JFXButton print;

    @FXML
    public GridPane printgrid;


    @FXML
    void reciept_click(ActionEvent event) {

        String price1 = p1.getText().trim();
        if (p1.getText() == null || p1.getText().trim().isEmpty()) {
            price1 = "0";
        }
        String price2 = p2.getText().trim();
        if (p2.getText() == null || p2.getText().trim().isEmpty()) {
            price2 = "0";
        }
        String price3 = p3.getText().trim();
        if (p3.getText() == null || p3.getText().trim().isEmpty()) {
            price3 = "0";
        }
        String price4 = p4.getText().trim();
        if (p4.getText() == null || p4.getText().trim().isEmpty()) {
            price4 = "0";
        }
        String price5 = p5.getText().trim();
        if (p5.getText() == null || p5.getText().trim().isEmpty()) {
            price5 = "0";
        }
        String price6 = p6.getText().trim();
        if (p6.getText() == null || p6.getText().trim().isEmpty()) {
            price6 = "0";
        }
        String price7 = p7.getText().trim();
        if (p7.getText() == null || p7.getText().trim().isEmpty()) {
            price7 = "0";
        }
        String price8 = p8.getText().trim();
        if (p8.getText() == null || p8.getText().trim().isEmpty()) {
            price8 = "0";
        }
        String price9 = p9.getText().trim();
        if (p9.getText() == null || p9.getText().trim().isEmpty()) {
            price9 = "0";
        }

        Double pri1 = Double.parseDouble(price1);
        Double pri2 = Double.parseDouble(price2);
        Double pri3 = Double.parseDouble(price3);
        Double pri4 = Double.parseDouble(price4);
        Double pri5 = Double.parseDouble(price5);
        Double pri6 = Double.parseDouble(price6);
        Double pri7 = Double.parseDouble(price7);
        Double pri8 = Double.parseDouble(price8);
        Double pri9 = Double.parseDouble(price9);


        Double pri = pri1 + pri2 + pri3 + pri4 + pri5 + pri6 + pri7 + pri8 + pri9;
        subTotal.setText("LKR " + pri);
        subTotal1.setText("LKR " + pri);


        Double serviceCharge = (pri * 0.1);
        String str2 = Double.toString(serviceCharge);
        service.setText("LKR " + str2);

        Double taxx = (pri * 0.12);
        String str3 = Double.toString(taxx);
        tax.setText("LKR " + str3);


        Double finalT = pri + serviceCharge + taxx;
        String str = Double.toString(finalT);

        totalCost.setText("LKR " + str);

        diss.setText("10%");
        disv.setText("12%");

    }

    @FXML
    void close_click(ActionEvent event) {

        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }


    @FXML
    void contact_click(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("contact.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(new Scene(root1));
            stage.setTitle("ContactUs");
            stage.show();

        } catch (Exception e) {

        }
    }




    @FXML
    void about_click(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("about.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(new Scene(root1));
            stage.setTitle("ContactUs");
            stage.show();

        } catch (Exception e) {

        }

    }

    @FXML
    void newr_click(ActionEvent event) {

        try {
            p1.setText(" ");
            p2.setText(" ");
            p3.setText(" ");
            p4.setText(" ");
            p5.setText(" ");
            p6.setText(" ");
            p7.setText(" ");
            p8.setText(" ");
            p9.setText(" ");

            item1.setText(" ");
            item2.setText(" ");
            item3.setText(" ");
            item4.setText(" ");
            item5.setText(" ");
            item6.setText(" ");
            item7.setText(" ");
            item8.setText(" ");
            item9.setText(" ");

            qua.setText(" ");
            qua2.setText(" ");
            qua3.setText(" ");
            qua4.setText(" ");
            qua5.setText(" ");
            qua6.setText(" ");
            qua7.setText(" ");
            qua8.setText(" ");
            qua9.setText(" ");

            service.setText("");
            tax.setText("");
            totalCost.setText("");
            subTotal.setText("");
            diss.setText("");
            disv.setText("");
            subTotal1.setText("");



        } catch (Exception e) {

        }


    }



            @FXML
            void tf1(ActionEvent event) {
                String number = qua.getText().trim();
                Integer num = Integer.parseInt(number);
                Integer numberf1 = 70 * num;
                String str = Integer.toString(numberf1);
                p1.setText(str);
            }

            @FXML
            void tf2(ActionEvent event) {
                String number = qua2.getText().trim();
                Integer num = Integer.parseInt(number);
                Integer numberf2 = 140 * num;
                String str = Integer.toString(numberf2);
                p2.setText(str);

            }

            @FXML
            void tf3(ActionEvent event) {
                String number = qua3.getText().trim();
                Integer num = Integer.parseInt(number);
                Integer numberf3 = 60 * num;
                String str = Integer.toString(numberf3);
                p3.setText(str);
            }

            @FXML
            void tf4(ActionEvent event) {
                String number = qua4.getText().trim();
                Integer num = Integer.parseInt(number);
                Integer numberf4 = 150 * num;
                String str = Integer.toString(numberf4);
                p4.setText(str);
            }

            @FXML
            void tf5(ActionEvent event) {
                String number = qua5.getText().trim();
                Integer num = Integer.parseInt(number);
                Integer numberf5 = 200 * num;
                String str = Integer.toString(numberf5);
                p5.setText(str);
            }

            @FXML
            void tf6(ActionEvent event) {
                String number = qua6.getText().trim();
                Integer num = Integer.parseInt(number);
                Integer numberf6 = 150 * num;
                String str = Integer.toString(numberf6);
                p6.setText(str);
            }

            @FXML
            void tf7(ActionEvent event) {
                String number = qua7.getText().trim();
                Integer num = Integer.parseInt(number);
                Integer numberf7 = 200 * num;
                String str = Integer.toString(numberf7);
                p7.setText(str);
            }

            @FXML
            void tf8(ActionEvent event) {
                String number = qua8.getText().trim();
                Integer num = Integer.parseInt(number);
                Integer numberf8 = 150 * num;
                String str = Integer.toString(numberf8);
                p8.setText(str);
            }

            @FXML
            void tf9(ActionEvent event) {
                String number = qua9.getText().trim();
                Integer num = Integer.parseInt(number);
                Integer numberf9 = 170 * num;
                String str = Integer.toString(numberf9);
                p9.setText(str);
            }


            @FXML
            void Cortado_click(ActionEvent event) {
                String set = "Cortado";
                item8.setText(set);
            }

            @FXML
            void Espresso_click(ActionEvent event) {
                String set = "Espresso";
                item2.setText(set);
            }

            @FXML
            void americano_click(ActionEvent event) {
                String set = "Americano";
                item1.setText(set);
            }


    @FXML
    void one_click(ActionEvent event) {

    }

    @FXML
    void two_click(ActionEvent event) {

    }

    @FXML
    void three_click(ActionEvent event) {

    }

    @FXML
    void four_click(ActionEvent event) {

    }

    @FXML
    void five_click(ActionEvent event) {

    }



    @FXML
    void six_click(ActionEvent event) {

    }

    @FXML
    void seven_click(ActionEvent event) {

    }

    @FXML
    void eight_click(ActionEvent event) {

    }

    @FXML
    void nine_click(ActionEvent event) {

    }
    @FXML
    void enter_click(ActionEvent event) {

    }


            @FXML
            void aulait_click(ActionEvent event) {
                String set = "Au-Lait";
                item6.setText(set);
            }

            @FXML
            void black_click(ActionEvent event) {
                String set = "Black Coffee";
                item3.setText(set);
            }

            @FXML
            void cappuccino_click(ActionEvent event) {
                String set = "Cappuccino";
                item4.setText(set);
            }

            @FXML
            void ice_click(ActionEvent event) {
                String set = "Ice Coffee";
                item9.setText(set);
            }

            @FXML
            void irish_click(ActionEvent event) {
                String set = "Irish Whiskey";
                item5.setText(set);
            }

            @FXML
            void mocha_click(ActionEvent event) {
                String set = "Mocha";
                item7.setText(set);
            }



            @FXML
            void select_click(ActionEvent event) {

            }


            @FXML
            void initialize() {
                assert item != null : "fx:id=\"item\" was not injected: check your FXML file 'market.fxml'.";
                assert quantity != null : "fx:id=\"quantity\" was not injected: check your FXML file 'market.fxml'.";
                // assert price != null : "fx:id=\"price\" was not injected: check your FXML file 'market.fxml'.";
                //  assert subT != null : "fx:id=\"subT\" was not injected: check your FXML file 'market.fxml'.";
                assert reciept != null : "fx:id=\"reciept\" was not injected: check your FXML file 'market.fxml'.";
                // assert total != null : "fx:id=\"total\" was not injected: check your FXML file 'market.fxml'.";
                assert americano != null : "fx:id=\"americano\" was not injected: check your FXML file 'market.fxml'.";
                assert espresso != null : "fx:id=\"espresso\" was not injected: check your FXML file 'market.fxml'.";
                assert black != null : "fx:id=\"black\" was not injected: check your FXML file 'market.fxml'.";
                assert cappuccino != null : "fx:id=\"cappuccino\" was not injected: check your FXML file 'market.fxml'.";
                assert irish != null : "fx:id=\"irish\" was not injected: check your FXML file 'market.fxml'.";
                assert aulait != null : "fx:id=\"aulait\" was not injected: check your FXML file 'market.fxml'.";
                assert mocha != null : "fx:id=\"mocha\" was not injected: check your FXML file 'market.fxml'.";
                assert cortado != null : "fx:id=\"cortado\" was not injected: check your FXML file 'market.fxml'.";
                assert ice != null : "fx:id=\"ice\" was not injected: check your FXML file 'market.fxml'.";

            }
        }
