package com.devspring;

import org.springframework.stereotype.Component;

@Component //Annotation based configuration
public class Laptop implements Computer {
    @Override
    public void compile(){
        System.out.println("Laptop");
    }
}
