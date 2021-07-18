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

}
