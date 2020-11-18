/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static Application.App.Machine;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author walid
 */
public class Inserer_DVD_Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private AnchorPane PaneLogIn;
    @FXML
    private Button add_DVD;
    @FXML
    private Button return_Button;
    @FXML
    private ChoiceBox<String> Genre;
    @FXML
    private TextField Title;
    @FXML
    private TextField producer;
    @FXML
    private TextField releaseDate;
    @FXML
    private TextField summary;
    @FXML
    private TextField actors;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String[] genres = {"ACTION","HORREUR"};
        ObservableList<String> value = FXCollections.observableArrayList(genres);
        Genre.setItems(value);
        Genre.setValue("ACTION");
    }    

    @FXML
    private void click_Add(ActionEvent event) throws IOException {
        //System.out.println("ADD DVD  "+ Title.getText()+"  ,  "+  + ",  "+producer.getText() + "  ,  "+releaseDate.getText()+ "  ,  "+actors.getText()+ "  ,  "+summary.getText());
        
    }

    @FXML
    private void clickQuitter(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void return_Home(ActionEvent event) throws IOException {
        Parent  root = FXMLLoader.load(getClass().getResource("/view/Gestion_Machine.fxml"));
        Stage stage = (Stage) return_Button.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
}
