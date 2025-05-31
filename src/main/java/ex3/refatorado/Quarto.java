package main.java.ex3.refatorado;

public class Quarto {
    private double preco;
    private boolean disponivel;

    public Quarto(double preco){
        this.preco = preco;
        this.disponivel = true;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    
}
