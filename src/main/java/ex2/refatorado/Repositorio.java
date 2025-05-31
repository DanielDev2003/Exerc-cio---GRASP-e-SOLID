package main.java.ex2.refatorado;

import java.util.List;

public interface Repositorio {
    public void add(Consulta consulta);
    public void remove(Consulta consulta);
    public List<Consulta> getConsultas();
}
