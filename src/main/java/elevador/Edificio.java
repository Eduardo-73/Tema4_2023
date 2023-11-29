/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

import java.time.LocalDateTime;

/**
 *
 * @author eduar
 */
public class Edificio {

    public static void main(String[] args) {

        Elevador e1 = new Elevador("Samsung", 5,
                250);
        System.out.println(e1);

        System.out.println(e1.mover(2, 50, Planta.PLANTA_CERO));
    }
}
