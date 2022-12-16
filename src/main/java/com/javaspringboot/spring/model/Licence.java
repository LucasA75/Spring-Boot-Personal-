package com.javaspringboot.spring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;


@Entity(name="license") // esete permite crear y darle un nombre en SQL
public class Licence {
    @Id
    @GeneratedValue// con estos dos atributos le dices que el siguiiente parametro es la PK
    private Integer id;
    private int numero;
    //este es como el columm
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaVencimiento;
    private String clase;
    private String estado;

    //relacion one to one
    //recepcion de la relacion one to one
    //@JsonManagedReference
    @OneToOne(fetch = FetchType.EAGER)
    //SE crea la columna con la FK
    @JoinColumn(name = "user_id")
    private User user;
    
    public Licence() {
    }

    public Licence(Integer id, int numero, Date fechaVencimiento, String clase, String estado, User user) {
        this.id = id;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.clase = clase;
        this.estado = estado;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
