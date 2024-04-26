package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        
        /*
        Crear 2 instancias en cada entidad 
        Intanciar 2 veces cada entidad
        Crear 2 objetos de cad entidad
        1. Nombre de la clase a instanciar
        2. Nombre que se quiere dar al objeto "Hospital"
        3. Operador de asignacion
        4. Palabra(referencia) new
        5. Otra vez el nombre de la clase 
        6. parentesis
        */

        Hospital hospital1 = new Hospital();
        Hospital hospital2 = new Hospital();

        /*
        Acceder a atributos del operador:
        1. Identificar el objeto
        2. El punto
        3. El atributo a trabajar
        4. El operador de asignacion
        5. Valor a asignar
        */
        hospital1.direccion = "Calle 74a #82-12";
        hospital2.nombre = "San Marino";
        hospital2.telefono = 3133585900L;


        /*


        Crear medico


        */
        Medico medico1 = new Medico();
        medico1.numeroCedula = 1116542549L;
        medico1.nombre = "Pablo Rivas Alfonso";
        medico1.especialidad = "Cardiologia";

        Medico medico2 = new Medico(); 
        medico2.especialidad = "Odontologia";
        medico2.nombre = "Carlos Ferney Roa Gutierrez";
        medico2.numeroCedula = 1082768355L;

        //Añadir medicos al hospital
        hospital1.listaMedicos.add(medico1);
        hospital1.listaMedicos.add(medico2);

        //Recorrer la lista de medicos
        //del hospital1;
        for(Medico MedicoRecorrer : hospital1.listaMedicos){
            System.out.println("Medico: " + 
            MedicoRecorrer.numeroCedula);
        }
        

        /*


        Crear Sala


        */
        Sala sala1 = new Sala();
        sala1.cantidadCamas = 5;
        sala1.numero = 1;

        Sala sala2 = new Sala();
        sala2.cantidadCamas = 5;
        sala2.numero = 2;

        //Añadir salas al hospital
        hospital1.listaSalas.add(sala1);
        hospital1.listaSalas.add(sala2);

        //Recorrer la lista de salas
        //del hospital1;
        for(Sala SalaRecorrer : hospital1.listaSalas){
            System.out.println("Sala: " + 
            SalaRecorrer.numero);
        }
    }
}
