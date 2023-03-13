package com.chinghan.springboottodo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinghan.springboottodo.models.TodoList;

public interface TodoListRepository extends JpaRepository<TodoList, Long> {
    
}
