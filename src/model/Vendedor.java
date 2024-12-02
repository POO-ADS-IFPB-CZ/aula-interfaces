package model;

public class Vendedor extends Funcionario {

    private float vendas;

    public Vendedor(String cpf, String nome, float vendas) {
        super(cpf, nome);
        this.vendas = vendas;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
}
