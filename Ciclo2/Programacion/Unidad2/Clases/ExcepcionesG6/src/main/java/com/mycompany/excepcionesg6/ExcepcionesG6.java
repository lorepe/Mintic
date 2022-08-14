/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.excepcionesg6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lorep
 */
public class ExcepcionesG6 {

    public static void main(String[] args) {

        boolean continuar = true;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite un número entero");
                int numero = sc.nextInt();
                System.out.println("Digite otro número entero");
                int numero2 = sc.nextInt();
                System.out.println("La división esacta es: " + (numero2 / numero2));
                System.out.println("Terminó de llenar todo");
                continuar = false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor no digite letras, digite números o una opcion válida");
            } catch (ArithmeticException e) {
                System.out.println("La división entre cero no existe, por favor digite un divisor diferente a cero");
            } finally {
                System.out.println("El sistema debe reiniciarse o gracias por utilizar el sistema");
            }
        } while (continuar);

    }
}
