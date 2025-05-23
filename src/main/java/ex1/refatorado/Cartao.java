package main.java.ex1.refatorado;
public class Cartao implements FormaPagamento {
    @Override
    public void formaPagamento(){
        System.out.println("Processando Cartão...");
    }
}
