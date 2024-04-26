package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDateTime;

public class Prueba {
    public static void main(String[] args) {

        //Instanciar un ejemplar de cada tipo de vehiculo
        Camion camion1 = new Camion();
        camion1.disponibilidad = true;

        //Crear un objeto viaje
        Viaje viaje1 = new Viaje();
        viaje1.fechaInicio = LocalDateTime.of(2024, 4, 25, 22, 30, 0);
        viaje1.fechaFin = LocalDateTime.of(2024, 4, 28, 6, 30, 0);

        //Establecer el viaje del camion
        CamionRemolque camionRe1 = new CamionRemolque();
        camionRe1.capacidadCargaExtra = 9;
        camionRe1.viaje1 = viaje1;

        System.out.println("El viaje del camion " + "Tiene una fecha de inicio de: " + camionRe1.viaje1.fechaFin);
    }
}
