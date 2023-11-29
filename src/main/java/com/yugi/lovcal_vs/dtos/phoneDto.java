package com.yugi.lovcal_vs.dtos;

public class phoneDto {
    private String country;
    private String phoneNumber;

    public String getCountry() {
        return country;
    }

    public void setCountry(String conuntry) {
        this.country = conuntry;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return country + "-" + phoneNumber;
    }

}
