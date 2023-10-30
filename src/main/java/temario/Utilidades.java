/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Utilidades {

    //Método de clase público (visible por otras clases)
    //Static no necesita de la clase Utilidades
    //Devuelve un tipo int -> return dentro del método
    //nombre del método
    //El metodo no tiene parámetros
    public static int solicitarDatoInt() {
        Scanner teclado = new Scanner(System.in);

        boolean seguir = true;
        int dato = 0;

        do {
            System.out.println("Introduce un número: ");
            try {
                dato = teclado.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un número... ");
            }
            teclado.nextLine();
        } while (seguir);
        return dato;
    }

    //Métodos que filtran datos enteros entre menor y mayor
    public static int filtrarDatosInt(int menor, int mayor) {
        int numero = 0;
        do {
            //Al usar un método que está dentro de la propia clase
            //no es necesario poner el nombre de la clase
            //numero = Utilidades.solicitarDatoInt
            numero = solicitarDatoInt();
            if (numero > mayor || numero < menor) {
                System.out.println("El número no está en el rango "
                        + menor + " - " + mayor);
            }
            //Númnero no sea mayor que menor y menor que mayor
            //No está en un rango válido
        } while (!(numero > menor && numero < mayor));
        return numero;
    }

    public static int enteroAleatorio(int menor, int mayor) {
        
        Random random = new Random();

        return random.nextInt(menor, mayor + 1);
    }
}
