/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2u4g30;

import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author lorep
 */
public class LeerArchivo {
    public void leer(String ruta){
        
        try{
            FileReader entrada = new FileReader(ruta);
        
        int archivo = 0;
        String frase_final ="";
        
       
        //Casting conversioin entre datos primitivos
        //System.out.println((char)archivo);
        
        
        //Final de un archivo de texto -1
        while(archivo!= -1){
            archivo= entrada.read();
            char letra = (char) archivo;
            if(letra >=97 & letra<=122){
                letra -=32;
                
            }else if(letra >=65 & letra<=90){
                letra +=32;
            }
            frase_final+=letra;
            JOptionPane.showMessageDialog(null,frase_final);
        }
        
        
        }catch(IOException e){
            System.out.println("No se pudo encontrar el archivo");
        }
    }
    
}