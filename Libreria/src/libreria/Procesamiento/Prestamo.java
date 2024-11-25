/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Procesamiento;

import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Prestamo {
    private String claveLibro;
    private String claveUsuario;
    private boolean devuelto;
    private LocalDate fechaPrestamo;
    private LocalDate fechaRegreso;

    
    public String getClaveLibro() {
        return claveLibro;
    }

    public void setClaveLibro(String claveLibro) {
        this.claveLibro = claveLibro;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public boolean isDevuelto() {
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

    @Override
    public String toString() {
        return "Prestamo{" + "claveLibro=" + claveLibro + ", claveUsuario=" + claveUsuario + ", devuelto=" + devuelto + ", fechaPrestamo=" + fechaPrestamo + ", fechaRegreso=" + fechaRegreso + '}';
    }
    
}
