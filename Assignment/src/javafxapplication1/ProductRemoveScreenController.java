/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author flani
 */
public class ProductRemoveScreenController implements Initializable {

    @FXML
    private AnchorPane productRemoveRootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openMainMenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        productRemoveRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openLoginScreen(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        productRemoveRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void confirmRemove(ActionEvent event) {
    }

    @FXML
    private void cancelRemove(ActionEvent event) {
    }
    
}
