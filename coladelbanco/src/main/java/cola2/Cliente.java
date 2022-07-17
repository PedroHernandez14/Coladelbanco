package cola2;

import java.io.BufferedReader;
import java.util.Scanner;

/* Esta clase se usa para declarar los datos que se manejaran a travez de la cola 
si se desea encanzular alguno pueden hacerlo en este apartado  */

public class Cliente {
    String Nombre;
    Integer Edad;
    Boolean Discapacidad=false;
    Integer Posicion;
    operaciones operaciones;
    public Cliente(String nombre) {
        Nombre = nombre;
        
    }
    void asignardiscapacidad(Cliente i, boolean disc){
        i.Discapacidad=true;
    }

    
}

/*
 * Alfinal no se como van a porner el formato
 * fecha para las entradas de los usuarios pero aqui hiria
 */
