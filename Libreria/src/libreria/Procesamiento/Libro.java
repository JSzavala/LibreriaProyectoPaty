/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Procesamiento;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Libro implements Serializable {
    public static final long serialVersionUID=1;
    private String titulo;
    private String autor;
    private boolean disponibilidad;
    
    public Libro(String titulo, String autor, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
// WHEN MODIFICAS JAJAJJSJSJSJSJJ
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public Object[] toArray(){
        return new Object[]{titulo, autor, (disponibilidad==true?"Disponible":"No disponible")};
    }
    
    @Override
    public String toString() {
        return titulo;
    }
    
}
