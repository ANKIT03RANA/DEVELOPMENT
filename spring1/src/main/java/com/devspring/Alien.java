package com.devspring;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer lap;

    @ConstructorProperties({"age","lap"}) //this annotation helps to define properties in xml in random order
    public Alien(int age, Computer lap) {
        this.age = age;
        this.lap = lap;
    }
    public int getAge() {
        return age;
    }
    public void setLap(Computer lap) {
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
