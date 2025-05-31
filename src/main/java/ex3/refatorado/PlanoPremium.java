package main.java.ex3.refatorado;

public class PlanoPremium implements Plano{
    @Override
    public double calcularDesconto(double total){
        return total * 0.9;
    }
}
