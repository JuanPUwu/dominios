package org.cgmlti.dominios.java.ejerciciosPractica1;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int conA = 0, conB = 0, conC = 0, conD = 0;
        String letra;

        System.out.print("Ingrese las notas a contar: ");
        System.out.println();

        // Repetición controlada por centinela
        while (true) {
            // Ingresar nota
            letra = input.next();

            // Verificar si el usuario quiere ver el conteo
            if (letra.equals("n")) {
                break; // Salir del bucle si se ingresa 'n'
            }

            // Verificar si la entrada es una letra válida (A, B, C o D)
            if (letra.equals("A") || letra.equals("B") || letra.equals("C") || letra.equals("D")) {
                switch (letra) {
                    case "A":
                        conA++;
                        break;
                    case "B":
                        conB++;
                        break;
                    case "C":
                        conC++;
                        break;
                    case "D":
                        conD++;
                        break;
                }
            } else {
                System.out.println("Nota inválida. Ingrese A, B, C o D.");
                continue; // Volver a solicitar una nuevo la letra
            }
        }

        // Mostrar el conteo de notas
        System.out.println("Conteo de notas:");
        System.out.println("A = " + conA);
        System.out.println("B = " + conB);
        System.out.println("C = " + conC);
        System.out.println("D = " + conD);

        input.close();
    }
}
