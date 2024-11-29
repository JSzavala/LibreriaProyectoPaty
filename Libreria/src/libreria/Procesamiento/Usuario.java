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
public class Usuario implements Serializable{
    public static final long serialVersionUID=3;
    private String nombre;
    private String apellidos;
    private String contrasenaEncriptada;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasenaEncriptada() {
        return contrasenaEncriptada;
    }

    public void setContrasenaEncriptada(String contrasenaEncriptada) {
        this.contrasenaEncriptada = contrasenaEncriptada;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos + ", contrasenaEncriptada=" + contrasenaEncriptada;
    }
    
    
}
