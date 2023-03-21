package com.chinghan.springboottodo.models;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "todo_items")
public class TodoItem implements Serializable {
    
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;

    private Boolean isCompleted;

    private Instant createdTime;

    private Instant modifiedTime;

    // @ManyToOne(fetch = FetchType.LAZY, optional = false)
    // @JoinColumn(name = "todoList_id", nullable = false)
    // @Getter(AccessLevel.NONE)
    // @JsonIgnore
    // private TodoList todoList;

    @Override
    public String toString() {
        return String.format("TodoItem{id=%d, description='%s', isCompleted='%s', createdAt='%s', updatedAt='%s'}", 
                id, description, isCompleted, createdTime, modifiedTime);
    }

}
