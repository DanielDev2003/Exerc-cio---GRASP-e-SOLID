package main.java.ex3.refatorado;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMemoria implements Repositorio{
    List<Reserva> reservas = new ArrayList<>();
    
    @Override
    public void add(Reserva reserva){
        reservas.add(reserva);
    }
}
