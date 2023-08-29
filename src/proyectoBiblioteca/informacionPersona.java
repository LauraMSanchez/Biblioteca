package co.edu.uniquindio.poo;

public class informacionPersona{
    //atributos
    private String nombre;
    private String identificacion;
    private String correo;
    private String telefono;
    private String direccionCiudad;
    private biblioteca Biblioteca;

    //constructor
    public informacionPersona(String nombre,String identificacion,String correo,String telefono,String direccionCiudad){
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.correo=correo;
        this.telefono=telefono;
        this.direccionCiudad=direccionCiudad;
    }
    //

    //setter y getter 
    public String getNombre() {
        return nombre;

    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;

    }public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;

    }public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;

    }public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionCiudad() {
        return direccionCiudad;

    }public void setDireccionCiudad(String direccionCiudad) {
        this.direccionCiudad = direccionCiudad;
    }
}
