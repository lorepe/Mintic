/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionararchivosg30;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lorep
 */
public class EscribirArchivo {
    
    public  void escribir(){
    String frase = "Esto es una prueba de escritura en Java";
    
    try{
        FileWriter escritura = new FileWriter("D:\\MINTIC\\Ciclo2\\Programacion\\Unidad4\\Clases\\ejercicioEscibir.txt");
        
        for (int i = 0; i < frase.length(); i++) {
            escritura.write(frase.charAt(i));
            
        }
        System.out.println("Archivo escrito exitosamente");
        escritura.close();
        
    }catch(IOException e){
        System.out.println("El archivo no pudo ser escrito");
    }
    }
}
