package model;

//Não pode ser herdada
public final class Circulo implements AreaCalculavel{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(raio, 2);
    }

    //Não pode ser sobrescrito
    public final double getRaio(){
        return raio;
    }

    //Getters e setters

}
