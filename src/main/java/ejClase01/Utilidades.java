/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase01;

/**
 *
 * @author eduar
 */
public class Utilidades {

    public static boolean[] arraysBooleano() {
        int contadorCruz = 0, contadorCara = 0;
        int tamanio = 2000000;
        boolean[] caraCruz = new boolean[tamanio];
        for (int i = 0; i < tamanio; i++) {
            if (i % 2 == 0) {
                caraCruz[i] = true;
                contadorCara++;
            } else {
                caraCruz[i] = false;
                contadorCruz++;
            }
        }
        for (int i = 0; i < tamanio; i++) {
            System.out.println(caraCruz[i] ? "Cara" : "Cruz");
        }
        System.out.println("""
                            Cara: %d 
                            Cruz: %d
                             """.formatted(contadorCara,
                contadorCruz));
        return caraCruz;
    }
}
