package org.aperez.archivos.ejemplos;

import org.aperez.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "/home/brm00000/proyectos-java/br/java.txt";

        ArchivoServicio services = new ArchivoServicio();
        services.crearArchivo(nombreArchivo);
    }
}
