package proyectoBiblioteca;

public class empleado {
    //atributos
    private String cargoOcupa;
    private informacionPersona informacionPersona;

    //constructor
    public empleado(String cargoOcupa, informacionPersona informacionPersona) {
        this.cargoOcupa = cargoOcupa;
        this.informacionPersona = informacionPersona;
    }
    
    //Setter y Getter
    public String getCargoOcupa() {
        return cargoOcupa;
    }

    public void setCargoOcupa(String cargoOcupa) {
        this.cargoOcupa = cargoOcupa;
    }
}
