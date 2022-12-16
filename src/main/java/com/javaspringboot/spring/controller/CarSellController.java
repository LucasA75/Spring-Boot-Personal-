package com.javaspringboot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspringboot.spring.model.CarSell;
import com.javaspringboot.spring.service.CarSellService;

@CrossOrigin("*")
@RestController
public class CarSellController {
    
    private CarSellService carSellService;

    public CarSellController(@Autowired CarSellService carSellService){
        this.carSellService = carSellService;
    }

    @PostMapping("/CarSell/save")
    public void guardarCarSell(@RequestBody CarSell carSell){
        carSellService.saveCarSell(carSell);    
    }

    @PutMapping("/CarSell/update")
    public void updateCarSell(@RequestBody CarSell carSell){
        carSellService.saveCarSell(carSell);
    }

    @GetMapping("/CarSell/findAll")
    public List<CarSell> todasLosCarSell(){
        return carSellService.findAllCarSell();
    }
    @DeleteMapping()
    public void eliminarCarSell(@PathVariable Integer id){
        carSellService.eliminarCarSell(id);
    }
}
