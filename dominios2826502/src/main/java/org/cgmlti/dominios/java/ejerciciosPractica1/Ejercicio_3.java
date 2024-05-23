package org.cgmlti.dominios.java.ejerciciosPractica1;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //#1
        int suma = 0; //Variable suma donde se almacenara el resultado de cada resultado

        for(int i = 1; i <= 99; i += 2){ //(declara variable/indica la condicion para que el ciclo se realice/indica que hacer despues de terminar el ciclo)
            suma += i; //hace la suma del nuevo numero mas lo que hay almacenado
        }
        System.out.println("La suma de los numeros impares del 1 al 99 es: " + suma);

        //#2
        //int suma = 0;
        
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) { //Si el numero dividido 2 da un residuo diferente de 0 significa que es impar
                suma += i;
            }
        }
        System.out.println("La suma de los números impares del 1 al 99 es: " + suma);
    }
    
}
