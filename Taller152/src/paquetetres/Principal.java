/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        String cadenaFinal;

        String[] libros = {"El camino a un mejor programador",
            "Scrum & eXtreme Programming",
            "Lógica de programación",
            "Metodología programación orientada a objetos",
            "Java Como Programar",
            "Python 3 al descubierto"};
        String[] autores = {"Anónimo",
            "Eugenia Bahit",
            "Omar Iván Trejos Buriticá",
            "López Román Leobardo",
            "Dietel, P. y Dietel, H",
            "Fernández Arturo"};
        int[] clave1 = {2, 1, 0, 2, 0, 1};
        int[] clave2 = {1, 1, 1, 2, 2, 0};
        int[][] identificativoLibro = {
            {8761, 12334, 34567},
            {65431, 43211, 7890},
            {123890, 12344, 2345}
        };
        for (int cont = 0; cont < libros.length; cont++) {
            System.out.printf("%s opción %d\n",
                    libros[cont], cont);
        }
        op = entrada.nextInt();
        try {
            if ((op < 5) && (op > 0)) {
                cadenaFinal = String.format("Se le presta el libro %s cuyo autor "
                        + "es %s y tiene un identificativo de %d",
                        libros[op], autores[op],
                        identificativoLibro[clave1[op]][clave2[op]]);
                EscribirArchivo.craerRegistro(cadenaFinal);
                System.out.printf("%s\n", cadenaFinal);
            } else {
                throw new Exception("Número fuera de rango");
            }

        } catch (Exception e) {
            System.out.printf("Error %s.\n", e);
        }

    }

}
