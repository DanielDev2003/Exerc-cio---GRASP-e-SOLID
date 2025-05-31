package main.java.ex2.refatorado;

import java.util.List;

public class EnviarLembreteEmail implements Lembrete {

    @Override
    public void enviarLembrete(List<Consulta> consultas, String mensagem){
        for(Consulta c : consultas){
            System.out.println("Enviando por email para: " + c.getDono() + ": " + mensagem);
        }
    }
}
