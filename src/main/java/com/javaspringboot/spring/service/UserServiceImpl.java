package com.javaspringboot.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javaspringboot.spring.model.User;
import com.javaspringboot.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    //esto verifica que la conexion en la base de datos esta correcta
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User getUser(Integer id){
        //simin en sql -> select * from user where id = id;
        // Optional es un tipo de Lista
        Optional <User> users = userRepository.findById(id);
        //el orelse es una funcion especial del optional, 
        //esto nos permite verificar si hay o no datos en nuestra lista 
        //si no hay devolvera null
        return users.orElse(null);
    }
    @Override
    public User save(User user){
        //esto guarda el usuario
        // el simil en sql -> insert into user(columnas)(values)
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id){
        //simil en sql -> delete from user where id = "id"
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

}

