package com.chinghan.springboottodo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.chinghan.springboottodo.models.TodoItem;
import com.chinghan.springboottodo.services.TodoItemService;

@Controller
public class TodoFormController {
    
    @Autowired
    private TodoItemService todoItemService;

    @GetMapping("/create-todo")
    public String showCreateForm(TodoItem todoItem) {
        return "new-todo-item";
    }

    @PostMapping("/todo")
    public String createTodoItem(TodoItem todoItem, BindingResult result, Model model) {
        TodoItem item = new TodoItem();
        item.setDescription(todoItem.getDescription());
        item.setIsCompleted(todoItem.getIsCompleted());
        todoItemService.save(item);
        return "redirect:/";
    }

    @DeleteMapping("delete/{id}")
    public String deleteTodoItem(@PathVariable("id") Long id, Model model) {
        TodoItem item = todoItemService.getById(id).orElseThrow(() -> new IllegalArgumentException("TodoItem id " + id + " not found."));
    
        todoItemService.delete(item);
        return "redirect:/";
    }

    @GetMapping("edit/{id}")
    public String editTodoItem(@PathVariable("id") Long id, Model model) {
        TodoItem item = todoItemService.getById(id).orElseThrow(() -> new IllegalArgumentException("TodoItem id " + id + " not found."));
        
        model.addAttribute("todo", item);
        return "edit-todo-item";
    }

    @PostMapping("todo/{id}")
    public String updateTodoItem(@PathVariable("id") Long id, TodoItem todoItem, BindingResult result, Model model) {
        TodoItem item = todoItemService.getById(id).orElseThrow(() -> new IllegalArgumentException("TodoItem id " + id + " not found."));
        item.setDescription(todoItem.getDescription());
        item.setIsCompleted(todoItem.getIsCompleted());
        todoItemService.save(item);
        return "redirect:/";
    }
}
