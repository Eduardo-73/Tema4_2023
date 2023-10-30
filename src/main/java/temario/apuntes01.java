/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author edu
 */
public class apuntes01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //Acceso a un método estático público de otra clase
        //Se usa el nombre de la clase (.) nombre del método
        /*
        int numero = Utilidades.filtrarDatosInt(6, 10);
        System.out.println("El número es " + numero);
       
        System.out.println("Vamos ha crear aleatorios entre dos números int ");
        System.out.println("Introduce el 1º número: ");
        int dato1 = Utilidades.solicitarDatoInt();
        System.out.println("Introduce el 2º número: ");
        int dato2 = Utilidades.solicitarDatoInt();

        int aleatorio = Utilidades.enteroAleatorio(dato1, dato2);
        System.out.println("El número aleatorio es: " + aleatorio);
         */
        //Crear un array de 100 elementos aleatorios de tipo int 
        int[] arrayAleatorios = new int[100];
        int numeroMenor = 10;
        int numeroMayor = 2_000;
        //Rellenar el array con aleatorios 10 y 2000
        for (int i = 0; i < arrayAleatorios.length; i++) {
            arrayAleatorios[i] = Utilidades.enteroAleatorio(numeroMenor,
                    numeroMayor);
        }
        for (int i = 0; i < arrayAleatorios.length; i++) {
            System.out.println("Nº" + (i + 1) + " - " + arrayAleatorios[i]);
        }
    }
}
