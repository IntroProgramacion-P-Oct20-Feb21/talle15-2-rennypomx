/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Formatter;

/**
 *
 * @author reroes
 */
public class EscribirArchivo {

    public static void crearRegistro(String pais[], String capital[],
            int poblacion[]) {
        String cadena = "";
        try {
            Formatter salida = new Formatter("data/registroPaises.txt");
            for (int cont = 0; cont < pais.length; cont++) {
                cadena = String.format("%s%s, con capital %s tiene una "
                        + "población de %d\n",
                        cadena, pais[cont], capital[cont],
                        poblacion[cont]);
            }
            salida.format("%s\n", cadena);
            salida.close();
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

}
