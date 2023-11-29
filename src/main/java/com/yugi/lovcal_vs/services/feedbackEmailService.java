package com.yugi.lovcal_vs.services;

// import org.springframework.mail.SimpleMailMessage;

public interface feedbackEmailService {
    public void sendFeedbackEmail(String email, String username);
}