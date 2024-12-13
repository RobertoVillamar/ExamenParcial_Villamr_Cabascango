/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Libro implements Prestamo{

    private Autor autor;
    private String idLibro;
    private String titulo;
    private int agnioLanzamiento;
    private int cantidadLibros;

    public Libro() {

    }

    public Libro(Autor autor, String idLibro, String titulo, int agnioLanzamiento, int cantidadLibros) {
        this.autor = autor;
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.agnioLanzamiento = agnioLanzamiento;
        this.cantidadLibros = cantidadLibros;
    }



    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAgnioLanzamiento() {
        return agnioLanzamiento;
    }

    public void setAgnioLanzamiento(int agnioLanzamiento) {
        this.agnioLanzamiento = agnioLanzamiento;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }
    
    
    @Override
    public String toString() {
        return "Autor: " + getAutor().getNombreArtistico() + "\n"
                +"ISBN :"+ getIdLibro()+"\n"
                + "Título: " + getTitulo() + "\n"
                + "Año de Lanzamiento: " + getAgnioLanzamiento() + "\n"
                + "Cantidad de Libros: " + getCantidadLibros();
    }

    @Override
    public String disponibilidad() {
        if (this.cantidadLibros > 0){
            return "Existen unidades disponibles";
        }else{
            return "No hay unidades disponibles";
        }
    }
    
}
