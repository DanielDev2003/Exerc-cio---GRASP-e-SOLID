package main.java.ex2.refatorado;

import java.util.List;

public class ExibirAgenda{
    public void imprimirAgenda(List<Consulta> consultas){
        for(Consulta c : consultas){
            System.out.println("Animal: " + c.getAnimal() + ", Dono:  " + c.getDono() + ", horaio: " + c.getHorario());
        }
    }
}
