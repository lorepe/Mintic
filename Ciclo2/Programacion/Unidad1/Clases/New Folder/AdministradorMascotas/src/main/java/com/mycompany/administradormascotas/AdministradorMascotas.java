/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.administradormascotas;

import Clases.Mascota;
import java.util.Date;

/**
 *
 * @author lorep
 */
public class AdministradorMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mascota m1 = new Mascota();
        m1.setCodigo("001");
        m1.setNombre("Troski");
        m1.setAnnio_nac(2000);
        m1.setRaza("Criollo");
        m1.setColor("Blanco");
        m1.setEstado_salud("Saludable");

        Mascota m2 = new Mascota("002", "Laika", 2019, "Husky", "Mato negro", "Saludable");

        Date fecha_actual = new Date();
        int annio_actual = fecha_actual.getYear();

        int edad_m1 = annio_actual - m1.getAnnio_nac();
        int edad_m2 = annio_actual - m2.getAnnio_nac();

        if (edad_m1 > edad_m2) {
            System.out.println("La mascota " + m1.getNombre() + " es mayor");
        } else {
            if (edad_m2 > edad_m1) {
                System.out.println("La mascota " + m2.getNombre() + " es mayor");
            } else {
                System.out.println("Tienen la misma edad");
            }
        }

    }

}
