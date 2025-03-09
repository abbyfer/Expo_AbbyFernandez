/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_abbyfernandez;

/**
 *
 * @author afern
 */
public class Tipo {
    private String nombre;//nombre del libro
    private String autor; //nombre del autor
    private String estado; //rentado o disponible
    private String genero; //tipo de genero del libro
    private int an_pub;//año publicado

    
    //constructor
    public Tipo(String nombre, String autor, String estado, String genero, int an_pub) {
        this.nombre = nombre;
        this.autor = autor;
        this.estado = estado;
        this.genero = genero;
        this.an_pub = an_pub;
    }

    //getters y setters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAn_pub() {
        return an_pub;
    }

    public void setAn_pub(int an_pub) {
        this.an_pub = an_pub;
    }

    @Override
    public String toString() {
        return "Tipo{" + "nombre=" + nombre + ", autor=" + autor + ", estado=" + estado + ", genero=" + genero + ", an_pub=" + an_pub + '}';
    }
    
    
    
    
    
}
