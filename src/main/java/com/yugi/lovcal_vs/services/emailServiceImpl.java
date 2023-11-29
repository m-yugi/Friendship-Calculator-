package com.yugi.lovcal_vs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class emailServiceImpl implements emailServices {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String username, int result, String userEmail, String bond, String friendname) {
        SimpleMailMessage mailmessage = new SimpleMailMessage();
        mailmessage.setTo(userEmail);
        mailmessage.setSubject("Friendship Calculator Result");
        mailmessage.setText("Hi " + username + "\n\n the result predicted by the Friendship Calclator between "
                + username + " and " + friendname + " is " + result + "% with a " + bond + " bond." + "\n\n"
                + "we created this game just for fun and don't take this results seriously");
        mailSender.send(mailmessage);
    }

}