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
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author flani
 */
public class LoginScreenController implements Initializable {

    @FXML
    private AnchorPane loginRootPane;
    private Employee[] users;
    @FXML
    private Button loginButton;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public LoginScreenController() {
        this.users = new Employee[5];
        Employee paul = new Employee("Paul", "password");
        Employee parrot = new Employee("Parrot", "squawk");
        users[0] = paul;
        users[1] = parrot;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void checkCredentials(ActionEvent event) throws IOException {
        String in = username.getText() + "," + password.getText();
        for(int ii = 0; ii < users.length; ii++) {
            if(in.equals(users[ii].toString())) {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
                loginRootPane.getChildren().setAll(pane);
            }
        }
    }
    
}
