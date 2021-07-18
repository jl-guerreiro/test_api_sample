package com.jl.sample.apisamples.controller;

import java.util.ArrayList;

import com.jl.sample.apisamples.model.Todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    
    private static final String TODO = "/todo";

    @GetMapping(TODO)
    public ArrayList<Todo> getAll(){
        ArrayList<Todo> aList = new ArrayList<Todo>();
        Todo tt = new Todo();
        tt.setText("Learn JavaScript");
        tt.setDone(false);
        aList.add(tt);
        tt = new Todo();
        tt.setText("Learn Vue");
        tt.setDone(true);
        aList.add(tt);
        return aList;
    }

}
