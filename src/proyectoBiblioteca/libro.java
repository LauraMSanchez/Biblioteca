package co.edu.uniquindio.poo;

import java.util.Date;

public class libro {
    //atributos
    private int ISBN;
    private String titulo;
    private Date fecha;
    private String nombreAutor;

    //constructor
   public libro(int ISBN,String titulo,Date fecha,String nombreAutor){
    this.ISBN=ISBN;
    this.titulo=titulo;
    this.fecha=fecha;
    this.nombreAutor=nombreAutor;
    }

   //Setter y Getter 
   public int getISBN() {
    return ISBN;

   }public void setISBN(int ISBN) {
    this.ISBN = ISBN;
   }
   
   public String getTitulo() {
    return titulo;
   }

   public void setTitulo(String titulo) {
    this.titulo = titulo;
   }

   public Date getFecha() {
    return fecha;
   }

   public void setFecha(Date fecha) {
    this.fecha = fecha;
   }

   public String getNombreAutor() {
    return nombreAutor;
   }
   public void setNombreAutor(String nombreAutor) {
    this.nombreAutor = nombreAutor;
   }
}
