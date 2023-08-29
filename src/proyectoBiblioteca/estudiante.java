package proyectoBiblioteca;

public class estudiante {
    //atributos
    private String programaAcademico;
    private informacionPersona informacionPersona;

    
    //constructor
    public estudiante(String programaAcademico, informacionPersona informacionPersona) {
        this.programaAcademico = programaAcademico;
        this.informacionPersona = informacionPersona;
    }
    //Getter Setter

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
}
