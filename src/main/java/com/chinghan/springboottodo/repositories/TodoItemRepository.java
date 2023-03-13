package com.chinghan.springboottodo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinghan.springboottodo.models.TodoItem;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
    
    
}
