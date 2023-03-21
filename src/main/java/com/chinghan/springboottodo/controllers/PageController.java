package com.chinghan.springboottodo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chinghan.springboottodo.services.TodoItemService;

@Controller
public class PageController {

    @Autowired
    private TodoItemService todoItemService;

    // @Autowired
    // private TodoListService todoListService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("todoItems", todoItemService.getAll());
        return modelAndView;
    }


}
