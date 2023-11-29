package com.yugi.lovcal_vs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yugi.lovcal_vs.dtos.billingDto;
import com.yugi.lovcal_vs.formatters.amountFormatter;
import com.yugi.lovcal_vs.formatters.cardFormatter;

@Controller
public class billingController {
    @RequestMapping("/billing")
    public String billing(@ModelAttribute("bill") billingDto bill) {
        return "billing";
    }

    @RequestMapping("/billing_sucess")
    public String billing_sucess(@ModelAttribute("bill") billingDto bill) {
        return "billing_sucess";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addCustomFormatter(new cardFormatter());
        binder.addCustomFormatter(new amountFormatter());
    }
}