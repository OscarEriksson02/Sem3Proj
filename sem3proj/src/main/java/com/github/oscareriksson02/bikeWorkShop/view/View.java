package com.github.oscareriksson02.bikeWorkShop.view;

import java.util.ArrayList;
import java.util.List;

import com.github.oscareriksson02.bikeWorkShop.controller.Controller;
import com.github.oscareriksson02.bikeWorkShop.integration.CustomerDTO;
import com.github.oscareriksson02.bikeWorkShop.integration.OrderDTO;
/**
 * This class is responsible for displaying the user interface for the customer.
 * It will be used by the controller to display the user interface for the customer.
 */

public class View {
    private Controller contr;

    public View(Controller controller) {
        this.contr = controller;
    }

    private void searchCustomer(String number)
    {
        CustomerDTO cust = contr.searchCustomer(number);
        // Print cust
    }

    private void findOrdersByState(int state) {
        List<OrderDTO> orders = Controller.findOrdersByState(state);
        
    }
}
