/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author walid
 */
public class Historique_Client implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> Table_Title;
    @FXML
    private TableColumn<?, ?> Table_Genre;
    @FXML
    private TableColumn<?, ?> Table_ReleaseDate;
    @FXML
    private TableColumn<?, ?> Table_Producer;
    @FXML
    private TableColumn<?, ?> Table_Actors;
    @FXML
    private TableColumn<?, ?> Table_Summary;
    @FXML
    private Button return_Button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void list_Click(MouseEvent event) {
    }

    @FXML
    private void clickQuitter(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void return_Home(ActionEvent event) throws IOException {
        Parent  root = FXMLLoader.load(getClass().getResource("/view/Espace_Client.fxml"));
        Stage stage = (Stage) return_Button.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
}
