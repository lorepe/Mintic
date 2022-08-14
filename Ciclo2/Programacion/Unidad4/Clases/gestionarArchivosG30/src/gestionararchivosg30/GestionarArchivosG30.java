/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionararchivosg30;

/**
 *
 * @author lorep
 */
public class GestionarArchivosG30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LeerArchivo acceder = new LeerArchivo();
        
        acceder.leer();
        
        EscribirArchivo escribirA = new EscribirArchivo();
        escribirA.escribir();
    }
    
}
