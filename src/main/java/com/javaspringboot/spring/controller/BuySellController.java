package com.javaspringboot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspringboot.spring.model.Buysell;
import com.javaspringboot.spring.service.BuySellService;

@CrossOrigin("*")
@RestController
public class BuySellController {
    
    private BuySellService buySellService;

    public BuySellController(@Autowired BuySellService buySellService){
        this.buySellService = buySellService;
    }

    @PostMapping("/BuySell/save")
    public void guardarBuySell(@RequestBody Buysell buysell){
        buySellService.saveBuySell(buysell);    
    }

    @PutMapping("/BuySell/update")
    public void updateBuySell(@RequestBody Buysell buysell){
        buySellService.saveBuySell(buysell);
    }

    @GetMapping("/BuySell/findAll")
    public List<Buysell> findAllBuySell(){
        return buySellService.findAllBuySell();
    }

    @DeleteMapping("/BuySell/delete/{id}")
        public void eliminarBuySell(@PathVariable Integer id){
            buySellService.eliminarBuySell(id);
        }
}