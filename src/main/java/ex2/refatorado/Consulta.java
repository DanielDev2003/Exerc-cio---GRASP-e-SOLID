package main.java.ex2.refatorado;


public class Consulta {
    private String animal;
    private String dono;
    private String horario;

    public Consulta(String animal, String dono, String horario) {
        this.animal = animal;
        this.dono = dono;
        this.horario = horario;
    }

    public String getAnimal() {
        return animal;
    }

    public String getDono() {
        return dono;
    }

    public String getHorario() {
        return horario;
    }

}
