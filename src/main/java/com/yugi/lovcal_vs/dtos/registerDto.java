package com.yugi.lovcal_vs.dtos;

import com.yugi.lovcal_vs.annotations.Age;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public class registerDto {
    @NotEmpty
    private String username;
    private char[] password;
    @Age
    private Integer age;
    @Valid
    private contactDto contact;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public contactDto getContact() {
        return contact;
    }

    public void setContact(contactDto contact) {
        this.contact = contact;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}