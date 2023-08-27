package proyectoBiblioteca;

public class informacionPersona {

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
    //metodos
    public void agregarNombre(biblioteca Biblioteca,String nombre){

    }public void agregarIdentificacion(biblioteca Biblioteca,String identificacion){

    }public void agregarCorreo(biblioteca Biblioteca,String correo){

    }public void agregarTelefono(biblioteca Biblioteca,String telefono){

    }public void agregarDireccionCiudad(biblioteca Biblioteca,String direccionCiudad){

    }

    //setter y getter de nombre
    public String getNombre() {
        return nombre;

    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //setter y getter de Identificacion
    public String getIdentificacion() {
        return identificacion;

    }public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    //setter y getter de Correo
    public String getCorreo() {
        return correo;

    }public void setCorreo(String correo) {
        this.correo = correo;
    }

    //setter y getter de Telefono
    public String getTelefono() {
        return telefono;

    }public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //setter y getter de DireccionCiudad
    public String getDireccionCiudad() {
        return direccionCiudad;

    }public void setDireccionCiudad(String direccionCiudad) {
        this.direccionCiudad = direccionCiudad;
    }
    
}
