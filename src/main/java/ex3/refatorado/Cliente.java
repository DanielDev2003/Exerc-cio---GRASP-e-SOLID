package main.java.ex3.refatorado;

public class Cliente {
    private String nome;
    private Plano plano;

    public Cliente(String nome, Plano plano){
        this.nome = nome;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano){
        this.plano = plano;
    }
}
