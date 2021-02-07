/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String nombreEquipo;
        double presupuestoAnual;
        String nombreEstadio;
        String cadenaAcumuladora = "";
        String opcion;
        try {
            do {
                System.out.println("Nombre del equipo de baloncesto: ");
                nombreEquipo = entrada.nextLine();
                System.out.println("Ingresar el presupuesto anual: ");
                presupuestoAnual = entrada.nextDouble();
                entrada.nextLine();
                System.out.println("Ingresar el nombre del estadio: ");
                nombreEstadio = entrada.nextLine();
                cadenaAcumuladora = String.format("%s%s, presupuesto %.1f; "
                        + "estadio %s\n", cadenaAcumuladora, nombreEquipo,
                        presupuestoAnual, nombreEstadio);
                System.out.println("Ingresar SI para ingresar mas datos: ");
                opcion = entrada.nextLine();
                opcion = opcion.toLowerCase();
                if (!opcion.equals("si")) {
                    bandera = false;
                }
            } while (bandera);
            EscribirArchivo.crearRegistro(cadenaAcumuladora);
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }

    }

}
