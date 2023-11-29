package com.yugi.lovcal_vs.dtos;

import jakarta.validation.constraints.Email;

public class contactDto {
    @Email
    private String email;
    private phoneDto phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public phoneDto getPhone() {
        return phone;
    }

    public void setPhone(phoneDto phone) {
        this.phone = phone;
    }

}