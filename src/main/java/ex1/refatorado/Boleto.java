package main.java.ex1.refatorado;

public class Boleto implements FormaPagamento {
    @Override
    public void formaPagamento(){
        System.out.println("Gerando Boleto...");
    }
}
