package com.javaspringboot.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringboot.spring.model.CarSell;
// JPA para Listas - Crud para Iterables
public interface CarSellRepository extends JpaRepository<CarSell,Integer> {
    
}
