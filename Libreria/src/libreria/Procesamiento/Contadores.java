
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Procesamiento;

/**
 *
 * @author samuel
 */
public class Contadores {
    private static int prestamos;
    private static int devoluciones;

    public static int getPrestamos() {
        return prestamos;
    }

    public static void setPrestamos(int prestamos) {
        Contadores.prestamos = prestamos;
    }

    public static int getDevoluciones() {
        return devoluciones;
    }

    public static void setDevoluciones(int devoluciones) {
        Contadores.devoluciones = devoluciones;
    }
    
}