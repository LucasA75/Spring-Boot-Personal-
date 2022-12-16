package com.javaspringboot.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.javaspringboot.spring.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
    //El ? compara el primer parametro dado y lo sustituye en la sentencia
    @Query(value = "SELECT * From Car Where marca = ?1", nativeQuery = true)
    List<Car> findAllAutoMarca(String marca);
    //el value le dice que es un string y el native le dice a Java que no interprete esto porque esta en otro lenguaje
    @Query(value = "Select * from car where color = ?1", nativeQuery = true)
    List<Car> findAllAutoColor(String color);
    //El ? compara el primer parametro dado y lo sustituye en la sentencia donde el numero al lado del ? da la posicion del parametro
    @Query(value = "select * from car where color = ?1 and marca = ?2",nativeQuery = true)
    List<Car> findAllAutoColorMarca(String color, String marca);
    //Como se hace un join en JAVA
    @Query(value = "select * from car c Join c.carsell cs",nativeQuery = true)
    List<Car> buscarAutosVendidos();
}
