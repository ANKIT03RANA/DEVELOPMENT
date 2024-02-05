package com.devspring;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component //Annotation based configuration
public class Alien {

    @Value("24")
    private int age;
    private Computer lap;

    
    @ConstructorProperties({"age","lap"}) //this annotation helps to define properties in xml in random order
    public Alien(int age, Computer lap) {
        this.age = age;
        this.lap = lap;
    }

    public Alien() {
    }
    public int getAge() {
        return age;
    }
    @Autowired  //It is always prferred to write this at setter
    // @Qualifier("desktop") // name of class should start with small caps qualifier does have high priority than primary // This is called Field Injection
    public void setlap(Computer lap) {
        this.lap = lap;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Laptop lap;
    public void code(){
        lap.compile();
        System.out.println("Alien");
    }
}
