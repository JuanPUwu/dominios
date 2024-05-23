package org.cgmlti.dominios.java.ejerciciosPractica1;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de valores
        System.out.print("Ingrese el número de valores a comparar: ");
        int cantidadValores = input.nextInt();

        // Validar que la cantidad de valores sea mayor que cero
        while (cantidadValores <= 0) {
            System.out.println("Por favor ingrese un número mayor que cero.");
            System.out.print("Ingrese el número de valores a comparar: ");
            cantidadValores = input.nextInt();
        }

        // Inicializar el valor del menor con un número grande
        int menor = Integer.MAX_VALUE;

        // Iterar sobre cada valor ingresado por el usuario
        for (int i = 0; i < cantidadValores; i++) {
            System.out.print("Ingrese el valor #" + (i + 1) + ": ");
            int valor = input.nextInt();
            // Actualizar el valor del menor si se encuentra uno más pequeño
            if (valor < menor) {
                menor = valor;
            }
        }
        System.out.println("El menor de los valores ingresados es: " + menor);

        // Cerrar el Scanner
        input.close();
    }
}
