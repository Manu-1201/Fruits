package com.org.cts.main.service;

import com.org.cts.main.model.Fruits;
import com.org.cts.main.repository.FruitsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitsServiceClass implements FruitsServiceInterface{
    @Autowired
    FruitsRepo fruitsRepo;
    public void addFruits(Fruits fruits){
        fruitsRepo.save(fruits);
    }
}
