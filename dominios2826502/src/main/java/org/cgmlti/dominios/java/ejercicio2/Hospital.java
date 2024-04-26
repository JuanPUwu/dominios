package org.cgmlti.dominios.java.ejercicio2;

// Importar dependecias
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    String nombre, direccion;
    Long telefono;

    /*
    Crear lista de medicos:
    tambien es un atributo de los objetos hospital
    */

    List<Medico> listaMedicos = new ArrayList<>();
    List<Sala> listaSalas = new ArrayList<>();
}
