/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria.Procesamiento;

import java.util.ArrayList;
public class Leer {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        ArrayList<Object> libros = ManejadorArchivos.leerArchivo("Libros.poo");
        // tiratodoyaya
        if(libros != null){
            for(int i = libros.size()-1; i >= 0; i--) {
                ManejadorArchivos.eliminarObjeto("Libros.poo", i);
            }
        }
        //ola(sobreescribe*)
        ArrayList<Object> nuevosLibros = new ArrayList<>();
        nuevosLibros.add(new Libro("001", "Los malaventuradosnolloranPollos", "Ales", true));
        nuevosLibros.add(new Libro("002", "La sociedad de los pollos", "Ales", true));

        for(Object libro : nuevosLibros) {
            ManejadorArchivos.agregarObjeto("Libros.poo", libro);
            System.out.println(libro);
        }
        
        System.out.println("-------------------------------");
    }
    
}
