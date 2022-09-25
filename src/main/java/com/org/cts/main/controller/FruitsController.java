package com.org.cts.main.controller;

import com.org.cts.main.model.Fruits;
import com.org.cts.main.service.FruitsServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/master")
public class FruitsController {
    @Autowired
    FruitsServiceInterface fruitsServiceInterface;
    @PostMapping("/add")
    public void addFruit(@RequestBody Fruits fruits){
        fruitsServiceInterface.addFruits(fruits);
    }


}
