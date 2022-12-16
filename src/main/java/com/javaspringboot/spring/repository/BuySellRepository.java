package com.javaspringboot.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javaspringboot.spring.model.Buysell;

public interface BuySellRepository extends JpaRepository<Buysell,Integer> {
    
    @Query(value = "SELECT * From BuySell Where  monto = ?1", nativeQuery = true)
    List<Buysell> findmonto(Integer monto);
}
