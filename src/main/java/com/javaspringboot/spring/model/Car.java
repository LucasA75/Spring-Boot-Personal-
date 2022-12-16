package com.javaspringboot.spring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.Range;



//EN JOIN TABLE el name= tiene que ser Igual al nombre de la tabla con el entity que estoy llamando 
@Entity(name="Car")
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    private String marca;
    private String modelo;
    private String color;
    private int ano;
    @Range(min=0)
    private int valor;

    //Many to many
    //@JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name="CarSell", //nombre TB relacional
        joinColumns = @JoinColumn(name="car_id"), //nombre de la columna de mi tabla
        inverseJoinColumns = @JoinColumn(name="buySell_id") //nombre de la columna de la tabla de compra y venta
    )
    private List <CarSell> carSell;




    
    public Car() {
    }


    public Car(Integer id, String marca, String modelo, String color, int ano, @Range(min = 0) int valor,
            List<CarSell> carSell) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.valor = valor;
        this.carSell = carSell;
    }





    public Integer getId() {
        return id;
    }





    public void setId(Integer id) {
        this.id = id;
    }





    public String getMarca() {
        return marca;
    }





    public void setMarca(String marca) {
        this.marca = marca;
    }





    public String getModelo() {
        return modelo;
    }





    public void setModelo(String modelo) {
        this.modelo = modelo;
    }





    public String getColor() {
        return color;
    }





    public void setColor(String color) {
        this.color = color;
    }





    public int getAno() {
        return ano;
    }





    public void setAno(int ano) {
        this.ano = ano;
    }





    public int getValor() {
        return valor;
    }





    public void setValor(int valor) {
        this.valor = valor;
    }





    public List<CarSell> getCarSell() {
        return carSell;
    }





    public void setCarSell(List<CarSell> carSell) {
        this.carSell = carSell;
    }

    
}
