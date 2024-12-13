/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Autor extends Persona {

    private String nombreArtistico;
    private String biografia;
    private String nacionalidad;
    private int numeroLibros;

    public Autor() {

    }

    public Autor(String nombreArtistico, String biografia, String nacionalidad, int numeroLibros) {
        this.nombreArtistico = nombreArtistico;
        this.biografia = biografia;
        this.nacionalidad = nacionalidad;
        this.numeroLibros = numeroLibros;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    @Override

    public String toString() {
        return  super.toString()+"\n"+
                "Nombre Artístico: " + getNombreArtistico() + "\n"
                + "Biografía: " + "\n" + getBiografia() + "\n"
                + "Nacionalidad: " + getNacionalidad() + "\n"
                + "Número de Libros: " + getNumeroLibros();
    }

}
