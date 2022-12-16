package com.javaspringboot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.javaspringboot.spring.model.User;
import com.javaspringboot.spring.service.UserService;


@CrossOrigin("*") // esto permite de que desde cualquie parte puedan ingresar a mi controller
@RestController
public class UserController {
    
    private UserService userService;

    //Esto pide permisos del frontend
    public UserController(@Autowired UserService userService){
        this.userService = userService;
    }

    //pathvariable. se trabaja con la url
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
    //requestbody se trabaja con body -> en este caso con postman se envia el body
    //si lleva id, pero el id no existe, lo agrega
    @PostMapping("/user")
    public User newUser(@RequestBody User user){
        return userService.save(user);
    }
    //si lleva id y el id existe, lo actualiza
    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.delete(id);
    }

    @RequestMapping("/AllUser")
    public List<User> findAll(){
        List<User> listaUser =  userService.getAllUsers();
        return listaUser;
    }
}
//Cada controlador debe solamente hacer una funcion

//post para crear 
//put para editar
//la manera en que lo hacen es igual pero por orden se hace asi

