package com.devspring.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //it will allow spring to create/manage object for this class.Object will get created in container inside JVM
public class Alien {

    @Value("24")
    private int age;
    private Computer lap;

    public Alien(int age, Computer lap) {
        this.age = age;
        this.lap = lap;
    }

    public Alien() {
    }
    public int getAge() {
        return age;
    }
    @Autowired  //it will create object for the dependency class
    @Qualifier("laptop") // name of class should start with small caps //qualifier does have high priority than primary // This is called Field Injection
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
