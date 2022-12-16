package com.javaspringboot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//si hay mas de importaciones de una libreria? se recomienda colocar un * para importar todo
import org.springframework.web.bind.annotation.*;

import com.javaspringboot.spring.model.Car;
import com.javaspringboot.spring.service.CarService;

@CrossOrigin("*")
@RestController
public class CarController {
    
    private CarService carService;

    public CarController(@Autowired CarService carService){
        this.carService = carService;
    }

    @PostMapping("/Car/save")
    public void guardarauto(@RequestBody Car car){
        carService.saveCar(car);
    }

    @PutMapping("/Car/Update")
    public void actualizarAuto(@RequestBody Car car){
        carService.updateCar(car);
    }

    @GetMapping("/Car/findAll")
    public List<Car> todoslosAutos(){
        return carService.findAll();
    }

    @GetMapping("/Car/buscarMarca/{marca}")
    public List<Car> buscarMarca(@PathVariable String marca){
        return carService.buscarPorMarca(marca);
    }

    @GetMapping("/Car/buscarColor")
    public List<Car> buscarColor(@RequestBody String color){
        return carService.buscarPorColor(color);
    }
    
    @GetMapping("/Car/buscarColorMarca")
    public List<Car> buscarColorMarca(@RequestBody String color, String marca){
        return carService.buscarPorColorMarca(color, marca);
    }

    @DeleteMapping("/Car/delete/{id}")
    public void eliminarAuto(@PathVariable Integer id){
        carService.eliminarAuto(id);
    }
}
