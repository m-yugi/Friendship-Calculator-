package com.yugi.lovcal_vs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.yugi.lovcal_vs.dtos.emailDto;
import com.yugi.lovcal_vs.dtos.homePageDto;
import com.yugi.lovcal_vs.dtos.resultsDto;
import com.yugi.lovcal_vs.services.emailServiceImpl;

import jakarta.validation.Valid;

@Controller
public class emailController {
    @Autowired
    private emailServiceImpl emailservice;

    @RequestMapping("/email")
    // @ModelAttribute("email") emailDto email
    // @CookieValue("username") String username, Model model
    public String email_page(@ModelAttribute("email") emailDto email) {
        // model.addAttribute("email", new emailDto());
        // model.addAttribute("username", username);
        return "email_page";
    }

    @RequestMapping("/email_process")
    public String email_sucess(@SessionAttribute("userinfo") homePageDto userinfo,
            @SessionAttribute("friendshipinfo") resultsDto results, @Valid @ModelAttribute("email") emailDto email,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "email_page";
        }

        emailservice.sendEmail(userinfo.getYourname(), results.getFriendship(), email.getUserEmail(),
                results.getBond(), userinfo.getHername());
        return "email_sucess";
    }
}