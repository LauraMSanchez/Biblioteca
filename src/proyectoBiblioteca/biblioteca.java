package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class biblioteca {
    //atributos
    private informacionPersona informacionPersona;
    private estudiante estudiante;
    private empleado empleado;
    private libro libro;
    private ArrayList<ArrayList<String>> servidor;
    private  String busquedaEstudiantes;
    private  String busquedaEmpleado;
    private  String busquedaLibros;

    //constructor
    public biblioteca(informacionPersona informacionPersona,estudiante estudiante,empleado empleado,libro libro,ArrayList<ArrayList<String>> servidor){
        this. informacionPersona=informacionPersona;
        this.estudiante=estudiante;
        this.empleado=empleado;
        this.libro=libro;
        this.servidor=servidor;
    }
    //metodos
    public void agregarInfoPersona(){

    }

    public void agregarEstudiante(estudiante estudiante,informacionPersona informacionPersona,ArrayList<ArrayList<String>> servidor){

    }public void BuscarEstudianteID(String busquedaEstudiantes,ArrayList<ArrayList<String>> servidor){

    }public void eliminarEstudiante(String busquedaEstudiantes,ArrayList<ArrayList<String>> servidor){

    }public void modificarEstudiante(String busquedaEstudiantes,ArrayList<ArrayList<String>> servidor){

    }public void infoEstudiante(String busquedaEstudiantes,ArrayList<ArrayList<String>> servidor) {

    }public void agregarEmpleado(empleado empleado,informacionPersona informacionPersona,ArrayList<ArrayList<String>> servidor){

    }public void BuscarEmpleadoID(String busquedaEmpleado,ArrayList<ArrayList<String>> servidor){

    }public void eliminarEmpleado(String busquedaEmpleado,ArrayList<ArrayList<String>> servidor){

    }public void modificarEmpleado(String busquedaEmpleado,ArrayList<ArrayList<String>> servidor){

    }public void infoEmpleado (String busquedaEmpleado,ArrayList<ArrayList<String>> servidor) {

    }public void agregarLibro(libro libro,ArrayList<ArrayList<String>> servidor){

    }public void buscarLibroNombre(String busquedaLibros,ArrayList<ArrayList<String>> servidor){

    }public void buscarLibroCodigo(String busquedaLibros,ArrayList<ArrayList<String>> servidor){

    }public void eliminarLibro(String busquedaLibros,ArrayList<ArrayList<String>> servidor){
        
    }public void modificarLibro(String busquedaLibros,ArrayList<ArrayList<String>> servidor){

    }public void infoLibro(String busquedaLibros,ArrayList<ArrayList<String>> servidor){
    
    }
}
