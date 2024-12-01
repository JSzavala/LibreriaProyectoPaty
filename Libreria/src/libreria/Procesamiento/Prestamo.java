/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Procesamiento;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Prestamo implements Serializable{
    public static final long serialVersionUID=2;
    private ArrayList<Object> nombresLibro;
    private Object nombreUsuario;
    private boolean devuelto;
    private LocalDate fechaPrestamo;
    private LocalDate fechaRegreso;

    public Prestamo(ArrayList<Object> nombresLibro, Object nombreUsuario, boolean devuelto, LocalDate fechaPrestamo, LocalDate fechaRegreso) {
        this.nombresLibro = nombresLibro;
        this.nombreUsuario = nombreUsuario;
        this.devuelto = devuelto;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaRegreso = fechaRegreso;
    }

    public ArrayList<Object> getNombresLibro() {
        return nombresLibro;
    }

    public void setNombresLibro(ArrayList<Object> nombresLibro) {
        this.nombresLibro = nombresLibro;
    }

    public Object getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(Object nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public boolean getDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(LocalDate fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    
    public Object[] toArray(){
        return new Object[]{nombresLibro,nombreUsuario,devuelto,fechaPrestamo,fechaRegreso};
    }
    
    @Override
    public String toString() {
        return "("+fechaPrestamo+") "+ nombreUsuario; 
    }
    
}
