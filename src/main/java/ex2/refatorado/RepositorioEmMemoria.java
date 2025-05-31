package main.java.ex2.refatorado;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEmMemoria implements Repositorio {
    private List<Consulta> consultas = new ArrayList<>();
    
    @Override
    public void add(Consulta consulta){
        consultas.add(consulta);
    }

    @Override
    public void remove(Consulta consulta){
        consultas.remove(consulta);
    }

    @Override
    public List<Consulta> getConsultas() {
        return new ArrayList<>(consultas);
    }
}
