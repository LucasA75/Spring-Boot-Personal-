package com.javaspringboot.spring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


@Entity(name="buySell")
public class Buysell {
    @Id
    @GeneratedValue
    private Integer id;
    @Range(min=0) // con esto nos aseguramos que el monto siempre sera mayor a cero
    private int monto;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fechacompra;

    //Recepcionar One to Many
    //@JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    //Many to many de auto
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name="carsell",
        joinColumns = @JoinColumn(name="buySell_id"),
        inverseJoinColumns = @JoinColumn(name ="car_id")
    )
    private List<Car> car;


    public Buysell() {
    }


    public Buysell(Integer id, @Range(min = 0) int monto, Date fechacompra, User user, List<Car> car) {
        this.id = id;
        this.monto = monto;
        this.fechacompra = fechacompra;
        this.user = user;
        this.car = car;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public int getMonto() {
        return monto;
    }


    public void setMonto(int monto) {
        this.monto = monto;
    }


    public Date getFechacompra() {
        return fechacompra;
    }


    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public List<Car> getCar() {
        return car;
    }


    public void setCar(List<Car> car) {
        this.car = car;
    }

    

}
