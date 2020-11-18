/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static Application.App.Machine;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
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

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * FXML Controller class
 *
 * @author walid
 */
public class Gestion_Machine implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button add;
    @FXML
    private TableView<?> tableView;
    @FXML
    private Button delete;
    @FXML
    private TableColumn<?, String> Table_Title;
    @FXML
    private TableColumn<?, String> Table_Genre;
    @FXML
    private TableColumn<?, String> Table_ReleaseDate;
    @FXML
    private TableColumn<?, String> Table_Producer;
    @FXML
    private TableColumn<?, String> Table_Actors;
    @FXML
    private TableColumn<?, String> Table_Summary;
    @FXML
    private Button return_Button;

    ObservableList<?> DVDs = FXCollections.observableArrayList(); // Create an ArrayList object

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void add_DVD(ActionEvent event) throws IOException {
        System.out.println("Add DVD");
        Parent  root = FXMLLoader.load(getClass().getResource("/view/Inserer_DVD.fxml"));
        Stage stage = (Stage) return_Button.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void list_Click(MouseEvent event) {
        System.out.println("List DVD CLICK"+tableView.getSelectionModel().getSelectedIndex() + "   "+Machine.getDvds().get(tableView.getSelectionModel().getSelectedIndex()).getTitle());
        delete.setDisable(false);
    }

    @FXML
    private void return_Home(ActionEvent event) throws IOException {
        Parent  root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Stage stage = (Stage) return_Button.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void delete_DVD(ActionEvent event) {
        if(tableView.getSelectionModel().getSelectedItem()!=null && tableView.getSelectionModel().getSelectedIndex()< Machine.getDvds().size()){
            delete.setDisable(true);
            DVDs.remove(tableView.getSelectionModel().getSelectedIndex());
            tableView.getItems().remove(tableView.getSelectionModel().getSelectedIndex());
            tableView.getSelectionModel().clearSelection();
            
        }
    }
    
    @FXML
    private void clickQuitter(ActionEvent event) {
        System.exit(0);
    }
}
