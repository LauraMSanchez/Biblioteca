package proyectoBiblioteca;

import java.util.Date;

public class libro {
    
        //atributos
        private int ISBN;
        private String titulo;
        private Date fecha;//no sabemos como importar  el dateTime
        private String nombreAutor;
        private biblioteca biblioteca;
    
        //constructor
       public libro(int ISBN,String titulo,Date fecha,String nombreAutor,biblioteca biblioteca){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.fecha=fecha;
        this.nombreAutor=nombreAutor;
        this.biblioteca=biblioteca;
    
        //metodos
       }public void AgregarLibro(String Libro,biblioteca biblioteca){
    
       }public void BuscarLibroNombre(String título,biblioteca biblioteca){
    
       }public void BuscarLibroCodigo(int ISBN,biblioteca biblioteca){
    
       }public void eliminarLibro(int ISBN,String título,biblioteca biblioteca){
    
       }public void infoLibro(int ISBN , String título , biblioteca biblioteca){
        
       }
    
       //setter y getter de ISBN
       public int getISBN() {
        return ISBN;
    
       }public void setISBN(int ISBN) {
        this.ISBN = ISBN;
       }
       
       //setter y getter de Titulo
       public String getTitulo() {
        return titulo;
       }
    
       public void setTitulo(String titulo) {
        this.titulo = titulo;
       }
    
       //setter y getter de Fecha
       public Date getFecha() {
        return fecha;
       }
    
       public void setFecha(Date fecha) {
        this.fecha = fecha;
       }
    
       //setter y getter de NombreAutor
       public String getNombreAutor() {
        return nombreAutor;
       }
       public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
       }
}
