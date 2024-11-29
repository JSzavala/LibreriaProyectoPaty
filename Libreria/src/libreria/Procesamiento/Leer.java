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
        ArrayList<Object> solicitantes = ManejadorArchivos.leerArchivo("Solicitantes.poo");
        // tiratodoyaya
        if (solicitantes != null) {
            for (int i = solicitantes.size() - 1; i >= 0; i--) {
                ManejadorArchivos.eliminarObjeto("Solicitantes.poo", i);
            }
            System.out.println("que");
        }
        
        //ola(sobreescribe*)
        Solicitantes jiji = new Solicitantes("jiji");

        ArrayList<Object> nuevosSolicitantes = new ArrayList<>();
        nuevosSolicitantes.add(new Solicitantes("robesgay"));
        nuevosSolicitantes.add(new Solicitantes("paque"));
        
        for (Object soli : nuevosSolicitantes) {
            ManejadorArchivos.agregarObjeto("Solicitantes.poo", soli);
            System.out.println(soli);
        }
        System.out.println("-------------------------------");
    }

}
