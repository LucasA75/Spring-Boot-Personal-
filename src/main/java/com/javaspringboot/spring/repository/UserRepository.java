package com.javaspringboot.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaspringboot.spring.model.User;
// el crud repository se ocupa para trabajar con las bases de datos de manera
//mas eficiente, con funcionas ya prehechas
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    
}
