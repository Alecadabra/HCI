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
public class FavouritesController implements Initializable {
    
    @FXML
    private AnchorPane anchor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    public void onPlacesClicked(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("WhereGo.fxml"));
        this.anchor.getChildren().setAll(newPane);
    }
    
    @FXML
    public void onHamburgerPressed(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("HamburgerFavourites.fxml"));
        this.anchor.getChildren().setAll(newPane);
    }
    
    @FXML
    public void onEditPressed(ActionEvent event) throws IOException {
        AnchorPane newPane = FXMLLoader.load(getClass().getResource("FavouritesEdit.fxml"));
        this.anchor.getChildren().setAll(newPane);
    }
    
}
