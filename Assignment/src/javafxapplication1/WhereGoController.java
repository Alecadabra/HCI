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
 * @author student
 */
public class WhereGoController implements Initializable {
    
    @FXML
    private AnchorPane anchor2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void onRouteClicked(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("Journey.fxml"));
        this.anchor2.getChildren().setAll(newPane);
    }
    
    @FXML
    public void onDropdownClicked(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("WhereGo2.fxml"));
        this.anchor2.getChildren().setAll(newPane);
    }
    
    @FXML
    void onHamburgerPressed(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("WhereGoHamburger.fxml"));
        this.anchor2.getChildren().setAll(newPane);
    }
    
}
