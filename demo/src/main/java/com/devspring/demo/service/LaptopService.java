package com.devspring.demo.service;

import org.springframework.stereotype.Service;

import com.devspring.demo.model.Laptop;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap){
        System.out.println("in addLaptop");
    }
    public boolean isGoodForCoding(Laptop lap){
        return true;
    }
}
