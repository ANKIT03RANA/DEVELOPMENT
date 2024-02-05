package com.devspring.demo.service;

import org.springframework.stereotype.Repository;

import com.devspring.demo.model.Laptop;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("in repo");
    }
}
