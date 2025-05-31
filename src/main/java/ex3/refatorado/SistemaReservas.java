package main.java.ex3.refatorado;

public class SistemaReservas {
    private Repositorio repositorio;

    public SistemaReservas(Repositorio repositorio){
        this.repositorio = repositorio;
    }

    public void processarReserva(Reserva reserva){
        reserva.calcularTotal();
        reserva.verificarDisponibilidade();
        reserva.aplicarDesconto();
        reserva.confirmarReserva();
        repositorio.add(reserva);
    }

}
