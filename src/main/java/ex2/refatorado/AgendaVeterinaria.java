package main.java.ex2.refatorado;

public class AgendaVeterinaria {
    public Repositorio repositorio;
    public Lembrete lembrete;
    
    public AgendaVeterinaria(Repositorio repositorio, Lembrete lembrete) {
        this.repositorio = repositorio;
        this.lembrete = lembrete;
    }

    public void agendarConsulta(Consulta consulta){
        repositorio.add(consulta);
    }

    public void cancelarConsulta(Consulta consulta){
        repositorio.remove(consulta);
    }

    public void imprimirAgenda(ExibirAgenda exibirAgenda){
        exibirAgenda.imprimirAgenda(repositorio.getConsultas());
    }

    public void enviarLembrete(String mensagem){
        lembrete.enviarLembrete(repositorio.getConsultas(), mensagem);
    }
}
