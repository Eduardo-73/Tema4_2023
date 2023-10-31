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
public class Utilidades {

    public static boolean[] arraysBooleano(int tamanio) {
        int contadorCruz = 0, contadorCara = 0;
        boolean[] caraCruz = new boolean[tamanio];
        for (int i = 0; i < caraCruz.length; i++) {
            if (caraCruz[i] = new Random().nextBoolean()) {
                contadorCara++;
            } else {
                contadorCruz++;
            }
        }
        for (int i = 0; i < caraCruz.length; i++) {
            System.out.println(caraCruz[i] ? "Cara" : "Cruz");
        }
        System.out.println("""
                           -------------------------
                            Contador de Cara y Cruz
                           -------------------------
                            Cara: %d 
                           
                            Cruz: %d
                           _________________________
                             """.formatted(contadorCara,
                contadorCruz));
        return caraCruz;
    }
}
