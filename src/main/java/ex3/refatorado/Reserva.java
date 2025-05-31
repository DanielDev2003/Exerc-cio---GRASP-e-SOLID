package main.java.ex3.refatorado;

public class Reserva {
    private int id;
    private double total;
    private Quarto quarto;
    private Cliente cliente;
    private int numeroDias;
    
    public Reserva(int id, Quarto quarto, Cliente cliente, int numeroDias) {
        this.id = id;
        this.total = 0;
        this.quarto = quarto;
        this.cliente = cliente;
        this.numeroDias = numeroDias;
    }

    public double getTotal() {
        return total;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumeroDias(){
        return numeroDias;
    }

    public void calcularTotal(){
        this.total = numeroDias * quarto.getPreco();
    }

    public void verificarDisponibilidade(){
        if(!quarto.isDisponivel()){
            throw new RuntimeException("Quarto indisponivel");
        }
    }

    public void aplicarDesconto(){
        this.total = cliente.getPlano().calcularDesconto(this.total);
    }

    public void confirmarReserva(){
        quarto.setDisponivel(false);
        System.out.println("Reserva confirmada: " + this.id);
    }
}
