package com.github.oscareriksson02.bikeWorkShop.model;

import com.github.oscareriksson02.bikeWorkShop.integration.OrderDTO;
import com.github.oscareriksson02.bikeWorkShop.integration.OrderRegistry;
import com.github.oscareriksson02.bikeWorkShop.integration.RepairTaskDTO;

public class Order {
   private OrderDTO orderDTO;
  

    /**
     * Constructor for the order class
     * @param orderID
     * @param orderRegistry
     */
    public Order(int orderID, OrderRegistry orderRegistry) {
        this.orderDTO = orderRegistry.findOrderById(orderID);
    }

    public void addRepairTask(RepairTaskDTO repairTask) {
        orderDTO.addRepairTask(repairTask);
    }

}
