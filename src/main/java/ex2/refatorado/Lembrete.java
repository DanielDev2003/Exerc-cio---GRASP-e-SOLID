package main.java.ex2.refatorado;

import java.util.List;

public interface Lembrete {
    public void enviarLembrete(List<Consulta> consultas, String mensagem);
}
