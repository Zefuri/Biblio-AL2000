/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static Application.App.Machine;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.*;

/**
 * FXML Controller class
 *
 * @author walid
 */
public class Espace_Client_Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private Label credit_Client;
    @FXML
    private ListView<String> List_DVD_Louer;
    @FXML
    private Button Historique;
    @FXML
    private Button Recharger;
    @FXML
    private TextField Credit_input;
    @FXML
    private TableView<?> List_DVD;
    @FXML
    private TableColumn<?, String> Table_Title;
    @FXML
    private TableColumn<?, String> Table_Genre;
    @FXML
    private TableColumn<?, String> Table_ReleaseDate;
    @FXML
    private TableColumn<?, String> Table_Producer;
    @FXML
    private Label Info_Client;
    @FXML
    private Button return_btn;

    ObservableList<String> value;
    
    ObservableList<?> DVDs = FXCollections.observableArrayList(); // Create an ArrayList object
    @FXML
    private TextField Signalement;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void Reservation_Click(MouseEvent event) {
        System.out.println("Reservation_Click");
    }

    @FXML
    private void check_Historique(ActionEvent event) throws IOException {
        System.out.println("check_Historique");
        Parent  root = FXMLLoader.load(getClass().getResource("/view/Historique_Client.fxml"));
        Stage stage = (Stage) return_btn.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void click_Recharger(ActionEvent event) {
        try {
            int c = parseInt(Credit_input.getText());
            if( c>= 15){
                System.out.println("Recharger !!!!!!!!");
            }   
            //  Block of code to try
        }
          catch(Exception e) {
            //  Block of code to handle errors
            System.out.println("Entrer un Entier !!!!!!!!");
        }

    }

    @FXML
    private void list_Click(MouseEvent event) {
        System.out.println("list_Click" + List_DVD.getSelectionModel().getSelectedIndex());
    }

    @FXML
    private void Rendre_DVD(ActionEvent event) {        
        System.out.println(List_DVD_Louer.getSelectionModel().getSelectedIndex());
        
        System.out.println(value);
        //value.remove(List_DVD_Louer.getSelectionModel().getSelectedIndex());
        List_DVD_Louer.getItems().remove(List_DVD_Louer.getSelectionModel().getSelectedIndex());
        System.out.println(value);

    }

    @FXML
    private void clickQuitter(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void return_click(ActionEvent event) throws IOException {
        Parent  root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Stage stage = (Stage) return_btn.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
}
