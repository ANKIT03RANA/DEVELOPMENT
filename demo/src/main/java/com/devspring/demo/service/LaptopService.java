package com.devspring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devspring.demo.model.Laptop;
import com.devspring.demo.repository.LaptopRepository;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        System.out.println("in addLaptop");
        repo.save(lap);
    }
    public boolean isGoodForCoding(Laptop lap){
        return true;
    }
}
