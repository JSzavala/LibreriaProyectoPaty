/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Procesamiento;

/**
 *
 * @author PC
 */
public class Libro {
    private String clave;
    private String titulo;
    private String autor;
    private boolean Disponibilidad;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro{" + "clave=" + clave + ", titulo=" + titulo + ", autor=" + autor + ", Disponibilidad=" + Disponibilidad + '}';
    }
    
}
