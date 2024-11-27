/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Procesamiento;

/**
 *
 * @author PC
 */
public class Usuario {
    public static final long serialVersionUID=3;
    private String clave;
    private String nombre;
    private String apellidos;
    private String contrasenaEncriptada;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

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
        return "Usuario" + "clave=" + clave + ", nombre=" + nombre + ", apellidos=" + apellidos + ", contrasenaEncriptada=" + contrasenaEncriptada;
    }
    
    
}
