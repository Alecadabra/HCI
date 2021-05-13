/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author flani
 */
public class Customer {
    private int ID;
    private String firstName;
    private String lastName;
    private String businessName;
    private String primaryPhone;
    private String secondaryPhone;
    private String emailAddress;
    private String addressLine1;
    private String addressLine2;
    private String postcode;
    private String state;
    
    public Customer(int inID) {
        setID(inID);
        setFirstName("");
        setLastName("");
        setBusinessName("");
        setPrimaryPhone("");
        setSecondaryPhone("");
        setEmailAddress("");
        setAddressLine1("");
        setAddressLine2("");
        setPostcode("");
        setState("");
    }
    
    public Customer(int inID, String inFirstName, String inLastName, String inBusinessName, String inPrimaryPhone, String inSecondaryPhone, String inEmailAddress, String inAddressLine1, String inAddressLine2, String inPostcode, String inState) {
        setID(inID);
        setFirstName(inFirstName);
        setLastName(inLastName);
        setBusinessName(inBusinessName);
        setPrimaryPhone(inPrimaryPhone);
        setSecondaryPhone(inSecondaryPhone);
        setEmailAddress(inEmailAddress);
        setAddressLine1(inAddressLine1);
        setAddressLine2(inAddressLine2);
        setPostcode(inPostcode);
        setState(inState);
    }
    
    
    public void setID(int inID) {
        if(inID < 0) {
            throw new IllegalArgumentException("Invalid imports");
        }
        ID = inID;
    }
    
    public void setFirstName(String inFirstName) {
        if(inFirstName==null) {
            firstName="";
        }
        else {
            firstName = inFirstName;
        }
    }
    
    public void setLastName(String inLastName) {
        if(inLastName==null) {
            lastName="";
        }
        else {
            lastName = inLastName;
        }
    }
    
    public void setBusinessName(String inBusinessName) {
        if(inBusinessName==null) {
            businessName = "";
        }
        else {
            businessName = inBusinessName;
        }
    }
    
    public void setPrimaryPhone(String inPrimaryPhone) {
        if(inPrimaryPhone==null) {
            primaryPhone = "";
        }
        else {
            primaryPhone = inPrimaryPhone;
        }
    }
    
    public void setSecondaryPhone(String inSecondaryPhone) {
        if(inSecondaryPhone==null) {
            secondaryPhone = "";
        }
        else {
            secondaryPhone = inSecondaryPhone;
        }
    }
    
    public void setEmailAddress(String inEmailAddress) {
        if(inEmailAddress==null) {
            emailAddress = "";
        }
        else {
            emailAddress = inEmailAddress;
        }
    }
    
    public void setAddressLine1(String inAddressLine1) {
        if(inAddressLine1==null) {
            addressLine1 = "";
        }
        else {
            addressLine1 = inAddressLine1;
        }
    }
    
   public void setAddressLine2(String inAddressLine2) {
        if(inAddressLine2==null) {
            addressLine2 = "";
        }
        else {
            addressLine2 = inAddressLine2;
        }
    }
   
   public void setPostcode(String inPostcode) {
        if(inPostcode==null) {
            postcode = "";
        }
        else {
            postcode = inPostcode;
        }
    }
   
   public void setState(String inState) {
       if(inState==null) {
           state="";
       }
       else {
           state = inState;
       }
   }
   
   public int getID() {
       return ID;
   }
   
   public String getFirstName() {
       return firstName;
   }
   
   public String getLastName() {
       return lastName;
   }
   
   public String getBusinessName() {
       return businessName;
   }
   
   public String getPrimaryPhone() {
       return primaryPhone;
   }
   
   public String getSecondaryPhone() {
       return secondaryPhone;
   }
   
   public String getEmailAddress() {
       return emailAddress;
   }
   
   public String getAddressLine1() {
       return addressLine1;
   }
   
   public String getAddressLine2() {
       return addressLine2;
   }
   
   public String getPostcode() {
       return postcode;
   }
   
   public String getState() {
       return state;
   }
   
    @Override
   public String toString() {
       return(ID+","+firstName+","+lastName+","+businessName+","+primaryPhone+","+secondaryPhone+","+emailAddress+","+addressLine1+","+addressLine2+","+postcode+"\n");
   }
   
   public String searchString() {
       return(ID+":"+firstName+":"+lastName);
   }
}
