/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temario;

/**
 *
 * @author edu
 */
public class Programa {

    public static void main(String[] args) {

        PartesDias dia;

        dia = PartesDias.MADRUGADA;

        PartesDias[] todas = PartesDias.values();
        for (int i = 0; i < todas.length; i++) {
            System.out.println(todas[i]);
        }

        Comedor nuevo = new Comedor("IES Mar de Alboran", 4,
                PartesDias.MAÑANA);
        System.out.println("El comedir" + nuevo.getNombre() + " comienza su servicio "
                + nuevo.getHorario().getHoraInicio());
    }
}
