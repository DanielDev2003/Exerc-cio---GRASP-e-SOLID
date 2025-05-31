package main.java.ex2.refatorado;

public class TesteAgenda {
    public static void main(String[] args) {
        AgendaVeterinaria agendaVeterinaria = new AgendaVeterinaria(new RepositorioEmMemoria(), new EnviarLembreteEmail());
        Consulta c1 = new Consulta("Cachorro", "Daniel", "14:00:00");
        agendaVeterinaria.agendarConsulta(c1);
        agendaVeterinaria.agendarConsulta(new Consulta("Gato", "Maria", "13:00:00"));
        agendaVeterinaria.cancelarConsulta(c1);
        agendaVeterinaria.imprimirAgenda(new ExibirAgenda());
        agendaVeterinaria.enviarLembrete("Seu cachorro está pronto.");

    }    
}
