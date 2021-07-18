package com.jl.sample.apisamples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    
    private static final String NUMBERS = "/numbers";

    @GetMapping(NUMBERS)
    public String[] getAll(){
        return new String[]{"Um","Dois"};
    }

}
