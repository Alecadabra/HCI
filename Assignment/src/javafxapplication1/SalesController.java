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
public class SalesController implements Initializable {

    @FXML
    private AnchorPane salesRootPane;
    @FXML
    private AnchorPane filterRootPane;
    @FXML
    private AnchorPane createOrderRootPane;

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
        salesRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openLoginScreen(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        salesRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openCreateOrder(ActionEvent event) {
        createOrderRootPane.setVisible(true);
    }

    @FXML
    private void openAddToOrder(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("OrderAdditionScreen.fxml"));
        salesRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openFilterMenu(ActionEvent event) {
         filterRootPane.setVisible(true);
    }

    @FXML
    private void toggleVisibleFilter(ActionEvent event) {
    }

    @FXML
    private void cancelFilter(ActionEvent event) {
        filterRootPane.setVisible(false);
    }

    @FXML
    private void confirmFilter(ActionEvent event) {
        filterRootPane.setVisible(false);
    }

    @FXML
    private void cancelCreateOrder(ActionEvent event) {
        createOrderRootPane.setVisible(false);
    }

    @FXML
    private void confirmCreateOrder(ActionEvent event) {
        createOrderRootPane.setVisible(false);
    }

    @FXML
    private void cancelPayment(ActionEvent event) {
    }

    @FXML
    private void confirmPayment(ActionEvent event) {
    }
    
}
