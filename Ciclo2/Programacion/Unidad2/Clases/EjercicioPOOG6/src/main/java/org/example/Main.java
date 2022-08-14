package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de Clientes para ingresar al sistema");
        int nC = sc.nextInt();
        //Crear una instancia de clase tipo Array

        Cliente[] clientes = new Cliente[nC];
        sc.nextLine();
        for (int i = 0; i < nC; i++) {
            System.out.println("Digite el nombre del Cliente " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.println("El cliente " + nombre + " es cliente VIP (true o false) ");
            boolean vip = sc.nextBoolean();
            clientes[i] = new Cliente(new Date(), vip);
            clientes[i].setNombre(nombre);
            sc.nextLine();
        }

        //Mostrar los Clientes que ingresamos
        for (int i = 0; i < nC; i++) {
            System.out.println(clientes[i].toString());
        }


    }
}