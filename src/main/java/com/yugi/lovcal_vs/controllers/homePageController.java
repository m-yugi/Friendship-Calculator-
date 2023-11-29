package com.yugi.lovcal_vs.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yugi.lovcal_vs.dtos.homePageDto;
import com.yugi.lovcal_vs.dtos.resultsDto;
import com.yugi.lovcal_vs.services.friendShipServiceImpl;

@Controller
@SessionAttributes({ "userinfo", "friendshipinfo" })
public class homePageController {
    @Autowired
    private friendShipServiceImpl friendshipservice;
    // @RequestMapping("/")
    // public String homePage(Model model) {
    // homePageDto userinfo = new homePageDto();
    // model.addAttribute("userinfo", userinfo);
    // return "homepage";
    // }

    // @RequestMapping("/processHomePage")
    // public String processHomePage(homePageDto userinfo, Model model) {
    // model.addAttribute("userinfo", userinfo);
    // return "processpage";
    // }
    @RequestMapping("/")
    public String homePage(Model model) {
        // homePageDto userinfo = new homePageDto();
        // model.addAttribute("userinfo", userinfo);
        // Cookie[] cookie = request.getCookie();
        // for (Cookie cookies : cookie) {
        // if ("username".equals(cookies.getName())) {
        // String username = cookies.getValue();
        // userinfo.setYourname(username);
        // }
        // }
        model.addAttribute("userinfo", new homePageDto());
        return "homepage";
    }

    @RequestMapping("/processHomePage")
    public String processHomePage(@Valid Model model, @Valid homePageDto userinfo, BindingResult result) {
        model.addAttribute("userinfo", userinfo);
        model.addAttribute(result.MODEL_KEY_PREFIX + "userinfo", result);
        if (result.hasErrors()) {
            return "homepage";
        }
        resultsDto friendshipresults = new resultsDto();
        int friendShipResult = friendshipservice.calculatorLogic(userinfo.getYourname(), userinfo.getHername());
        friendshipresults.setFriendship(friendShipResult);
        friendshipresults.setBond(friendshipservice.getBond(friendShipResult));
        model.addAttribute("friendshipinfo", friendshipresults);
        return "processpage";
        // creating a cookie to store the data
        // Cookie cookie = new Cookie("username", userinfo.getYourname());
        // cookie.setMaxAge(5);
        // response.addCookie(cookie);
        // model.addAttribute("userinfo", userinfo);
        // HttpSession session = request.getSession();
        // session.setAttribute("username", userinfo.getYourname());
        // session.setMaxInactiveInterval(120);

    }
}