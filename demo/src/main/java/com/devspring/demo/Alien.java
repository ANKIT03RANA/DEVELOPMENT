package com.devspring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //it will allow spring to create/manage object for this class.Object will get created in container inside JVM
public class Alien {
    @Autowired//it will create object for the dependency class
    Laptop lap;
    public void code(){
        lap.compile();
        // System.out.println("Alien");
    }
}
