// package com.chinghan.springboottodo.models;

// import java.io.Serializable;
// import java.time.Instant;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;

// import lombok.Getter;
// import lombok.Setter;

// @Entity
// @Getter @Setter
// public class TodoList implements Serializable {

//     private static final Long serialVersionUID = 1L;
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private Long id;

//     private String description;

//     private Boolean completed;

//     private Instant dateCreated;

//     private Instant dateModified;

//     // @OneToMany(mappedBy = "todoList", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//     // private List<TodoItem> todoItems;
// }
