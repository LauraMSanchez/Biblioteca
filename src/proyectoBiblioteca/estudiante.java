package proyectoBiblioteca;

import proyectoBiblioteca.informacionPersona;

public class estudiante {

 //Atributos
    private String programaAcademico;
    private informacionPersona informacionPersona;
    private biblioteca biblioteca;

    public empleado(String programaAcademico, informacionPersona informacionPersona, biblioteca biblioteca) {
        this.programaAcademico = programaAcademico;
        this.informacionPersona = informacionPersona;
        this.biblioteca = biblioteca;
    }

    //Métodos
    public void agregarEstudiante(String programaAcademico, informacionPersona informacionPersona, biblioteca biblioteca)
    {

    }
    
    public void borrarEstudiante(informacionPersona informacionPersona, biblioteca biblioteca)
    {

    }

    public void modificarEstudiante(informacionPersona informacionPersona, biblioteca biblioteca)
    {

    }

    public void infoEstudiante(informacionPersona informacionPersona, biblioteca biblioteca) 
    {

    }


    //Getter Setter
        public String getprogramaAcademico() {
        return programaAcademico;
    }

     public informacionPersona getInformacionPersona() {
        return informacionPersona;
    }

    public void setInformacionPersona(informacionPersona informacionPersona) {
        this.informacionPersona = informacionPersona;
    }

    
    public biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

}
