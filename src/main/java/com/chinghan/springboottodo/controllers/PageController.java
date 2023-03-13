package com.chinghan.springboottodo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chinghan.springboottodo.models.TodoItem;
import com.chinghan.springboottodo.repositories.TodoItemRepository;

@Controller
public class PageController {

    @Autowired
    private TodoItemRepository todoItemRepository;

    // @Autowired
    // private TodoListRepository todoListRepository;

    @GetMapping("/")
    public String getWelcome(Model model) {
        
        // TodoList todoList = new TodoList();
        // TodoItem todoItem = new TodoItem();

        // todoItem.setTodoList(todoList);
        // todoItem.setCompleted(false);
        // todoItem.setDescription("Clean Code Chap 1");

        // todoListRepository.save(todoList);
        // todoItemRepository.save(todoItem);

        Iterable<TodoItem> todoItems = todoItemRepository.findAll();
        model.addAttribute("todoItems", todoItems);

        return "welcome";
    }
}
