package model;

public class SistemaInterno {

    public boolean autenticar(Autenticavel autenticavel){
        return autenticavel.autenticar("123","123");
    }

    private class Teste{
        private String teste;
    }

}
