package org.cgmlti.dominios.java.ejerciciosPractica1;

import java.util.Scanner; 

public class Ejercicio_1 {
    public static void main(String[] args) {

        //Defino el scanner que se va usar para ingresar el numero a sacar la tabla de multiplicar
        Scanner input = new Scanner(System.in); //Defino el scanner que se va a usar
        
        //Solicitar al usuario que ingrese el numero a mostrar la tabla de multiplicar
        System.out.println("¿Cual es el numero del cual desea saber su tabla de multiplicar?");
        int numero = input.nextInt();

        //Utilizando FOR para crear el ciclo
        System.out.println("La tabla de multiplicar del " + numero + " es:");
        for(int multiplicador = 1; multiplicador <= 10; multiplicador += 1){
            int operacion = numero * multiplicador; //Declarando la operacion que se va realizar
            System.out.println(numero + " x " + multiplicador + " = " + operacion);
        }
        

        //Utilizando WHILE para crear el ciclo
        int multiplicador = 1;
        System.out.println("La tabla de multiplicar del " + numero + " es:");
        while (multiplicador <= 10) {
            int operacion = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + operacion);
            multiplicador += 1;
        }
        

        //Utilizando DO WHILE
        /*
        int multiplicador = 1;
        System.out.println("La tabla de multiplicar del " + numero + " es:");
        do{//Hacer que
            int operacion = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + operacion);
            multiplicador += 1;
        }while(multiplicador <= 10); //Cuando
        */  
        input.close(); //Cerrar Scanner
    }
}
