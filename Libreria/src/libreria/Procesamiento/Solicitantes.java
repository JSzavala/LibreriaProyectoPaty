/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Procesamiento;

import java.io.Serializable;

/**
 *
 * @author samuel
 */
public class Solicitantes implements Serializable{
    private String nombre;
    public static final long serialVersionUID=4; 
    public Solicitantes(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    @Override
    public String toString (){
        return nombre;
    }
}
