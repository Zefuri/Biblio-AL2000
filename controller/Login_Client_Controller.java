/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.*;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Mode;

/**
 * FXML Controller class
 *
 * @author walid
 */
public class Login_Client_Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private AnchorPane PaneLogIn;
    @FXML
    private Button Login_btn;
    @FXML
    private TextField Email;
    @FXML
    private Button SignUp_btn;
    @FXML
    private Button return_Button;
    @FXML
    private Label Error;
    @FXML
    private TextField carteBancaire;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Machine.setMode(Mode.UTILISATEUR);
        Error.setVisible(false);
        
        System.out.println(Machine.toString());
    }

    @FXML
    private void clickLogin(ActionEvent event) throws IOException {
            Parent  root = FXMLLoader.load(getClass().getResource("/view/Espace_Client.fxml"));
            Stage stage = (Stage) return_Button.getScene().getWindow();
            stage.setScene(new Scene(root));
    }

    @FXML
    private void clickSignUp(ActionEvent event) throws IOException {
        Parent  root = FXMLLoader.load(getClass().getResource("/view/SignUp.fxml"));
        Stage stage = (Stage) return_Button.getScene().getWindow();
        stage.setScene(new Scene(root));
    }


    @FXML
    private void clickQuitter(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void return_Home(ActionEvent event) throws IOException {
        Parent  root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Stage stage = (Stage) return_Button.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
}
