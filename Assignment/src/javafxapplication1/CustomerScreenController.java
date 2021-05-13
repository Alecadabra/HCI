/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author flani
 */
public class CustomerScreenController implements Initializable {
    
    private Customer[] customers;
    private int count;
    
    @FXML
    private AnchorPane customerRootPane;
    @FXML
    private Label custID;
    @FXML
    private TextField businessName;
    @FXML
    private TextField primaryPhone;
    @FXML
    private TextField secondaryPhone;
    @FXML
    private TextField emailAddress;
    @FXML
    private TextField addressLine1;
    @FXML
    private TextField addressLine2;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField postcode;
    @FXML
    private TextField state;
    @FXML
    private ListView customerListView;
    @FXML
    private Button search;
    @FXML
    private TextField IDSearch;
    @FXML
    private TextField firstnameSearch;
    @FXML
    private TextField lastnameSearch;


    public CustomerScreenController() {
        customers = new Customer[200];
        count = 0;
    }

    /**
     * Initializes the controller clas
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openLoginScreen(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        customerRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void openMainMenu(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        customerRootPane.getChildren().setAll(pane);
    }

    @FXML
    private void saveCustomer(ActionEvent event) {
        if(!(custID.getText().equals(""))) {
            int index = Integer.parseInt(custID.getText());
            customers[index].setFirstName(firstName.getText());
            customers[index].setLastName(lastName.getText());
            customers[index].setBusinessName(businessName.getText());
            customers[index].setPrimaryPhone(primaryPhone.getText());
            customers[index].setSecondaryPhone(secondaryPhone.getText());
            customers[index].setEmailAddress(emailAddress.getText());
            customers[index].setAddressLine1(addressLine1.getText());
            customers[index].setAddressLine2(addressLine2.getText());
            customers[index].setPostcode(postcode.getText());
            customers[index].setState(state.getText());
            this.custID.setText("");
            this.firstName.clear();
            this.lastName.clear();
            this.businessName.clear();
            this.addressLine1.clear();
            this.addressLine2.clear();
            this.custID.setText("");
            this.primaryPhone.clear();
            this.secondaryPhone.clear();
            this.emailAddress.clear();
            this.postcode.clear();
            this.state.clear();
        }
        else {
            customers[count] = new Customer(count, firstName.getText(), lastName.getText(), businessName.getText(), primaryPhone.getText(), secondaryPhone.getText(), emailAddress.getText(), addressLine1.getText(), addressLine2.getText(), postcode.getText(), (String)state.getText());
            this.count++;
            this.firstName.clear();
            this.lastName.clear();
            this.businessName.clear();
            this.addressLine1.clear();
            this.addressLine2.clear();
            this.custID.setText("");
            this.primaryPhone.clear();
            this.secondaryPhone.clear();
            this.emailAddress.clear();
            this.postcode.clear();
            this.state.clear();
        }
    }

    @FXML
    private void search(ActionEvent event) {
        String tempID, tempFirstName, tempLastName;
        tempID = IDSearch.getText().toLowerCase();
        tempFirstName = firstnameSearch.getText().toLowerCase();
        tempLastName = lastnameSearch.getText().toLowerCase();
        customerListView.getItems().clear();
        for(int ii = 0; ii < count; ii++) {
            if((customers[ii].searchString().toLowerCase().contains(tempID)) && (customers[ii].searchString().toLowerCase().contains(tempFirstName)) && (customers[ii].searchString().toLowerCase().contains(tempLastName))) {
                customerListView.getItems().add(customers[ii].searchString());
            }
        }
        customerListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                custID.setText(newValue.split(":")[0]);
                int index = Integer.parseInt(custID.getText());
                firstName.setText(customers[index].getFirstName());
                lastName.setText(customers[index].getLastName());
                businessName.setText(customers[index].getBusinessName());
                primaryPhone.setText(customers[index].getPrimaryPhone());
                secondaryPhone.setText(customers[index].getSecondaryPhone());
                emailAddress.setText(customers[index].getEmailAddress());
                addressLine1.setText(customers[index].getAddressLine1());
                addressLine2.setText(customers[index].getAddressLine2());
                postcode.setText(customers[index].getPostcode());
                state.setText(customers[index].getState());
            }
        });
    }

    @FXML
    private void clearCustomer(ActionEvent event) {
        this.firstName.clear();
        this.lastName.clear();
        this.businessName.clear();
        this.addressLine1.clear();
        this.addressLine2.clear();
        this.custID.setText("");
        this.primaryPhone.clear();
        this.secondaryPhone.clear();
        this.emailAddress.clear();
        this.postcode.clear();
        this.state.clear();
    }
    
}
