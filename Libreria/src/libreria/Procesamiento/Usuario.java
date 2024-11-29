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
    private String nombreUsuario;
    private String usuario;
    private String contrasenaEncriptada;
    
    public Usuario(String nombreUsuario, String usuario, String contrasena){
        this.nombreUsuario=nombreUsuario;
        this.usuario=usuario;
        setContrasenaEncriptada(contrasena);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenaEncriptada() {
        return contrasenaEncriptada;
    }

    public void setContrasenaEncriptada(String contrasenaEncriptada) {
        this.contrasenaEncriptada = contrasenaEncriptada.hashCode()+"";
    }

    /*@Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos + ", contrasenaEncriptada=" + contrasenaEncriptada;
    }*/
    
    
}
