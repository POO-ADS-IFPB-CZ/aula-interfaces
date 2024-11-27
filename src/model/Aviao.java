package model;

public class Aviao implements Planavel {

    private String modelo;
    private int ano;

    public Aviao(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public void voar(){
        System.out.println("Ligar o motor");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
