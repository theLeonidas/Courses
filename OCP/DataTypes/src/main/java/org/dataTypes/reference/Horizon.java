package org.dataTypes.reference;

import java.util.ArrayList;
import java.util.List;

//Class representing horizon.com
public class Horizon {
    private List<Customer> customerList = new ArrayList<Customer>();

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public void removeCustomer(Customer customer){
        customerList.stream()
                    .filter((customerFromList) -> {
                        return customerFromList.equals(customer);
                    });
    }

    public void printCustomers(){
        this.customerList.stream().forEach(Customer::printCustomer);
    }
}