/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase04;

/**
 *
 * @author edu
 */
public class Cliente {

    public static void main(String[] args) {

        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(500);
        Cafetera c3 = new Cafetera(200, 150);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Llenar cafetera");
        c1.llenarCafetera();
        c2.llenarCafetera();
        c3.llenarCafetera();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Servir cafe");
        c1.servirCafe(2000);
        c2.servirCafe(2000);
        c3.servirCafe(2000);
        System.out.println(c1.getCantidadActual());
        System.out.println(c2.getCantidadActual());
        System.out.println(c3.getCantidadActual());
        System.out.println("Servir cafe");
        c1.servirCafe(200);
        c2.servirCafe(200);
        c3.servirCafe(200);
        System.out.println(c1.getCantidadActual());
        System.out.println(c2.getCantidadActual());
        System.out.println(c3.getCantidadActual());
        System.out.println("Vaciar cafetera");
        c1.vaciarCafetera();
        c2.vaciarCafetera();
        c3.vaciarCafetera();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Agregar cafe");
        c1.agregarCafe(2000);
        c2.agregarCafe(2000);
        c3.agregarCafe(2000);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Agregar cafe");
        c1.agregarCafe(200);
        c2.agregarCafe(200);
        c3.agregarCafe(200);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
