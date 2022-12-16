package com.javaspringboot.spring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//Orden -> crear las tablas con sus respectivos foreing key , despues hacer los constructores y 
//Setters and getters

//Le vamos a poner el nombre a nuestra tabla en nuestra base de datos
@Entity(name = "User")
public class User {
    //le especificamos a nuestra base que el siguiente atributo sera el id de la tb
    @Id 
    //generamos la llave PK
    @GeneratedValue
    private int id;
    private String name;
    //Aqui le puedo decir la manera en que lo mostrara en la columna tb
    //el unique hace que no se pueda repetir este dato en la tb
    @Column(name="last_name")
    private String lasname;
    @Column(unique = true)
    private String correo;
    
    //relacion one to one
    //@JsonBackReference
    //cuando se envia una relacion one to one se coloca lazy
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //Hacia donde CRACK ... AQUI
    private Licence licence;

    //relacion one to many
    //@JsonBackReference
    //en las relaciones One to Many el tiempo de fetch siempre se hace con EAGER
    //o para recibir se ocupa EAGER
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Buysell> buysell;

    public User() {
    }

    
    public User(int id, String name, String lasname, String correo) {
        this.id = id;
        this.name = name;
        this.lasname = lasname;
        this.correo = correo;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLasname() {
        return lasname;
    }
    public void setLasname(String lasname) {
        this.lasname = lasname;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

}
