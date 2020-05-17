package org.dataTypes.reference;

public class References {
    public static void main(String[] args) {
        Address shippingAddressAmit = new Address("123 ,MG Road","Krishna Nagar","Pune","","Maharashtra","India",100000);

        //Customer Amit.
        Customer premiumCustomer = new Customer(1,"Amit",shippingAddressAmit,30,5,342323.333f,true);

        //Creating a customer refrence that points to no Customer object.
        Customer nonPremiumCustomer = null;

        //anotherCustomer now points to an object of customer.
        nonPremiumCustomer = premiumCustomer;

        //Customer reference now points to null.
        premiumCustomer = null;
    }
}