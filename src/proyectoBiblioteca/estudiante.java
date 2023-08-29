package co.edu.uniquindio.poo;

public class estudiante {
    //atributos
    private String programaAcademico;
    private informacionPersona informacionPersona;
    private biblioteca biblioteca;
    
    //constructor
    public estudiante(String programaAcademico, informacionPersona informacionPersona, biblioteca biblioteca) {
        this.programaAcademico = programaAcademico;
        this.informacionPersona = informacionPersona;
        this.biblioteca = biblioteca;
    }
    //Getter Setter

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
}
