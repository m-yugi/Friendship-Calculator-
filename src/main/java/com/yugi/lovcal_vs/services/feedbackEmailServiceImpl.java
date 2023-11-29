package com.yugi.lovcal_vs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class feedbackEmailServiceImpl implements feedbackEmailService {
    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendFeedbackEmail(String email, String username) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("FeedBack submitted Succesfully");
        message.setText("hello " + username
                + "!\n\n your feedback has been recived and we thank you for giving your time to give us feedback");
        mailSender.send(message);
    }

}