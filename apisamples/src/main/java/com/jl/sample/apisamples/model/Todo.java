package com.jl.sample.apisamples.model;

public class Todo {
    
 private String text;
 private Boolean done;

 public Todo(){

 }

 public Todo(String text, Boolean done){
     this.text = text;
     this.done = done;
 }

public String getText() {
    return text;
}

public void setText(String text) {
    this.text = text;
}

public Boolean getDone() {
    return done;
}

public void setDone(Boolean done) {
    this.done = done;
}

 

}
