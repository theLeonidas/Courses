package org.dataTypes.reference;

//How horizon.com represents its customer data.
public class Customer {
    private long customerId;
    private String name;

    private Address shippingAddress;
    int pastOrdersCount;
    int totalItemsInCart;
    float totalAmountSpent;
    boolean isAPremiumUser;

    public Customer(){}

    public Customer(long customerId, String name, Address shippingAddress, int pastOrdersCount, int totalItemsInCart, float totalAmountSpent, boolean isAPremiumUser) {
        this.customerId = customerId;
        this.name = name;
        this.shippingAddress = shippingAddress;
        this.pastOrdersCount = pastOrdersCount;
        this.totalItemsInCart = totalItemsInCart;
        this.totalAmountSpent = totalAmountSpent;
        this.isAPremiumUser = isAPremiumUser;
    }

    public void printCustomer(){
        System.out.println("----------------------------------------------------------");
        if(isAPremiumUser)
            System.out.println(this.name + " is one of our premium customer.He enjoys many privileges being a premium customer.");
        else System.out.println(this.name + " is our regular customer.");
        System.out.println(this.name + "'s shipping address is " + this.shippingAddress.getAddress());
        System.out.println(this.name + " has spent a total of " + this.totalAmountSpent + " rupees on horizon.com.");
        System.out.println(this.name + " has total " + this.totalItemsInCart + " items in the cart presently.");
        System.out.println(this.name + " has ordered " + this.pastOrdersCount + " items in the past from horizon.com.");
        System.out.println("----------------------------------------------------------");
    }

    public long getCustomerId(){
        return this.customerId;
    }


    public Address getShippingAddress() {
        return shippingAddress;
    }

    public boolean equals(Customer customer){
        if(this.name.equalsIgnoreCase(customer.name))
            if(this.customerId==customer.getCustomerId())
                if(this.shippingAddress.equals(customer.getShippingAddress()))
                    if(this.pastOrdersCount==customer.pastOrdersCount)
                        if(this.totalAmountSpent==customer.totalAmountSpent)
                            if(this.totalItemsInCart==customer.totalItemsInCart)
                                return true;
        return false;
    }
}