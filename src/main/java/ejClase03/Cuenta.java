/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejClase03;

/**
 *
 * @author edu
 */
public class Cuenta {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Eduardo", "78992446G",
                1450, 0.5);
        // NºCuenta
        System.out.println("El número de cuenta del cliente es: " + c1.getNumCuenta());
        System.out.println(c1);
        // Ingreso dinero
        c1.ingresar(500);
        System.out.println(c1);
        // Retiro dinero con una cantidad mayor a la que hay
        c1.retirar(2000);
        System.out.println(c1);// No cambia ya que la cantidad es mayor a la que tengo
        // Retiro dinero con una cantidad menor a la que hay
        c1.retirar(250);
        System.out.println(c1);
        // Incremento el interes
        c1.abonarIntereses(0.7);
        System.out.println(c1);
    }
}
