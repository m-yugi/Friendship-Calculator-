package com.yugi.lovcal_vs.controllers;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yugi.lovcal_vs.customeditors.allUpEditor;
import com.yugi.lovcal_vs.dtos.registerDto;
import com.yugi.lovcal_vs.formatters.phoneFormatter;
import com.yugi.lovcal_vs.validators.emailValidator;
import com.yugi.lovcal_vs.validators.passwordValidator;

import jakarta.validation.Valid;

@Controller
public class registrationController {
    @RequestMapping("/register")
    public String register(@ModelAttribute("userinfo") registerDto userinfo) {
        return "register_form";
    }

    @RequestMapping("/registration_sucess")
    public String successPage(@Valid @ModelAttribute("userinfo") registerDto userinfo, BindingResult results) {
        if (results.hasErrors()) {
            for (ObjectError error : results.getAllErrors()) {
                System.out.println(error);
            }
            return "register_form";
        }
        return "success_page";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addCustomFormatter(new phoneFormatter());
        binder.registerCustomEditor(String.class, "username", new StringTrimmerEditor(true));
        binder.registerCustomEditor(String.class, "username", new allUpEditor());
        binder.addValidators(new passwordValidator());
        binder.addValidators(new emailValidator());
    }
}