package ie.atu;

import java.util.Scanner;

public class Customer {

    String First_name;

    String Last_name;

    String CustomerID;

    String Address;

    public Customer(String first_name, String last_name, String customerID, String address) {
        First_name = first_name;
        Last_name = last_name;
        CustomerID = customerID;
        Address = address;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
