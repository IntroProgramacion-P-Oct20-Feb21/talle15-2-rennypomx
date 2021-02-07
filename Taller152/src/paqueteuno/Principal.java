/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        String[] paises = {"Ecuador", "Colombia", "Perú", "Venezuela", "Chile",
            "Bolivia"};
        String[] capitales = {"Quito", "Bogotá", "Lima", "Caracas", "Santiago",
            "La Paz"};
        int[] poblacion = {17643054, 51152371, 33050325, 28435940, 19116201,
            11673021};
        EscribirArchivo.crearRegistro(paises, capitales, poblacion);

    }

}
