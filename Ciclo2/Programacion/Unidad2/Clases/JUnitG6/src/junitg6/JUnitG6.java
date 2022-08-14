/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package junitg6;

import java.util.Scanner;

/**
 *
 * @author lorep
 */
public class JUnitG6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        
        Suma suma = new Suma();
        System.out.println("Digite el número 1");
        suma.setNumero1(sc.nextInt());
        System.out.println("Digite el número 2");
        suma.setNumero2(sc.nextInt());
        
        System.out.println("La suma es: "+suma.sumar(suma.getNumero1(),suma.getNumero2()));
        
    }
    
}
