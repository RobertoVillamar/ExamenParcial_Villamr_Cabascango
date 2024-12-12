/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Libro {

    private Autor autor;

    private String titulo;
    private int agnioLanzamiento;
    private int cantidadLibros;
    
    
    public Libro(){
        
    }

    public Libro(Autor autor, String titulo, int agnioLanzamiento, int cantidadLibros) {
        this.autor = autor;
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
    
     
    
    
    
    
}
 
