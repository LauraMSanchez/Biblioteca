package proyectoBiblioteca;

public class empleado {
    public class empleado {
    //Atributos
    private String cargoOcupa;
    private informacionPersona informacionPersona;
    private biblioteca biblioteca;

    public empleado(String cargoOcupa, informacionPersona informacionPersona, biblioteca biblioteca) {
        this.cargoOcupa = cargoOcupa;
        this.informacionPersona = informacionPersona;
        this.biblioteca = biblioteca;
    }

    //Métodos
    public void agregarEmpleado(String cargoOcupa, informacionPersona informacionPersona, biblioteca biblioteca)
    {

    }
    
    public void borrarEmpleado(informacionPersona informacionPersona, biblioteca biblioteca)
    {

    }

    public void modificarEmpleado(informacionPersona informacionPersona, biblioteca biblioteca)
    {

    }

    public void infoEmpleado (informacionPersona informacionPersona, biblioteca biblioteca) 
    {

    }


    //Getter Setter
        public String getCargoOcupa() {
        return cargoOcupa;
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
