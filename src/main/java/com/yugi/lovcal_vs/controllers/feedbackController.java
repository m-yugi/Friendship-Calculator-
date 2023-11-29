package com.yugi.lovcal_vs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.SessionAttributes;

import com.yugi.lovcal_vs.dtos.feedbackDto;
import com.yugi.lovcal_vs.services.feedbackEmailService;

import jakarta.validation.Valid;

@Controller
public class feedbackController {
    @Autowired
    private feedbackEmailService feedbackEmailService;

    @RequestMapping("/feedback")
    public String feedback(@ModelAttribute("feedback") feedbackDto feedback) {
        return "feed_back_form";
    }

    @RequestMapping("/feedbackprocess")
    public String feedbackprocess(@Valid @ModelAttribute("feedback") feedbackDto feedback, BindingResult result) {
        if (result.hasErrors()) {
            return "feed_back_form";
        }
        if (feedback.isAggred()) {
            feedbackEmailService.sendFeedbackEmail(feedback.getEmail(), feedback.getUsername());
        }
        return "feed_back_process";
    }
}