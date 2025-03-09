/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_abbyfernandez;

/**
 *
 * @author afern
 */
public class Rentador {
    private String nombre;//nombre de quien renta el libro
    private String apellido;
    private String DNI;//numero de id
    private int edad;//edad del rentador
    private int rentados;//cantidad de libros que ha rentado

    //constructor
    public Rentador(String nombre, String apellido, String DNI, int edad, int rentados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.rentados = rentados;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRentados() {
        return rentados;
    }

    public void setRentados(int rentados) {
        this.rentados = rentados;
    }

    @Override
    public String toString() {
        return "Rentador{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", edad=" + edad + ", rentados=" + rentados + '}';
    }
    
    
}
