package com.devspring;

import java.beans.ConstructorProperties;

import org.springframework.stereotype.Component;
@Component
public class Alien {

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
