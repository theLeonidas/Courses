package org.dataTypes.reference;

import java.util.List;

public class RunHorizonDotCom {
    public static void main(String[] args) {
        Horizon horizonDotCom = new Horizon();
        Address shippingAddress = new Address("121 ,MG Road","Krishna Nagar","Pune","","Maharashtra","India",100000);
        Address shippingAddressSam = new Address("122 ,MG Road","Krishna Nagar","Pune","","Maharashtra","India",100000);
        Address shippingAddressRobert = new Address("123 ,MG Road","Krishna Nagar","Pune","","Maharashtra","India",100000);

        //Customer Alex.
        Customer customer = new Customer(1,"Alex",shippingAddress,30,5,342323.333f,true);

        //Customer Sam.
        Customer customerSam = new Customer(1,"Sam",shippingAddress,30,5,342323.333f,true);

        //Customer Robert.
        Customer customerRobert = new Customer(1,"Robert",shippingAddress,30,5,342323.333f,true);

        horizonDotCom.addCustomer(customer);
        horizonDotCom.addCustomer(customerSam);
        horizonDotCom.addCustomer(customerRobert);

        horizonDotCom.printCustomers();
    }
}