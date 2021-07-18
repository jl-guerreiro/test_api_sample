package com.jl.sample.apisamples.controller;

import java.util.ArrayList;

import com.jl.sample.apisamples.component.TodoList;
import com.jl.sample.apisamples.model.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    TodoList todoList;
    
    private static final String TODO = "/todo";

    @GetMapping(TODO)
    public ArrayList<Todo> getAll(){
        return todoList.getList();
    }

    @PostMapping(TODO)
    public ArrayList<Todo> insertOne(@RequestBody Todo todo){
        todoList.insert(todo);
        return todoList.getList();
    }

    @PostMapping(TODO + "/delete")
    public ArrayList<Todo> deleteOne(@RequestBody Todo todo){
        todoList.delete(todo);
        return todoList.getList();
    }

    @PostMapping(TODO + "/toggle")
    public ArrayList<Todo> toggleOne(@RequestBody Todo todo){
        todoList.toggle(todo);
        return todoList.getList();
    }

}
