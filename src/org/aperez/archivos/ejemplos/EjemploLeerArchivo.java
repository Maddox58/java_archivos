package org.aperez.archivos.ejemplos;

import org.aperez.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {

    public static void main(String[] args) {

        String nombreArchivo = "/home/brm00000/proyectos-java/br/java.txt";

        ArchivoServicio servico = new ArchivoServicio();
        System.out.println(servico.leerArchivo2(nombreArchivo));

    }
}
