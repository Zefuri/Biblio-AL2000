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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import model.Abonne;

/**
 * FXML Controller class
 *
 * @author walid
 */
public class SignUp_Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private AnchorPane PaneLogIn;
    @FXML
    private TextField Email;
    @FXML
    private Button SignUp_btn;
    @FXML
    private TextField carteBancaire;
    @FXML
    private Button return_Button;
    @FXML
    private Label Error;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Error.setVisible(false);

        System.out.println(Machine.toString());
    }    

    @FXML
    private void clickSignUp(ActionEvent event) throws IOException {
            Parent  root = FXMLLoader.load(getClass().getResource("/view/Espace_Client.fxml"));
            Stage stage = (Stage) return_Button.getScene().getWindow();
            stage.setScene(new Scene(root));
/*        }else{
            Error.setText("Remplissez tous les champs");
            Error.setVisible(true);
        }*/
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
