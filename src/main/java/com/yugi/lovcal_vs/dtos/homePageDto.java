package com.yugi.lovcal_vs.dtos;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class homePageDto {
    @NotEmpty(message = "*this field should not be empty")
    @Size(min = 2, max = 15, message = "*the length of the name should be between 2-15 ")
    private String yourname;

    @NotEmpty(message = "*this field sould not be empty")
    @Size(min = 2, max = 15, message = "*the length of the name should be between 2-15 ")

    private String hername;

    @AssertTrue(message = "*you have to agree to use this webiste ")
    private boolean aggred;

    public String getYourname() {
        return yourname;
    }

    public void setYourname(String yourname) {
        this.yourname = yourname;
    }

    public String getHername() {
        return hername;
    }

    public void setHername(String hername) {
        this.hername = hername;
    }

    public boolean isAggred() {
        return aggred;
    }

    public void setAggred(boolean aggred) {
        this.aggred = aggred;
    }

}