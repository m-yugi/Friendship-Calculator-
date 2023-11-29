package com.yugi.lovcal_vs.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class feedbackDto {
    @NotEmpty(message = "This field should not empty")
    @Email(message = "Please enter a well formed email")
    private String email;

    @NotEmpty(message = "This field should not be empty")
    private String username;

    @NotEmpty(message = "This field should not be empty")
    private String feedback;

    private boolean aggred;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public boolean isAggred() {
        return aggred;
    }

    public void setAggred(boolean aggred) {
        this.aggred = aggred;
    }

}