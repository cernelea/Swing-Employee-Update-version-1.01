package com.tekwill.EmployeeModel;

import java.util.Objects;

public class Address {

    private Integer id;
    private Country country;
    private String postCode;
    private String street;

    public Address(Integer id, Country country, String postCode, String street) {
        this.id = id;
        this.country = country;
        this.postCode = postCode;
        this.street = street;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.postCode, other.postCode)) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nCountry:" + this.country + "\nPostcode: " + this.postCode + "\nStreet: " + this.street;
    }

}
