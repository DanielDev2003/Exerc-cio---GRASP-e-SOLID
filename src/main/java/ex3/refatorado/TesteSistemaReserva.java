package main.java.ex3.refatorado;

public class TesteSistemaReserva {
    public static void main(String[] args) {
        SistemaReservas sistemaReservas = new SistemaReservas(new RepositorioMemoria());
        Plano planoPremium = new PlanoPremium();
        Cliente cliente1 = new Cliente("Daniel", planoPremium);
        Quarto quarto1 = new Quarto(100);
        Reserva reserva1 = new Reserva(1, quarto1, cliente1, 2);
        sistemaReservas.processarReserva(reserva1);
        sistemaReservas.processarReserva(new Reserva(2, new Quarto(100), new Cliente("Maria", new PlanoPremium()), 2));

    }
}
