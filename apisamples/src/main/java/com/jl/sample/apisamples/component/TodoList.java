package com.jl.sample.apisamples.component;

import java.util.ArrayList;

import com.jl.sample.apisamples.model.Todo;

import org.springframework.stereotype.Component;

@Component
public class TodoList {
   
    private ArrayList<Todo> todoList;

    public TodoList(){
        this.todoList = new ArrayList<Todo>();
        insert(new Todo("Learn JavaScript",false));
        insert(new Todo("Learn Vue", true));
    }

    public ArrayList<Todo> getList(){
        return this.todoList;
    }

    public void insert(Todo todo){
        this.todoList.add(todo);
    }

    public void delete(Todo todo){
        this.todoList.removeIf(x -> (x.getText().equals(todo.getText())));
    }

    public void toggle(Todo todo){
        this.todoList.stream()
        .filter(x -> (x.getText().equals(todo.getText())))
        .forEach(x -> x.setDone(todo.getDone()));
    }

}
