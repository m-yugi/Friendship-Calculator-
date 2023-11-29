package com.yugi.lovcal_vs.dtos;

import jakarta.validation.constraints.Email;

public class emailDto {
    @Email(message = "please enter a valid email")
    private String userEmail;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

}