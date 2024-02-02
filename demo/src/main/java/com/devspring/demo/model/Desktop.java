package com.devspring.demo.model;

import org.springframework.stereotype.Component;

@Component //Steretype Annotation
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Desktop");
    }
}
