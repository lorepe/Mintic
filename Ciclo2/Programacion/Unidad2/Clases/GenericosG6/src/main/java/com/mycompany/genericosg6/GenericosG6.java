/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.genericosg6;

import java.util.Scanner;

/**
 *
 * @author lorep
 */
public class GenericosG6 {

    public static void main(String[] args) {
        
        var integerBox = new Box<Integer>();
        integerBox.setT(18);
        
        System.out.println("El numero del box es: "+ integerBox.getT());
        
        var StringBox = new Box<String>(); 
        
        StringBox.setT("Calletana");
        
        System.out.println("El nombre es: "+StringBox.getT());
        
        
        //Clase estudiante ... la identificacion y el nombre del estudiante 
        Scanner sc = new Scanner(System.in);
        
        var mapaEst= new Estudiante<Integer, String>();
        
        System.out.println("Digite la identificación del estudiante");
        mapaEst.setK(sc.nextInt());
        
        System.out.println("Digite el nombre del estudiante");
        sc.nextLine();
        mapaEst.setV(sc.nextLine());
        
        System.out.println("La identificacion del estudiante "+mapaEst.getV()+" es: "+mapaEst.getK());
        
        
        var mapaEst2 = new Estudiante<String, Double>();
        System.out.println("Por favor digite el nombre de la asignatura");
        mapaEst2.setK(sc.nextLine());
        
        System.out.println("Por favor digite la nota del estudiante");
        mapaEst2.setV(sc.nextDouble());
        
        System.out.println("El estudiante: "+mapaEst.getV()+" identificado con código número: "+mapaEst.getK()+" en la asignatura "+mapaEst2.getK()+ " tiene una nota de: "+mapaEst2.getV());
        
        
        
        
        
        
        
    }
}
