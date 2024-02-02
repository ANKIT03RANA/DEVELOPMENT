package com.devspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("desktop") //Annotation based configuration // we can name the bean like this as well
@Primary // for autowiring
public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("Desktop");
    }
}