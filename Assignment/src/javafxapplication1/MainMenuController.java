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
public class MainMenuController implements Initializable {

    @FXML
    private AnchorPane menuRootPane;
    @FXML
    private AnchorPane backupManagementRootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openLoginScreen(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
         menuRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openCashClose(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("CashClose.fxml"));
        menuRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openSalesScreen(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Sales.fxml"));
        menuRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openCustomerScreen(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("CustomerScreen.fxml"));
        menuRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openProductEdit(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("ProductEditScreen.fxml"));
        menuRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openRemoveProduct(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("ProductRemoveScreen.fxml"));
        menuRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openBackupManagement(ActionEvent event) {
        backupManagementRootPane.setVisible(true);
    }

    @FXML
    private void closeBackupManagement(ActionEvent event) {
        backupManagementRootPane.setVisible(false);

    }

    @FXML
    private void confirmBackupManagement(ActionEvent event) {
        backupManagementRootPane.setVisible(false);
    }

    
}
