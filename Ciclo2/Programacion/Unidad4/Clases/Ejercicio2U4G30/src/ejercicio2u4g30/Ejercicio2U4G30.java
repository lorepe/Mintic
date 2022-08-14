/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2u4g30;

import javax.swing.JOptionPane;

/**
 *
 * @author lorep
 */
public class Ejercicio2U4G30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = JOptionPane.showInputDialog("Introduce la ruta del archivo");
        String frase = JOptionPane.showInputDialog("Introduce la frase a escribir en el archivo");
        
        
        EscribirArchivo escribirA = new EscribirArchivo();
        escribirA.escribir(ruta, frase);
        
        LeerArchivo leerA = new LeerArchivo();
        leerA.leer(ruta);
        
        
        
    }
    
}
