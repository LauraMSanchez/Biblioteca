package proyectoBiblioteca;

import java.util.ArrayList;

public class biblioteca {

    //atributos
    private informacionPersona informacionPersona;
    private estudiante estudiante;
    private empleado empleado;
    private libro libro;
    private ArrayList<ArrayList<String>> servidor;

    //constructor
    public biblioteca(informacionPersona informacionPersona,estudiante estudiante,empleado empleado,libro libro,ArrayList<ArrayList<String>> servidor){
        this. informacionPersona=informacionPersona;
        this.estudiante=estudiante;
        this.empleado=empleado;
        this.libro=libro;
        this.servidor=servidor;
    }
    //metodos
    public  void datosEstudiantes(informacionPersona informacionPersona , estudiante estudiante , ArrayList<ArrayList<String>> servidor){

    }public void datosEmpleado(informacionPersona informacionPersona, empleado empleado  , ArrayList<ArrayList<String>> servidor){

    }public void datosLibro(libro libro , ArrayList<ArrayList<String>> servidor){

    }

    //setter y getter de InformacionPersona
    public informacionPersona getInformacionPersona() {
        return informacionPersona;
    }public void setInformacionPersona(informacionPersona informacionPersona) {
        this.informacionPersona = informacionPersona;
    }

    //setter y getter de Estudiante
    public estudiante getEstudiante() {
        return estudiante;
    }public void setEstudiante(estudiante estudiante) {
        this.estudiante = estudiante;
    }

    //setter y getter de Empleado
    public empleado getEmpleado() {
        return empleado;
    }public void setEmpleado(empleado empleado) {
        this.empleado = empleado;
    }

    //setter y getter de Libro
    public libro getLibro() {
        return libro;
    }public void setLibro(libro libro) {
        this.libro = libro;
    }

    //setter y getter de Servidor
    public ArrayList<ArrayList<String>> getServidor() {
        return servidor;
    }
    public void setServidor(ArrayList<ArrayList<String>> servidor) {
        this.servidor = servidor;
    }
}
