package model;

import java.io.Serializable;

public class Quadrado implements AreaCalculavel, Serializable{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }

    //Getters e setters

}
