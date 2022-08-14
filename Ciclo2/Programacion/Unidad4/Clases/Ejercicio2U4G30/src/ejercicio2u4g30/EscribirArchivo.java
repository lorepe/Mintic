/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2u4g30;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author lorep
 */
public class EscribirArchivo {

    public void escribir(String ruta,  String frase) {
        //String frase = "Esto es una prueba de escritura en Java";

        try {
            FileWriter escritura = new FileWriter(ruta);

            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));

            }
            JOptionPane.showMessageDialog(null,"Archivo escrito exitosamente");
            // System.out.println("Archivo escrito exitosamente");
            escritura.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"El archivo NO se pudo escribir");
            //System.out.println("El archivo no pudo ser escrito");
        }
    }
}
