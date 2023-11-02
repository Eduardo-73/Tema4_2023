/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Veterinario {

    /*
    Pedir al usuario un número de animales que van a ser evaluados en el veterinario. 
    De cada animal vamos a guardar su peso, que vamos a pedir por teclado. 
    Una vez sepamos los pesos de todos los animales, queremos saber la media de todos los pesos, 
    cuantos animales hay por debajo de la media y cuantos por encima
    Si el usuario pone un peso negativo, se considerará positivo.
     */
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int numAnimales = pedirNumerosAnimales();//Creo una variable y le añado el nº de animales
        double[] pesoAnimales = new double[numAnimales];//Creo un array double y le añado el nº de animales
        String[] nombreArray = new String[numAnimales];//Creo un array String y le añado el nº de animales
        nombreAnimales(nombreArray);
        pesoAnimales(pesoAnimales);
        mostrarAnimales(pesoAnimales, nombreArray);
        double mediaAnimales = mediaPesoAnimales(pesoAnimales);
        encimaMedia(pesoAnimales, mediaAnimales, nombreArray);
    }

    //Pido por teclado el número de animales
    public static int pedirNumerosAnimales() {
        boolean repetir = true;
        int numAnimales = 0;
        do {
            System.out.println("Introduce el número de animales que van ha ser"
                    + " evaluados: ");
            try {
                numAnimales = teclado.nextInt();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("Debe de introducir números enteros ");
                teclado.nextLine();
            }
        } while (repetir);
        return numAnimales;
    }

    //Segun el nº de animales que haya se le pide 1 a 1 el peso
    public static double[] pesoAnimales(double[] array) {//Pido un array
        boolean repetir = true;
        double pesoAnimal = 0;
        System.out.println("Ahora tienes que introducir el peso ");
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.println("Introduce el peso del " + (i + 1) + "º animal");
                try {
                    pesoAnimal = teclado.nextDouble();
                    pesoAnimal = Math.abs(pesoAnimal);
                    repetir = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Debe de introducir válores correctos ");
                    teclado.nextLine();
                }
            } while (repetir);
            array[i] = pesoAnimal;//Meto el peso del animal en el array y lo devuelvo
        }
        return array;
    }

    public static String[] nombreAnimales(String[] array) {
        String nombre = " ";
        boolean repetir = true;
        teclado.nextLine();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime el nombre del " + (i + 1) + "º animal");
            nombre = teclado.nextLine();
            array[i] = nombre;
        }
        return array;
    }

    public static double mediaPesoAnimales(double[] peso) {
        double pesoTotal = 0, mediaPeso;
        for (int i = 0; i < peso.length; i++) {
            pesoTotal += peso[i];//Meto en pesoTotal el valor del array de peso[i]
        }
        mediaPeso = pesoTotal / peso.length;
        System.out.printf("\nLa media del peso es de: %.2fKg\n", mediaPeso);
        return mediaPeso;
    }

    public static void encimaMedia(double[] peso, double media, String[] nombre) {
        for (int i = 0; i < peso.length; i++) {
            if (peso[i] > media) {
                System.out.println("El animal con el nombre: " + nombre[i]
                        + " esta por encima de la media");
            } else {
                System.out.println("El animal con el nombre: " + nombre[i]
                        + " esta por debajo de la media");
            }
        }
    }

    public static void mostrarAnimales(double[] peso, String[] nombre) {
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Nombre: " + nombre[i] + " Peso: " + peso[i] + "kg");
        }
    }
}
