/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionararchivosg30;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lorep
 */
public class LeerArchivo {
    public void leer(){
        
        try{FileReader entrada = new FileReader("D:\\MINTIC\\Ciclo2\\Programacion\\Unidad4\\Clases\\ejercicio.txt");
        
        int archivo = 0;
       
        //Casting conversioin entre datos primitivos
        //System.out.println((char)archivo);
        
        
        //Final de un archivo de texto -1
        while(archivo!= -1){
            archivo= entrada.read();
            char letra = (char) archivo;
            System.out.print(letra);
        }
        
        
        }catch(IOException e){
            System.out.println("No se pudo encontrar el archivo");
        }
    }
    
}
