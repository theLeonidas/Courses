package org.dataTypes.reference;

import sun.security.pkcs11.wrapper.Constants;

import java.nio.BufferOverflowException;

public class Address {
    public String streetAddress;
    String locality;
    String town;
    String district;
    String state;
    String country;
    long pincode;

    public Address(String streetAddress, String locality, String town, String district, String state, String country, long pincode) {
        this.streetAddress = streetAddress;
        this.locality = locality;
        this.town = town;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public static final String COMMA = ",";

    public String getAddress(){
        StringBuffer buffer = new StringBuffer();
        buffer.append(streetAddress)
              .append(COMMA)
              .append(locality)
              .append(COMMA)
              .append(town)
              .append(COMMA)
              .append(district)
              .append(COMMA)
              .append(state)
              .append(COMMA)
              .append(country);
        return buffer.toString();
    }

    public boolean equals(Address address){
        if(this.streetAddress.equalsIgnoreCase(address.streetAddress))
            if(this.locality.equalsIgnoreCase(address.locality))
                if(this.town.equalsIgnoreCase(address.town))
                    if(this.district.equalsIgnoreCase(address.district))
                        if(this.state.equalsIgnoreCase(address.state))
                            if(this.country.equalsIgnoreCase(address.country))
                                if(this.pincode==address.pincode)
                                    return true;
        return false;
    }
}