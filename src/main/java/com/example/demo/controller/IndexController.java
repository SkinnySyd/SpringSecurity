package com.example.demo.controller;

import com.example.demo.entities.Ticket;
import com.example.demo.entities.User;
import com.example.demo.repository.TicketRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @Autowired
    TicketRepository ticketRepository;



    @RequestMapping(value = "")
    public String index(Model model, @ModelAttribute("loggedInUser") User loggedInUser, HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("title", "login");
        return "login";
    }
}