/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Application.App;
import static Application.App.Machine;
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
import model.Mode;

/**
 * FXML Controller class
 *
 * @author walid
 */
public class Home_Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button modeTech;
    @FXML
    private Button modeUser;
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
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }    

    @FXML
    private void clickModeMaintenance(ActionEvent event) throws IOException {
        Parent  root = FXMLLoader.load(getClass().getResource("/view/Login_Tech.fxml"));
        Stage stage = (Stage) modeTech.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void clickModeUtilisateur(ActionEvent event) throws IOException {
        System.out.println("Mode User");
        Parent  root = FXMLLoader.load(getClass().getResource("/view/Login_Client.fxml"));
        Stage stage = (Stage) modeTech.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    private void clickQuitter(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void list_Click(MouseEvent event) {
    }
}
