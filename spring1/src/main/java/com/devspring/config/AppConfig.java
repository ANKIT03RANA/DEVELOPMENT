package com.devspring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.devspring.Alien;
import com.devspring.Computer;
import com.devspring.Desktop;
import com.devspring.Laptop;

@Configuration //for java based configuration
@ComponentScan("com.devspring") //for Annotation based configuration
public class AppConfig {

   // public Alien alien(@Qualifier("desktop") Computer com){ qualifier annotation is same like ref in xml config
    @Bean
    public Alien alien(@Autowired Computer com){ //qualifier annotation is same like ref in xml config
        Alien obj = new Alien();
        obj.setAge(24);
        obj.setlap(com);

        return obj;
    }

    @Bean(name={"Desk1","Comp1"})//here using name we can name the bean and we can give array of name as well using paranthesis
    // @Scope("prototype")// same like sl config by default it is singleton.
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean 
    @Primary //primary is for autowiring confusion
    public Laptop laptop(){
        return new Laptop();
    }
    
}
