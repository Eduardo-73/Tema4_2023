/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase02;

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
        int numAnimales = pedirNumerosAnimales();
        double[] pesoAnimales = new double[numAnimales];
        String[] nombreArray = new String[numAnimales];
        nombreAnimales(nombreArray);
        pesoAnimales(pesoAnimales);
        mostrarAnimales(pesoAnimales, nombreArray);
        mediaPesoAnimales(pesoAnimales, numAnimales);

    }

    public static int pedirNumerosAnimales() {
        System.out.println("Introduce el número de animales que van ha ser"
                + " evaluados: ");
        int numAnimales = teclado.nextInt();
        return numAnimales;
    }

    public static double[] pesoAnimales(double[] array) {
        double pesoAnimal = 0, mediaPesos = 0, sumaPesos = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el peso del " + (i + 1) + "º animal");
            pesoAnimal = teclado.nextDouble();
            array[i] = pesoAnimal;
        }
        return array;
    }

    public static String[] nombreAnimales(String[] array) {
        String nombre = " ";
        teclado.nextLine();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime el nombre del " + (i + 1) + "º animal");
            nombre = teclado.nextLine();
            array[i] = nombre;
        }
        return array;
    }

    public static void mediaPesoAnimales(double[] peso, int numAnimales) {
        double pesoTotal = 0, mediaPeso;
        for (int i = 0; i < peso.length; i++) {
            pesoTotal = peso[i];
            pesoTotal += pesoTotal;
        }
        mediaPeso = pesoTotal / numAnimales;
        System.out.println("\nLa media del peso es de: " + pesoTotal + "Kg");
    }

    public static void mostrarAnimales(double[] peso, String[] nombre) {

        for (int i = 0; i < nombre.length; i++) {
            System.out.print(nombre[i] + " - ");
        }
        System.out.println(" ");
        for (int i = 0; i < peso.length; i++) {
            System.out.print(peso[i] + "Kg" + " - ");
        }
    }
}
