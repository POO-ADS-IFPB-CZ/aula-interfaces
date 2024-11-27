package model;

public class Quadrado implements AreaCalculavel{

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
