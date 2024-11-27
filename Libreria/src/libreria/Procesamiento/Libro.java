/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Procesamiento;

/**
 *
 * @author PC
 */
public class Libro implements Serializable {
    private String clave;
    private String titulo;
    private String autor;
    private boolean Disponibilidad;
    
    public Libro(String clave, String titulo, String autor, boolean Disponibilidad) {
        this.clave = clave;
        this.titulo = titulo;
        this.autor = autor;
        this.Disponibilidad = Disponibilidad;
    }

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
