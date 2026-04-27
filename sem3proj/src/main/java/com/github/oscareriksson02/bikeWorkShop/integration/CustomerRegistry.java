package com.github.oscareriksson02.bikeWorkShop.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for storing the customers in the system.
 * It will be used by the controller to add and retrieve customers from the system.
 */
public class CustomerRegistry {
    private List<CustomerDTO> customers = new ArrayList<>();
    
    /**
     * This methood returns CustomerDTO with the given number. if none is found it returns null.
     * @param number
     * @return
     */
    public CustomerDTO searchCustomer(String number) {
        for (CustomerDTO customerDTO : customers) {
            if(customerDTO.getPhoneNumber().equals(number))
                return customerDTO;
        }
        return null;
    }    
}
