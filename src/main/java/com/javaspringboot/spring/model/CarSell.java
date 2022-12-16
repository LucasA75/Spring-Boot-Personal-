package com.javaspringboot.spring.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="CarSell")
public class CarSell {
    @Id
    @GeneratedValue
    private Integer id;
    private int cantidad;

    //La relacion many to many son dos relaciones one to many
    //many to one a auto
    //aL SER UNA tb RELACIONAL ya no se llama a Json
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;


    //Many to one a buySell
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buySell_id")
    private Buysell buysell;


    public CarSell() {
    }


    public CarSell(Integer id, int cantidad, Car car, Buysell buysell) {
        this.id = id;
        this.cantidad = cantidad;
        this.car = car;
        this.buysell = buysell;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public Car getCar() {
        return car;
    }


    public void setCar(Car car) {
        this.car = car;
    }


    public Buysell getBuysell() {
        return buysell;
    }


    public void setBuysell(Buysell buysell) {
        this.buysell = buysell;
    }

}
