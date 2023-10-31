/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase01;

import java.util.Random;

/**
 *
 * @author eduar
 */
public class ClaseMain {

    public static void main(String[] args) {
        //Utilidades.arraysBooleano(2_000_000);
        ///*
        System.out.println("----------------------");
        boolean[] array = arrayBooleanos(10);
        rellenarArray(array);
        mostrarArray(array);
        contarCaras(array);
        if (saberSiHay10(array)) {
            System.out.println("Tiene 10 elementos");
        }
        //*/
    }

    //Forma de Vico
    public static void contarCaras(boolean[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                contador++;
            }
        }
        System.out.println("El número de caras es: " + contador);
    }

    public static boolean[] arrayBooleanos(int tamanio) {
        boolean[] array = new boolean[tamanio];
        return array;
    }

    public static void rellenarArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextBoolean();
        }
    }

    public static void mostrarArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] ? "Cara" : "Cruz");
        }
    }

    public static boolean saberSiHay10(boolean[] array) {
        boolean dato = false;
        return dato = array.length == 10;
    }
}
