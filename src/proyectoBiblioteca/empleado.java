package co.edu.uniquindio.poo;

public class empleado {
    //atributos
    private String cargoOcupa;
    private informacionPersona informacionPersona;
    private biblioteca biblioteca;

    //constructor
    public empleado(String cargoOcupa, informacionPersona informacionPersona, biblioteca biblioteca) {
        this.cargoOcupa = cargoOcupa;
        this.informacionPersona = informacionPersona;
        this.biblioteca = biblioteca;
    }
    //Setter y Getter
    public String getCargoOcupa() {
        return cargoOcupa;
    }

    public void setCargoOcupa(String cargoOcupa) {
        this.cargoOcupa = cargoOcupa;
    }
}
