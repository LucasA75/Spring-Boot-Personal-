package com.javaspringboot.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.javaspringboot.spring.model.CarSell;
import com.javaspringboot.spring.repository.CarSellRepository;


@Service
@Transactional
public class CarSellService {
    
    private CarSellRepository carSellRepository;

    public CarSellService(CarSellRepository carSellRepository){
        this.carSellRepository = carSellRepository;
    }

    public void saveCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }

    public void updateCarSell(CarSell carSell){
        carSellRepository.save(carSell);
    }

    public List<CarSell> findAllCarSell(){
        return carSellRepository.findAll();
    }

    public void eliminarCarSell(Integer id){
        carSellRepository.deleteById(id);
    }

}
